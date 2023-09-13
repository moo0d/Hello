package week3_4.Task3;

import java.io.*;

public class Main2 {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        File f = new File(FILENAME);
        Student student = new Student(1, "Matti", 25);
        //Student student2 = new Student(2, "Simo", 30);
        Course course = new Course("5231", "Math", "Pekka Mattila");
        Enrollment enrollment = new Enrollment(student, course, "13.9.2023");


        try (
                FileOutputStream outputstream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputstream)
        ) {
            objects.writeObject(enrollment);
        } catch (Exception e) {
            System.err.println(e);
        }

        try (
                FileInputStream inputStream = new FileInputStream(FILENAME);
                ObjectInputStream objects = new ObjectInputStream(inputStream)
        ) {
            enrollment = (Enrollment) objects.readObject();

        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Course: \"" + enrollment.getCourse().getCourseName() + "\" \nStudent: \""
                + enrollment.getStudent().getName() + "\" \nEnrollment Date: \"" + enrollment.getEnrollmentDate() + "\"");
    }


}



