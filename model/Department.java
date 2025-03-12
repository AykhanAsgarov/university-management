package model;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String code;
    private List<String> facultyMembers;
    private List<String> students;
    private List<String> courses;
    private String headOfDepartment;

    public Department(String name, String code, String headOfDepartment) {
        this.name = name;
        this.code = code;
        this.headOfDepartment = headOfDepartment;
        this.facultyMembers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public List<String> getFacultyMembers() {
        return facultyMembers;
    }

    public List<String> getStudents() {
        return students;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    
    public void addFacultyMember(String facultyName) {
        facultyMembers.add(facultyName);
    }

    public void removeFacultyMember(String facultyName) {
        facultyMembers.remove(facultyName);
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        students.remove(studentName);
    }

    public void addCourse(String courseName) {
        courses.add(courseName);
    }

    public void removeCourse(String courseName) {
        courses.remove(courseName);
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + name);
        System.out.println("Department Code: " + code);
        System.out.println("Head of Department: " + headOfDepartment);
        System.out.println("Faculty Members: " + facultyMembers);
        System.out.println("Students Enrolled: " + students);
        System.out.println("Courses Offered: " + courses);
    }
    
}
    

