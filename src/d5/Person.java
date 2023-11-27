package d5;

public class Person {
    private String name;
    private int age;

    public int age(){
        age += 1;
        return age;
    }
    public Person(String name){
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
