public class Product {
    private String name;
    private int price;
    private  double rate;

    public Product(String name, int price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public String getNameProduct() {
        return name;
    }

    public int getPriceProduct() {
        return price;
    }

    public double getRateProduct() {
        return rate;
    }

    public void setNameProduct(String name) {
        this.name = name;
    }

    public void setPriceProduct(int price) {
        this.price = price;
    }

    public void setRateProduct(double rate) {
        this.rate = rate;
    }


}
