package Q5;

public class Main {

    public static void main(String[] args) {

        Lecture lecturer = new Lecture();

        lecturer.setLecturerName("Mr. Kersavan Selvaraj");
        lecturer.setCourseTeaching("OOP");

        Course course = new Course();

        course.setCourseName("Object Oriented Programming");

        course.setCourseCode("CTEC22043");

        course.setLecturer(lecturer);

        Student student = new Student();

        student.setStudentName("Isanka");

        student.setDegreeName("Computer Technology");

        student.setCourseFollowing("OOP");

        System.out.println("Course Name: " + course.getCourseName());

        System.out.println("Course Code: " + course.getCourseCode());

        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());

        System.out.println("Student Name: " + student.getStudentName());

        System.out.println("Degree Name: " + student.getDegreeName());
    }
}