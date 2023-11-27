package d6;

public class Car implements Beeper{
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos){
        System.out.println("drive car");
        this.fuel -= kilos / 10;
    }
    @Override
    public void beep(){
        System.out.println("빵빵");
    }
}
