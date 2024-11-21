package lv.rvt;

class Product {
    private String item;
    private String shelf;
    private int weight;

    public Product(String item, String shelf, int weight) {
        this.item = item;
        this.shelf = shelf;
        this.weight = weight;
    }

    public Product(String item, String shelf) 
    {
        this(item, shelf, 1);
    }

    public Product(String item, int weight) 
    {
        this(item, "shelf", weight);
    }

    public Product(String item) {
        this(item, "shelf", 1);
    }

    @Override
    public String toString() {
        return String.format("%s, (%d kg) can be found from the %s", this.item, this.weight, this.shelf);
    }
}