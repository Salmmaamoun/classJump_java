
import com.WebSite;
import com.classJump.course.Course;
import com.classJump.course.Lecture;
import com.classJump.course.Sheet;
import com.classJump.stuff.Teacher;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Teacher td = new Teacher("jj", "jj");
        Teacher t = new Teacher("jj", "jj");
        Sheet sd = new Sheet(5, "saas", "ddddn");
        Sheet sd1 = new Sheet(7, "saas", "ddddn");
        Sheet sd2 = new Sheet(9, "saas", "ddddn");
        Lecture l1 = new Lecture("saa", "dddd", "dddd");
        Lecture l2 = new Lecture("sasd", "ddssd", "dddd");
        ArrayList<Sheet> sheet = new ArrayList<>();
        sheet.add(sd);
        sheet.add(sd1);
        ArrayList<Lecture> lec = new ArrayList<>();
        lec.add(l2);
        lec.add(l1);
        ArrayList<Course> course = new ArrayList<>();
        Course cd = new Course("opp", "xjdksck", sheet, lec);
        course.add(cd);
        System.out.println(t.addCourse(cd));
        System.out.println(t.remove(cd));
        System.out.println("---------------------------------------");

        Course c = new Course("opp", "xjdksck", sheet, lec);
        Lecture l3 = new Lecture("saa", "dddd", "dddd");
        Lecture l4 = new Lecture("sasd", "ddssd", "dddd");
        System.out.println(c.addLecture(l3));
        System.out.println(c.addLecture(l2));
        System.out.println(c.getLec());
        System.out.println(c.removeLecture(l2));
        System.out.println(c.getLec());
        System.out.println("---------------------------------------");
        System.out.println(c.addSheet(sd2));
        System.out.println(c.addSheet(sd1));
        System.out.println(c.getSheet());
        System.out.println(c.removeSheet(sd2));
        System.out.println(c.getSheet());
        System.out.println("---------------------------------------");
        Course cd1 = new Course("hh", "jmkl", sheet, lec);
        System.out.println(t.addCourse(cd1));
        System.out.println("---------------------------------------");

        WebSite cj = new WebSite();
        Teacher td1 = new Teacher("salma", "sal@gmail.com", "123ssdd", course);
        System.out.println(cj.register("salma", "sal@gmail.com", "123ssdd", course));
        System.out.println(cj.login("salma", "jj"));
        System.out.println("---------------------------------------");
        System.out.println("Finished!!");
        System.out.println("---------------------------------------");
    }

}
