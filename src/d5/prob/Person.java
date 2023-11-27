package d5.prob;

public class Person {
    private String name;

    private int age;

    public Person(String name){
        this.name = name;
        this.age = 0;
    }

    public void sayHello(){
        if(this.age > 4){
            System.out.println("Hello");
        }else {
            System.out.println("bebe");
        }
    }
}
