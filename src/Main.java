import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Employee> employeeList = new ArrayList<>();

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		employeeList.add(new Employee(1, "Pham Viet Cuong", 26, "Halong"));

		boolean continuos = true;
		do {
			System.out.println("\n-------------------------------------");
			System.out.println("Select the function:");
			System.out.println("	1. Add employee");
			System.out.println("	2. Delete employee");
			System.out.println("	3. Show list of employe");
			System.out.println("	4. Out");
			int selection = scanner.nextInt();
			System.out.println();

			switch (selection) {
			case 1:
				add();
				break;
			case 2:
				delete();
				break;
			case 3:
				show();
				break;
			case 4:
				continuos = false;
				break;
			default:
				break;
			}
		} while (continuos);
	}

	static void add() {
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

	static void delete() {
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

	static void show() {
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
