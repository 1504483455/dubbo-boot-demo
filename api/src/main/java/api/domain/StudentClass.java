package api.domain;

import java.io.Serializable;

/**
 * ****************************
 * <p>
 * ****************************
 *
 * @author blueSky
 * @version 1.0
 * @date 2020/5/12
 */
public class StudentClass implements Serializable {

    private String uuid;

    private String studentNo;

    private String name;

    private int allTime;

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

    public int getAllTime() {
        return allTime;
    }

    public void setAllTime(int allTime) {
        this.allTime = allTime;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "uuid='" + uuid + '\'' +
                ", studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", allTime=" + allTime +
                '}';
    }
}
