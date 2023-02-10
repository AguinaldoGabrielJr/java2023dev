import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter departament's name: ");
		String departName = sc.nextLine();
		Department departament = new Department(departName);

		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: \n1.JUNIOR  \n2.MID_LEVEL  \n3.SENIOR");
		int choiseLevel = sc.nextInt();
		WorkerLevel wl = null;

		switch (choiseLevel) {
		case 1:
			wl = WorkerLevel.JUNIOR;
			break;
		case 2:
			wl = WorkerLevel.MID_LEVEL;
			break;
		case 3:
			wl = WorkerLevel.SENIOR;
			break;
		default:
			break;
		}

		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(name, wl, baseSalary, departament);
		System.out.print("How many contracts to this worker? ");
		int qtdContract = sc.nextInt();

		for (int i = 0; i < qtdContract; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valueperHora = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valueperHora, hours);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}

}
