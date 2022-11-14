import ex05.JavaTeacher;
import ex05.PythonTeacher;
import ex05.Teacher;

public class App {

    public static void start(Teacher t){
        t.수업시작();
    }

    public static void main(String[] args) {
        Teacher t1 = new JavaTeacher();
        start(t1);

        System.out.println("==========");

        Teacher t2 = new PythonTeacher();
        start(t2);
    }
}
