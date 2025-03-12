package main;

import java.time.LocalDate;

import model.person.Person;
import model.person.Student;



public class Main {
    public static void main(String[] args) {
         try {
            Student Student = new Student(-1, "John Doe", "123 Main St", "555-1234", "john.doe@example.com", LocalDate.of(1990, 1, 1));
            System.out.println("Person created successfully: " + Student);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to create Person: " + e.getMessage());
        }
        
    }
}
