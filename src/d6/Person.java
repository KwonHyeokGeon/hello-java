package d6;

public abstract class Person {
    private String name;
    private int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    추상메서드
    public abstract void sayHello();

    public String getName() {
        return this.name;
    }
}
