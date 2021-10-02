package Exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Exercise2.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner keyboard = new Scanner(System.in);
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

       System.out.println("Enter departamnet name:");
       String departament = keyboard.nextLine();
       

       System.out.println("Worker data:");
       System.out.print("Name:");
       String name = keyboard.nextLine();

       System.out.print("Level:");
       String level = keyboard.nextLine();

       System.out.print("Base salary:");
       double baseSalary = keyboard.nextInt();

       Worker newWorker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(departament));

       // Next press button
        keyboard.nextLine();

        System.out.print("How manny constracts to this worker?");
        int numberConstract = keyboard.nextInt();


        for(int i = 1; i <= numberConstract; i++){
            System.out.print("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY):");
            Date date = sdf.parse(keyboard.next());

            System.out.print("Value per hours:");
            double valuePerHour = keyboard.nextDouble();

            System.out.print("Duration (hours):");
            int hour = keyboard.nextInt();

            HourContract newContract = new HourContract(date,valuePerHour,hour);

            newWorker.addContract(newContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY):");
        String monthAndYear = keyboard.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + newWorker.getName());
		System.out.println("Department: " + newWorker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", newWorker.income(year, month)));

    }
}
