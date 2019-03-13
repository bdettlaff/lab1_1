package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private String currency;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private BigDecimal price;

    public Money(String currency, BigDecimal price){
        this.currency = currency;
        this.price = price;
    }


}
