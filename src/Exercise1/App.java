package Exercise1;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Funcionarios> newArrayList = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int numberEmployees = keyboard.nextInt();

        // next peeding keyborad access.
        keyboard.nextLine();

        for(int i = 0; i < numberEmployees; i++){
            System.out.println("");
            System.out.println("Employeer #" + (i + 1) + ":");

            System.out.println("ID?");
            int id = keyboard.nextInt();

            // next peeding keyborad access.
            keyboard.nextLine();

            System.out.println("Name?");
            String name = keyboard.nextLine();

            System.out.println("Salary?");
            double salary = keyboard.nextInt();

            Funcionarios newEmployees = new Funcionarios(id, name, salary);

            newArrayList.add(newEmployees);
        }

        System.out.print("Enter the employeer id that will have salary increase: ");
        int numberId = keyboard.nextInt();

        Integer pos = position(newArrayList,numberId);

        if(pos == null){
            System.out.println("this id doe not exist!");
        }else{
            // next peeding keyborad access.
            keyboard.nextLine();
            
            System.out.print("Enter the porcentage: ");
            int porcentage = keyboard.nextInt();

            newArrayList.get(pos).increaseSalary(porcentage);
        }


        System.out.println("List of employees:");
        for(Funcionarios dataList : newArrayList){
            System.out.println(dataList);
        }
       
    }

    private static Integer position(List<Funcionarios> newArrayList, int numberId) {

        for(int i = 0; i < newArrayList.size(); i++){
            if(newArrayList.get(i).getId() == numberId){
                return i;
            }
        }

        return null;
    }

}
