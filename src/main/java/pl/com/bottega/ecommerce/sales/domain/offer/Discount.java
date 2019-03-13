package pl.com.bottega.ecommerce.sales.domain.offer;

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

    private String discountCause;
    private Money discount;
}
