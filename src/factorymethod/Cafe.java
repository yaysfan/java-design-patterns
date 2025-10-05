package factorymethod;

public class Cafe {

    public static void main(String[] args) {
        CoffeeFactory factory = new LatteFactory();
        Coffee coffee = factory.createCoffee();

        System.out.println(coffee.getName() + " 주문 성공");
    }
}
