class Product {
    private String productName;
    private double price;
    private String category;

    public Product(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public double calculateDiscount(double discountPercentage) {
        // Some logic to calculate discounted price
        return price - (price * discountPercentage);
    }

    public void changeCategory(String newCategory) {
        this.category = newCategory;
    }

    public String getCategory() {
        return category;
    }
}