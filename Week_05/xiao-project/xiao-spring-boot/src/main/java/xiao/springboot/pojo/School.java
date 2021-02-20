package xiao.springboot.pojo;

import java.util.List;

public class School {
    private String name;
    List<Klass> klasses;

    public School(String name,List<Klass> klasses){
        this.klasses=klasses;
        this.name=name;
    }

    public School() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Klass> getKlasses() {
        return klasses;
    }

    public void setKlasses(List<Klass> klasses) {
        this.klasses = klasses;
    }

    @Override
    public String toString() {
        return "springboot----School{" +
                "name='" + name + '\'' +
                ", klasses=" + klasses +
                '}';
    }
}
