package xiao.springboot.pojo;

public class Student {
    private int age;
    private String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

    public Student() {
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "springboot----Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
