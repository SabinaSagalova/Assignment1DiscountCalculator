package DiscountCalculator;

public class Main {
    public static void main(String[] args) {
        Product food = new FoodProduct(1560);
        Product electronics = new ElectronicsProduct(2700);
        Product clothing = new ClothingProduct(10000);

        Calculator calculator = new Calculator();

        System.out.println("Food Discount: " + calculator.calculateDiscount(food));
        System.out.println("Electronics Discount: " + calculator.calculateDiscount(electronics));
        System.out.println("Clothing Discount: " + calculator.calculateDiscount(clothing));
    }
}

