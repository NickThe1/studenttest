import domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;
import service.TaskService;

public class Main {

    public static void main(String[] args) {

        String filename = "D:/javaworks/studenttest/src/test/java/1.txt";

        ApplicationContext context = new ClassPathXmlApplicationContext("taskbeans.xml","studentbeans.xml");
        TaskService sampleTask = (TaskService) context.getBean(TaskService.class);


        StudentService sampleStudent = (StudentService) context.getBean(StudentService.class);
        Student x = sampleStudent.getTempStudent();
        x.setGrade(sampleTask.getTasks(filename));

        System.out.println(x.getFirstname()+"\t"+x.getLastname()+ "\t" +x.getGrade());
    }

}
