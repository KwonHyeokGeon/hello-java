package d5;
// 자동차 설계도
public class Car {
    private static int count = 0;
    private final String brand; // 브랜드
    private final String name; // 차종
    private int fuel; // 연료 상태

//    생성자 : 객체를 만들 때 호출되는 메서드
    public Car(String name, String brand, int fuel){
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
    } // 생성자 메서드

    //getter
    public String getBrand(){
        return brand;
    }

    //setter
    public void setFuel(int fuel){
        this.fuel = fuel;
    }

    public void beep(){
        System.out.println("빵");
    }

    public void printInfo(){
        System.out.println(String.format("name\t %s", name));
        System.out.printf("brand\t %s", brand);
        System.out.printf("fuel\t %d", fuel);
    }
}
