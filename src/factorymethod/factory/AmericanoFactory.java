package factorymethod;

import factorymethod.coffee.Americano;
import factorymethod.coffee.Coffee;

public class AmericanoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
