package Tea;

public class TestTea {
    public static void main(String[] args) {

        BlackTea blackTea = new BlackTea();
        blackTea.flavour();

        GreenTea greenTea = new GreenTea();
        greenTea.flavour();

        LemonTea lemonTea = new LemonTea();
        lemonTea.flavour();

    }
}

// abstract parent class
abstract class Tea {

    // abstract method
    public abstract void flavour();
}

// child class
class LemonTea extends Tea {
    @Override
    public void flavour() {

        System.out.println("Lemon tea taste like lemon");
    }
}

// Child class
class GreenTea extends Tea {
    @Override
    public void flavour() {

        System.out.println("Green tea taste like herbal tea");
    }
}

// child class
class BlackTea extends Tea {
    @Override
    public void flavour() {

        System.out.println("Black tea is tasteless");
    }
}