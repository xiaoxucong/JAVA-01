package xiao.pojo;

import org.springframework.stereotype.Component;

import java.util.List;
@Component(value = "klass")
public class Klass {
    private String name;
    List<Student> students;

    public Klass() {
        super();
    }

    public Klass(String name, List<Student> students){
        this.name=name;
        this.students=students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Klass{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
