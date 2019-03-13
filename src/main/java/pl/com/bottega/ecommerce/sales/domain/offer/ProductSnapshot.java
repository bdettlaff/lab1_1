package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class ProductSnapshot {

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

    private String id;

    private Money price;

    private String name;

    private Date snapshotDate;

    private String type;

    private int quantity;

     if (productPrice == null) {
        if (other.productPrice != null) {
            return false;
        }
    } else if (!productPrice.equals(other.productPrice)) {
        return false;
    }
        if (productName == null) {
        if (other.productName != null) {
            return false;
        }
    } else if (!productName.equals(other.productName)) {
        return false;
    }

        if (productId == null) {
        if (other.productId != null) {
            return false;
        }
    } else if (!productId.equals(other.productId)) {
        return false;
    }
        if (productType != other.productType) {
        return false;
    }

        if (quantity != other.quantity) {
        return false;
    }

}
