package ru.countrystuff.model;

/**
 * Created by RAMSES on 29.03.2016.
 */
public class Item extends AbstractNamedEntity {
    private Vendor vendor;
    private ItemCategory itemCategory;
    private String description;
    private String image;
    private Double price;

    protected Item(Integer id, String name,Vendor vendor, ItemCategory itemCategory, String description, String image, Double price) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.itemCategory = itemCategory;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public static Item createExisting(Integer id, String name,Vendor vendor, ItemCategory itemCategory, String description, String image, Double price) {
        return new Item(id, name, vendor, itemCategory, description, image, price);
    }

    public Vendor getVendor() {
        return vendor;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name=" + name +
                ", vendor=" + vendor +
                ", itemCategory=" + itemCategory +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                "} ";
    }
}
