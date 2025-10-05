package factorymethod;

import factorymethod.coffee.Coffee;
import factorymethod.coffee.Latte;

public class LatteFactory extends CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
