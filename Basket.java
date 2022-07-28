public class Basket {
    private Product product;

    public Basket(Product product){
        this.product=product;
    }

    public String getProduct() {
        return product.getNameProduct();
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
