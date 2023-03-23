package Car;

public class TestCar {

    public static void main(String[] args) {

        // create instance of ferrari
        Ferrari ferrari = new Ferrari();
        ferrari.mileage();
        ferrari.riding();
        ferrari.speed();

        // create instance of safari
        Safari safari = new Safari();
        safari.mileage();
        safari.riding();
        safari.speed();

        // create instance of alto
        Alto alto = new Alto();
        alto.mileage();
        alto.riding();
        alto.speed();

    }
}

    // abstract parent class
    abstract class Car {

        public abstract void riding();

        public abstract int speed();

        public abstract int mileage();
    }


    // child class
    class Safari extends Car {

        // method overriding
        @Override
        public void riding() {
            System.out.println("we are riding safari");
        }

        @Override
        public int speed() {
            return 120;
        }

        @Override
        public int mileage() {
            return 10;
        }
    }

    // child class
    class Ferrari extends Car{

        // Method overriding
        @Override
        public void riding() {
            System.out.println("we are riding ferrari");
        }

        @Override
        public int speed() {
            return 200;
        }

        @Override
        public int mileage() {
            return 2;
        }
    }

    // child class
    class Alto extends Car {
        @Override
        public void riding() {
            System.out.println("we are riding alto");
        }

        @Override
        public int speed() {
            return 110;
        }

        @Override
        public int mileage() {
            return 21;
        }
    }


