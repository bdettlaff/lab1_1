/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Objects;

public class OfferItem {

    public Money getTotalCost() {
        return totalCost;
    }

    public Discount getDiscount() {
        return discount;
    }

    public ProductSnapshot getProductSnapshot() {
        return productSnapshot;
    }

    private Money totalCost;
    private Discount discount;
    private ProductSnapshot productSnapshot;


    public OfferItem(Money money, Discount discount, ProductSnapshot productSnapshot) {
        this.totalCost = money;
        this.discount = discount;
        this.productSnapshot = productSnapshot;
        this.totalCost.setPrice(calculatePriceWithDiscount(productSnapshot,discount));
    }

    public BigDecimal calculatePriceWithDiscount(ProductSnapshot productSnapshot, Discount discount) {
        BigDecimal discountValue = new BigDecimal(0);
        if (discount != null) {
            discountValue = discountValue.subtract(discount.getDiscount().getPrice());
        }

        return productSnapshot.getPrice().getPrice().multiply(new BigDecimal(productSnapshot.getQuantity()))
                                     .subtract(discountValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCost,discount,productSnapshot);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        OfferItem other = (OfferItem) obj;
        return Objects.equals(totalCost, other.totalCost)
               && Objects.equals(discount, other.discount)
                && Objects.equals(productSnapshot, other.productSnapshot);
    }

    public boolean isSameAs(OfferItem other, double delta) {
        if (productSnapshot.equals(other.productSnapshot)) {
            return false;
        }

        BigDecimal max;
        BigDecimal min;
        if (totalCost.getPrice().compareTo(other.totalCost.getPrice()) > 0) {
            max = totalCost.getPrice();
            min = other.totalCost.getPrice();
        } else {
            max = other.totalCost.getPrice();
            min = totalCost.getPrice();
        }

        BigDecimal difference = max.subtract(min);
        BigDecimal acceptableDelta = max.multiply(BigDecimal.valueOf(delta / 100));

        return acceptableDelta.compareTo(difference) > 0;
    }

}
