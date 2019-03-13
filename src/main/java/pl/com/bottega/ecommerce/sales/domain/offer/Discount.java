package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    public String getDiscountCause() {
        return discountCause;
    }

    public Money getDiscount() {
        return discount;
    }

    private String discountCause;
    private Money discount;
}
