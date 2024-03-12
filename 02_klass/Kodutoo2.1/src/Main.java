public class Main {
    public static void main(String[] args) {

        // Custom class with constructor, at least 2 properties, and at least 2 methods
        Student student1 = new Student("Emma", 21, 'N', "Computer Science");
        Student student2 = new Student("James", 22, 'M', "Electrical Engineering");

        System.out.println("Opilane 1: " + student1.getName() + ", Vanus: " + student1.getAge() + ", Sugu: " + student1.getGender() +
                ", Eriala: " + student1.getMajor());
        System.out.println("Opilane 2: " + student2.getName() + ", Vanus: " + student2.getAge() + ", Sugu: " + student2.getGender() +
                ", Eriala: " + student2.getMajor());

        double student2Scholarship = student2.calculateScholarship(1000.0);
        System.out.println("Opilase 2 uus summa: €" + student2Scholarship);

        // Another custom class with constructor, at least 2 properties, and at least 2 methods
        Product product1 = new Product("Smartwatch", 149.99, "Elektroonika");
        Product product2 = new Product("Running Shoes", 79.99, "Jalanõud");

        double product1DiscountedPrice = product1.calculateDiscount(0.2);
        System.out.println("Product 1 discounted price: $" + product1DiscountedPrice);

        product2.changeCategory("Athletic Gear");
        System.out.println("Updated category for Product 2: " + product2.getCategory());
    }
}
