package d6;

public class Truck extends Car{
    private final int maxLoad;

    private int load;

    public Truck(int maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public void drive(int kilos){
        System.out.println("drive truck");
    }

    public boolean addLoad(int load){
        if(this.load + load > this.maxLoad){
            return false;
        }else {
            this.load += load;
            return true;
        }
    }
}
