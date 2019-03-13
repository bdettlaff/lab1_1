package pl.com.bottega.ecommerce.sales.domain.offer;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Money money = (Money) o;

        return new EqualsBuilder().append(currency, money.currency).append(price, money.price).isEquals();
    }

    @Override public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currency).append(price).toHashCode();
    }
}
