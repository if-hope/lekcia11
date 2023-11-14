import java.io.FileNotFoundException;

public class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("age must be great than zero");
        }else {
        this.age = age;}
    }
}
