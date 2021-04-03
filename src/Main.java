import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Employee> employeeList = new ArrayList<>();

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		employeeList.add(new Employee(1, "Pham Viet Cuong", 26, "Halong"));

		Function function = new Function();
		function.setEmployeeList(employeeList);

		boolean continuos = true;
		do {
			System.out.println("\n-------------------------------------");
			System.out.println("Select the function:");
			System.out.println("	1. Add employee");
			System.out.println("	2. Delete employeee");
			System.out.println("	3. Show list of employee");
			System.out.println("	4. Out");
			int selection = scanner.nextInt();
			System.out.println();

			switch (selection) {
			case 1:
				function.add();
				break;
			case 2:
				function.delete();
				break;
			case 3:
				function.show();
				break;
			case 4:
				continuos = false;
				break;
			default:
				break;
			}
		} while (continuos);
	}
}
