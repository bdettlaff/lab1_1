package pl.com.bottega.ecommerce.sales.domain.offer;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Discount {

    public String getDiscountCause() {
        return discountCause;
    }

    public Money getDiscount() {
        return discount;
    }

    public Discount(String discountCause, Money discount) {
        this.discountCause = discountCause;
        this.discount = discount;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Discount discount1 = (Discount) o;

        return new EqualsBuilder().append(discountCause, discount1.discountCause).append(discount, discount1.discount).isEquals();
    }

    @Override public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discountCause).append(discount).toHashCode();
    }

    private String discountCause;
    private Money discount;
}
