package model;

public class Product {
    private int id;
    private String name;
    private int inventory;   //hàng tồn kho
    private int sold;         // hàng đã bán ra

    public Product() {
    }

    public Product(int id, String name, int inventory, int sold) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
        this.sold = sold;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
