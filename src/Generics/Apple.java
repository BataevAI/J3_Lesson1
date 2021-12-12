package Generics;

public class Apple extends Fruit{


    private int amount;

    public Apple(int amount) {
        this.amount = amount;
    }


    @Override
    public int getAmount() {
        return amount;
    }

}
