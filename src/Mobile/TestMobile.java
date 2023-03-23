package Mobile;

public class TestMobile {

    public static void main(String[] args) {

        // creating instance of sim idea class
        Sim obj = new idea();
        System.out.println(obj.callingPack());
        System.out.println(obj.dataPack());
    }
}

// Parent class
abstract class Sim{
    abstract int  callingPack();
    abstract int dataPack();
}

// child class
class idea extends Sim {

    @Override
    int callingPack() {
        return 100;
    }

    @Override
    int dataPack() {
        return 500;
    }
}



