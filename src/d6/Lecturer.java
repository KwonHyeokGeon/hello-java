package d6;

public class Lecturer extends Person {
    private String subject;

    public Lecturer(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    public void sayHello(){
        System.out.println(String.format("안녕하세요 %s 입니다. 주제는 %s입니다", getName(), this.subject));
    }
}
