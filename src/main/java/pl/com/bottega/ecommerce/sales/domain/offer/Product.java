package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

    public String getId() {
        return Id;
    }

    public Money getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }

    public Date getSnapshotDate() {
        return SnapshotDate;
    }

    public String getType() {
        return Type;
    }

    public int getQuantity() {
        return quantity;
    }

    private String Id;

    private Money Price;

    private String Name;

    private Date SnapshotDate;

    private String Type;

    private int quantity;

}
