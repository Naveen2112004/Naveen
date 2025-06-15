import java.util.*;
class Patient {
    private int id;
    private String name;
    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}
class HospitalManagement {
    private ArrayList<Patient> patients;
    public HospitalManagement() {
        patients = new ArrayList<>();
    }
    public void addPatient(int id, String name) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                System.out.println("Patient with this ID already exists!");
                return;
            }
        }
        patients.add(new Patient(id, name));
        System.out.println("Patient added successfully!");
    }
    public void removePatient(int id) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Patient removed successfully!");
                return;
            }
        }
        System.out.println("Patient not found!");
    }
    public void searchPatient(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                System.out.println("Patient found: ID=" + patient.getId() + ", Name=" + patient.getName());
                return;
            }
        }
        System.out.println("Patient not found!");
    }
    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients in the hospital!");
            return;
        }
        System.out.println("Patients List:");
        for (Patient patient : patients) {
            System.out.println("ID: " + patient.getId() + ", Name: " + patient.getName());
        }
    }
    public static void main(String[] args) {
        HospitalManagement hospital = new HospitalManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Hospital Management Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Search Patient");
            System.out.println("4. Display All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    hospital.addPatient(id, name);
                    break;
                case 2:
                    System.out.print("Enter patient ID to remove: ");
                    hospital.removePatient(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Enter patient ID to search: ");
                    hospital.searchPatient(scanner.nextInt());
                    break;
                case 4:
                    hospital.displayAllPatients();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        scanner.close();
    }
}
