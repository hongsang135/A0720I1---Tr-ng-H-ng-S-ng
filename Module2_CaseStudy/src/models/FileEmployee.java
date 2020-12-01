package models;

import controllers.MainController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class FileEmployee {
    static Scanner sc = new Scanner(System.in);
    public static Map<String, Employee> employeeMap = new LinkedHashMap<>();
    public static Stack<Employee> employeeStack = new Stack<>();

    public static void displayMainMenu() {
        System.out.println("1. Display Profile Employee\n" +
                "2. Find Profile Employee\n" +
                "3. Back To Menu\n" +
                "4.exit");
        System.out.print("Your Choose: ");
        String choose = sc.nextLine();
        switch (choose) {
            case "1": {
                displayProfile(employeeMap);
                break;
            }
            case "2": {
                System.out.print("Enter name to find: ");
                String name = sc.nextLine();
                findProfile(employeeMap, name);
                break;
            }
            case "3": {
                displayMainMenu();
                break;
            }
            case "4": {
                MainController.displayMainMenu();
                break;
            }
            default: {
                System.out.println("Fail!!! Please choose again");
                sc.nextLine();
                displayMainMenu();
            }
        }
    }

    public static void displayProfile(Map<String, Employee> employeeMap) {
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry);
        }
        displayMainMenu();
    }

    public static void findProfile(Map<String, Employee> employeeMap, String name) {
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            employeeStack.add(entry.getValue());
        }
        for (Employee employee : employeeStack) {
            if (name.equals(employee.getName())) {
                System.out.println(employee.toString());
            } else {
                System.out.println("Don't have");
            }
            break;
        }
        displayMainMenu();
    }
}
