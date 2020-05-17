package api.domain;

import java.io.Serializable;
import java.util.List;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/12
 */
public class Student implements Serializable {

    private String uuid;

    private String studentNo;

    private String name;

    private int age;

    public Student(){}

    public Student(String uuid,String name){
        this.uuid = uuid;
        this.name = name;
    }

    private List<StudentClass> studentClassList;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<StudentClass> getStudentClassList() {
        return studentClassList;
    }

    public void setStudentClassList(List<StudentClass> studentClassList) {
        this.studentClassList = studentClassList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uuid='" + uuid + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studentClassList=" + studentClassList +
                '}';
    }
}
