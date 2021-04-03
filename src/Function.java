import java.util.ArrayList;
import java.util.Scanner;

public class Function {

    private static Scanner scanner = new Scanner(System.in);

    private ArrayList<Employee> employeeList;

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    void add() {
        System.out.println("1.Add employee");
        Employee employee = new Employee();
        boolean invalid;
        do {
            invalid = false;
            System.out.print("Input id: ");
            employee.setId(scanner.nextInt());
            for (Employee e : employeeList) {
                if (employee.getId() == e.getId()) {
                    System.out.println("Id has been exist. Try again.");
                    invalid = true;
                    break;
                }
            }

        } while (invalid);

        System.out.print("Input full name: ");
        employee.setFullName(scanner.next());

        System.out.print("Input age: ");
        employee.setAge(scanner.nextInt());

        System.out.print("Input address: ");
        employee.setAddress(scanner.next());

        employeeList.add(employee);
        System.out.println("Done!");
    }

    void delete() {
        System.out.println("2. Delete employee");
        System.out.print("What is ID to delete: ");
        int id = scanner.nextInt();
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                employeeList.remove(employee);
                break;
            }
        }
        System.out.println("Done!");
    }

    void show() {
        System.out.println("3. Show list of employee");

        for (Employee employee : employeeList) {
            System.out.print(" -- Id: " + employee.getId());
            System.out.print(" -- Name: " + employee.getFullName());
            System.out.print(" -- Age: " + employee.getAge());
            System.out.println(" -- Address: " + employee.getAddress());
        }
        System.out.println("Done!");
    }
}
