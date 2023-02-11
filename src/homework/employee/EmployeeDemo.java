package homework.employee;

import classwork.Book;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isStep = true;
        while (isStep) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employee ID");
            System.out.println("Please input 4 search employee by company name");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isStep = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salaryStr = scanner.nextLine();
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    double salary = Double.parseDouble(salaryStr);
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee was added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByID(keyword);
                    break;
                case "4":
                    System.out.println("Please input keyword");
                    String keyWord = scanner.nextLine();
                    employeeStorage.searchByCompanyName(keyWord);

                    break;
                default:
                    System.out.println("wrong command. Please try again");
            }
        }
    }
}
