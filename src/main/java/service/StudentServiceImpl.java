package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import domain.Student;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getTempStudent() {
        return studentDao.createTempStudent();
    }
}
