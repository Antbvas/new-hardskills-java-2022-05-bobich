public class Category {


    public  Product product;  //private;
    public  String name;       //private;


    public Category(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    public Category(String name) {

    }

    public String getNameCategory() {
        return name;
    }

    public String getProductCategory() {
        return product.getNameProduct();
    }

    public void setNameCategory(String name) {
        this.name = name;
    }

    public void setProductCategory(Product product) {
        this.product = product;
    }
}
