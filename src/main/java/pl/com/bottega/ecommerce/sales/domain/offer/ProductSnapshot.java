package pl.com.bottega.ecommerce.sales.domain.offer;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class ProductSnapshot {

    private String id;

    private Money price;

    private String name;

    private Date snapshotDate;

    private String type;

    private int quantity;

    public ProductSnapshot(String id, Money price, String name, Date snapshotDate, String type, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.type = type;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public Money getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSnapshot that = (ProductSnapshot) o;

        return new EqualsBuilder().append(quantity, that.quantity)
                                  .append(id, that.id)
                                  .append(price, that.price)
                                  .append(name, that.name)
                                  .append(snapshotDate, that.snapshotDate)
                                  .append(type, that.type)
                                  .isEquals();
    }

    @Override public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                                          .append(price)
                                          .append(name)
                                          .append(snapshotDate)
                                          .append(type)
                                          .append(quantity)
                                          .toHashCode();
    }
}
