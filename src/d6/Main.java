package d6;

public class Main {
    public static void main(String[] args) {
        Car sonata = new Car();
        refuel(sonata);
        System.out.println(sonata.getFuel());
        sonata.drive(100);
        sonata.beep();

        Truck porter = new Truck(100);
        refuel(porter);
        System.out.println(porter.getFuel());
        porter.drive(100);
        porter.beep();

        Car bongo = new Truck(100);
        ((Truck) bongo).addLoad(10);

//        Car클래스여서 Truck클래스의 매서드쓸려면 업캐스팅
//        Car클래스지만 Truck클래스 오버라이딩된 메소드사용

        porter.drive(30);
        System.out.println("\n\n");
        bongo.drive(100);
    }

    public static void refuel(Car car){
        car.setFuel(100);
    }
}
