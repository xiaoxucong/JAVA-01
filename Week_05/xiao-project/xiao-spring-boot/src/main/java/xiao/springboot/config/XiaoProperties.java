package xiao.springboot.config;

public class XiaoProperties {
    private  String  student;
    private  String  klass;
    private  String  school;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public XiaoProperties() {
        super();
    }

    public XiaoProperties(String student, String klass, String school) {
        this.student = student;
        this.klass = klass;
        this.school = school;
    }
}
