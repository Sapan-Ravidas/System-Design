package models;

public class ProductShelf {
    private int shelfCode;
    private Product product;
    private int productCount;
    public ProductShelf(int shelfCode, Product product, int productCount) {
        this.shelfCode = shelfCode;
        this.product = product;
        this.productCount = productCount;
    }
    public int getShelfCode() {
        return shelfCode;
    }
    public void setShelfCode(int shelfCode) {
        this.shelfCode = shelfCode;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getProductCount() {
        return productCount;
    }
    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
    public void reduceCount() {
        productCount -= 1;
    }
}
