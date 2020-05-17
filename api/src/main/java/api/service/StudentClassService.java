package api.service;

import api.domain.StudentClass;

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
public interface StudentClassService {

    List<StudentClass> listStudentClass(String studentNo);

}
