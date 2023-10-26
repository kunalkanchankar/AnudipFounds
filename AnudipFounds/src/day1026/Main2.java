package day1026;


import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    private int id;
    private String name;
    private String specialty;

    public Doctor(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name + ", Specialty: " + specialty;
    }
}

public class Main2 {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private int nextId = 1;

    public void addDoctor(String name, String specialty) {
        Doctor doctor = new Doctor(nextId, name, specialty);
        doctors.add(doctor);
        nextId++;
        System.out.println("Doctor added successfully.");
    }

    public void displayDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void updateDoctor(int id, String nspec) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                doctor.setSpecialty(nspec);
                System.out.println("Doctor information updated");
                return;
            }
        }
        System.out.println("Doctor with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        Main2 obj = new Main2();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDoctor Management System");
            System.out.println("1. Add Doctor");
            System.out.println("2. Display Doctors");
            System.out.println("3. Update Doctor");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Doctor Specialty: ");
                    String specialty = scanner.nextLine();
                    obj.addDoctor(name, specialty);
                    break;
                case 2:
                    System.out.println("List of Doctors:");
                    obj.displayDoctors();
                    break;
                case 3:
                    System.out.print("Enter Doctor ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new Specialty: ");
                    String nspec = scanner.nextLine();
                    obj.updateDoctor(id, nspec);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
