package controllers;

import commons.FuncFileCsv;
import commons.Regex;
import models.*;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.jar.JarOutputStream;

public class MainController {
    public static ArrayList<Villa> listVilla = new ArrayList<>();
    public static ArrayList<House> listHouse = new ArrayList<>();
    public static ArrayList<Room> listRoom = new ArrayList<>();
    public static ArrayList<Employee> listEmployee = new ArrayList<>();
    public static ArrayList<Customer> listCustomer = new ArrayList<>();
    public static ArrayList<Customer> listBooking = new ArrayList<>();
    public static Map<String, Employee> employeeMap = new LinkedHashMap<>();
    public static Queue<Customer> cinemaList = new LinkedList<>();
    public static final int TICKET_MAX = 250;
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU:\n" +
                "1.Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Show list booking cinema 4k\n" +
                "8.Employee\n" +
                "9.Exit\n");
        System.out.print("your option: ");
        String option = scanner.nextLine();
        switch (option) {
            case "1": {
                addNewServices();
                break;
            }
            case "2": {
                showServices();
                break;
            }
            case "3": {
                addNewCustomer();
                break;
            }
            case "4": {
                showInformationCustomers();
                break;
            }
            case "5": {
                addNewBooking();
                break;
            }
            case "6": {
                employeeMap = FuncFileCsv.getFileCsvEmployee();
                for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
                displayMainMenu();
                break;
            }
            case "7": {
                showListBookCinema4k();
                break;
            }
            case "8": {
                FileEmployee.employeeMap = FuncFileCsv.getFileCsvEmployee();
                FileEmployee.displayMainMenu();
                break;
            }
            case "9": {
                System.out.println("Goodbye");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("fail!!  Press Enter to continue......");
                scanner.nextLine();
                displayMainMenu();
            }
        }
    }

    public static void showAllVilla() {
        System.out.println("Information all Villa:  ");
        listVilla = FuncFileCsv.getFileCsvVilla();
        int i=1;
        for (Villa villa : listVilla) {
            System.out.println(i + ". " + villa.showInfor());
            i++;
        }
    }

    public static void showAllHouse() {
        System.out.println("Information all House:  ");
        listHouse = FuncFileCsv.getFileCsvHouse();
        int i=1;
        for (House house : listHouse) {
            System.out.println(i + ". " + house.showInfor());
            i++;
        }
    }

    public static void showAllRoom() {
        System.out.println("Information all Room:  ");
        listRoom = FuncFileCsv.getFileCsvRoom();
        int i=1;
        for (Room room : listRoom) {
            System.out.println(i + ". " + room.showInfor());
            i++;
        }
    }
    public static void addNewServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU:\n" +
                "1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit\n");
        String option = scanner.nextLine();
        switch (option) {
            case "1": {
                listVilla = FuncFileCsv.getFileCsvVilla();
                System.out.println("Input infor Villa:\n ");
                String name;
                do{
                    System.out.print("Input Name Villa: ");
                    name = scanner.nextLine();
                }while (!Regex.checkNameAndRentType(name));

                String area;
                do{
                    System.out.print("Area: ");
                    area = scanner.next();
                }while (!Regex.checkArea(area));

                String rate;
                do{
                    System.out.print("Rate: ");
                    rate = scanner.next();
                }while (!Regex.checkRate(rate));

                String maxCapacity;
                do{
                    System.out.print("Max Capacity: ");
                    maxCapacity = scanner.next();
                }while (!Regex.checkMaxCapacity(maxCapacity));

                String rentType;
                do{
                    System.out.print("Rent Type: ");
                    rentType = scanner.next();
                }while (!Regex.checkNameAndRentType(rentType));

                String id;
                do{
                    System.out.print("Id: ");
                    id = scanner.next();
                }while (!Regex.checkIDVilla(id));

                String standardRoom;
                do{
                    System.out.print("Standard Room: ");
                    standardRoom = scanner.next();
                }while (!Regex.checkNameAndRentType(standardRoom));

                String convenientOther;
                do{
                    System.out.print("Convenient Other: ");
                    convenientOther = scanner.next();
                }while (!Regex.checkServiceFree(convenientOther));

                String areaPool;
                do{
                    System.out.print("Area Pool: ");

                    areaPool = scanner.next();
                }while (!Regex.checkArea(areaPool));

                String numberOfFloors;
                do{
                    System.out.print("Number Of Floors:: ");
                    numberOfFloors = scanner.next();
                }while (!Regex.checkFloor(numberOfFloors));

                Villa villa = new Villa(name, area, rate, maxCapacity, rentType, id, standardRoom, convenientOther, areaPool, numberOfFloors);
                listVilla.add(villa);
                FuncFileCsv.villaWriteToFileCsv(listVilla);
                System.out.println("\nAdd complete!!! Press Enter to continue......\n");
                scanner.nextLine();
                addNewServices();
                break;
            }
            case "2": {
                listHouse = FuncFileCsv.getFileCsvHouse();
                System.out.println("Input infor House:\n ");
                String name;
                do{
                    System.out.print("Input Name House: ");
                    name = scanner.nextLine();
                }while (!Regex.checkNameAndRentType(name));

                String area;
                do{
                    System.out.print("Area: ");
                    area = scanner.next();
                }while (!Regex.checkArea(area));

                String rate;
                do{
                    System.out.print("Rate: ");
                    rate = scanner.next();
                }while (!Regex.checkRate(rate));

                String maxCapacity;
                do{
                    System.out.print("Max Capacity: ");
                    maxCapacity = scanner.next();
                }while (!Regex.checkMaxCapacity(maxCapacity));

                String rentType;
                do{
                    System.out.print("Rent Type: ");
                    rentType = scanner.next();
                }while (!Regex.checkNameAndRentType(rentType));

                String id;
                do{
                    System.out.print("Id: ");
                    id = scanner.next();
                }while (!Regex.checkIDHouse(id));

                String standardRoom;
                do{
                    System.out.print("Standard Room: ");
                    standardRoom = scanner.next();
                }while (!Regex.checkNameAndRentType(standardRoom));

                String convenientOther;
                do{
                    System.out.print("Convenient Other: ");
                    convenientOther = scanner.next();
                }while (!Regex.checkServiceFree(convenientOther));

                String numberOfFloors;
                do{
                    System.out.print("Number Of Floors:: ");
                    numberOfFloors = scanner.next();
                }while (!Regex.checkFloor(numberOfFloors));
                House house = new House(name, area, rate, maxCapacity, rentType, id, standardRoom, convenientOther, numberOfFloors);
                listHouse.add(house);
                FuncFileCsv.houseWriteToFileCsv(listHouse);
                System.out.println("\nAdd complete!!! Press Enter to continue......\n");
                scanner.nextLine();
                addNewServices();
                break;
            }
            case "3": {
                listRoom = FuncFileCsv.getFileCsvRoom();
                System.out.println("Input infor Room:\n ");
                String name;
                do{
                    System.out.print("Input Name Room: ");
                    name = scanner.nextLine();
                }while (!Regex.checkNameAndRentType(name));

                String area;
                do{
                    System.out.print("Area: ");
                    area = scanner.next();
                }while (!Regex.checkArea(area));

                String rate;
                do{
                    System.out.print("Rate: ");
                    rate = scanner.next();
                }while (!Regex.checkRate(rate));

                String maxCapacity;
                do{
                    System.out.print("Max Capacity: ");
                    maxCapacity = scanner.next();
                }while (!Regex.checkMaxCapacity(maxCapacity));

                String rentType;
                do{
                    System.out.print("Rent Type: ");
                    rentType = scanner.next();
                }while (!Regex.checkNameAndRentType(rentType));

                String id;
                do{
                    System.out.print("Id: ");
                    id = scanner.next();
                }while (!Regex.checkIDRoom(id));

                String servicesFree;
                do{
                    System.out.print("Convenient Other: ");
                    servicesFree = scanner.next();
                }while (!Regex.checkServiceFree(servicesFree));

                Room room = new Room(name, area, rate, maxCapacity, rentType, id, servicesFree);
                listRoom.add(room);
                FuncFileCsv.roomWriteToFileCsv(listRoom);
                System.out.println("\nAdd complete!!! Press Enter to continue......\n");
                scanner.nextLine();
                addNewServices();
                break;
            }
            case "4": {
                displayMainMenu();
                break;
            }
            case "5": {
                System.out.println("Goodbye!!!");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("fail!!  Press Enter to continue......");
                scanner.nextLine();
                addNewServices();
            }
        }
    }

    public static void showServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu\n" +
                "1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit\n");
        String option = scanner.nextLine();
        switch (option) {
            case "1": {
                showAllVilla();
                System.out.println();
                System.out.println("Complete!!!...Press Enter to continue......");
                scanner.nextLine();
                showServices();
                break;
            }
            case "2": {
                System.out.println("Information all House:  ");
                listHouse = FuncFileCsv.getFileCsvHouse();
                for (House house : listHouse) {
                    System.out.println(house.showInfor());
                }
                System.out.println();
                System.out.println("Complete!!!...Press Enter to continue......");
                scanner.nextLine();
                showServices();
                break;
            }
            case "3": {
                System.out.println("Information all Room:  ");
                listRoom = FuncFileCsv.getFileCsvRoom();
                for (Room room : listRoom) {
                    System.out.println(room.showInfor());
                }
                System.out.println();
                System.out.println("Complete!!!...Press Enter to continue......");
                scanner.nextLine();
                showServices();
                break;
            }
            case "4": {
                listVilla = FuncFileCsv.getFileCsvVilla();
                TreeSet<Villa> treeSetVilla= new TreeSet<>();
                for(Villa villa:listVilla){
                    treeSetVilla.add(villa);
                }
                for (Villa villa:treeSetVilla){
                    System.out.println(villa.showInfor());
                }
                showServices();
                break;
            }
            case "5": {
                listHouse = FuncFileCsv.getFileCsvHouse();
                TreeSet<House> treeSetHouse= new TreeSet<>();
                for(House house:listHouse){
                    treeSetHouse.add(house);
                }
                for (House house:treeSetHouse){
                    System.out.println(house.showInfor());
                }
                showServices();
                break;
            }
            case "6": {
                listRoom = FuncFileCsv.getFileCsvRoom();
                TreeSet<Room> treeSetRoom= new TreeSet<>();
                for(Room room:listRoom){
                    treeSetRoom.add(room);
                }
                for (Room room:treeSetRoom){
                    System.out.println(room.showInfor());
                }
                showServices();
                break;
            }
            case "7": {
                displayMainMenu();
                break;
            }
            case "8": {
                System.out.println("Goodbye!!!");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("fail!!  Press Enter to continue......");
                scanner.nextLine();
                showServices();
            }
        }
    }

    public static void addNewCustomer() {
        listCustomer = FuncFileCsv.getFileCsvCustomer(listVilla, listHouse, listRoom);
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Input information customer: ");
        System.out.print("Name: ");
        customer.setName(scanner.next());
        System.out.print("Birthday: ");
        customer.setBirthday(scanner.next());
        System.out.print("Sex: ");
        customer.setSex(scanner.next());
        System.out.print("Id card: ");
        customer.setIdCard(scanner.next());
        System.out.print("Phone number: ");
        customer.setPhoneNumber(scanner.next());
        System.out.print("Email: ");
        customer.setEmail(scanner.next());
        System.out.print("Type of customer: ");
        customer.setTypeCustomer(scanner.next());
        System.out.print("Address: ");
        customer.setAddress(scanner.next());
        customer.setServicesUse(null);
        listCustomer.add(customer);
        FuncFileCsv.customerWriteToFileCsv(listCustomer);
        System.out.println("\nAdd complete!!! Press Enter to continue......\n");
        scanner.nextLine();
        displayMainMenu();

    }

    public static void showInformationCustomers() {
        Scanner scanner = new Scanner(System.in);
        listVilla = FuncFileCsv.getFileCsvVilla();
        listHouse = FuncFileCsv.getFileCsvHouse();
        listRoom = FuncFileCsv.getFileCsvRoom();
        listCustomer = FuncFileCsv.getFileCsvCustomer(listVilla, listHouse, listRoom);
        System.out.println("Information Customer");
        Collections.sort(listCustomer);
        for (Customer customer : listCustomer) {
            System.out.println(customer.showInfor());
        }
        System.out.println();
        System.out.println("Complete!!!...Press Enter to continue......");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        int[] ticket = {0};
        listVilla = FuncFileCsv.getFileCsvVilla();
        listHouse = FuncFileCsv.getFileCsvHouse();
        listRoom = FuncFileCsv.getFileCsvRoom();
        listCustomer = FuncFileCsv.getFileCsvCustomer(listVilla, listHouse, listRoom);
        listBooking = FuncFileCsv.getFileBooking(listVilla, listHouse, listRoom);
        cinemaList = FuncFileCsv.getFileCsvCustomerBookCinema(listVilla, listHouse, listRoom, ticket);
        listVilla = FuncFileCsv.getFileCsvVilla();
        System.out.println("list customer: : ");
        Collections.sort(listCustomer);
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println(i + 1 + ". " + listCustomer.get(i).showInfor());
        }
        System.out.print("enter your choice: ");
        int choice = scanner.nextInt();
        System.out.println("1.Booking Villa\n" +
                "2.Booking House\n" +
                "3.Booking Room\n");
        System.out.print("enter your choice: ");
        String option = scanner.next();
        switch (option) {
            case "1": {
                showAllVilla();
                System.out.print("enter your choice: ");
                Customer customer = listCustomer.get(choice-1);
                int optionVilla = scanner.nextInt();
                listCustomer.get(choice-1).setServicesUse(listVilla.get(optionVilla-1));
                //System.out.println(listCustomer.get(choice-1).getServicesUse());
                FuncFileCsv.customerWriteToFileCsv(listCustomer);
                listBooking.add(listCustomer.get(choice-1));
                break;
            }
            case "2": {
                showAllHouse();
                System.out.print("enter your choice: ");
                int optionHouse = scanner.nextInt();
                listCustomer.get(choice-1).setServicesUse(listHouse.get(optionHouse-1));
                //System.out.println(listCustomer.get(choice-1).getServicesUse());
                FuncFileCsv.customerWriteToFileCsv(listCustomer);
                listBooking.add(listCustomer.get(choice-1));
                break;
            }
            case "3": {
                showAllRoom();
                System.out.print("enter your choice: ");
                int optionRoom = scanner.nextInt();
                listCustomer.get(choice-1).setServicesUse(listRoom.get(optionRoom-1));
                //System.out.println(listCustomer.get(choice-1).getServicesUse());
                FuncFileCsv.customerWriteToFileCsv(listCustomer);
                listBooking.add(listCustomer.get(choice-1));
                break;
            }
            default:{
                System.out.println("fail!!  Press Enter to continue......");
                scanner.nextLine();
                displayMainMenu();
            }
        }
        FuncFileCsv.writeBooking(listBooking);
        System.out.println("Are you buy cinema ticket??????\n1.YES\n2.NO");
        String ticketCinema = scanner.next();
        if(ticketCinema.equals("1")){
            if(ticket[0] < TICKET_MAX){
                cinemaList.add(listCustomer.get(choice-1));
                FuncFileCsv.writeListBookingCinema(cinemaList);
            }else{
                System.out.println("full slot cinema.!!!!");
            }

        }else if(ticketCinema.equals("2")){
        }else{
            System.out.println("fail!!  Press Enter to continue......");
            scanner.nextLine();
            displayMainMenu();
        }
        System.out.println("Complete!!!...Press Enter to continue......");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void showListBookCinema4k(){
        int[] temp = {0};
        listVilla = FuncFileCsv.getFileCsvVilla();
        listHouse = FuncFileCsv.getFileCsvHouse();
        listRoom = FuncFileCsv.getFileCsvRoom();
        cinemaList = FuncFileCsv.getFileCsvCustomerBookCinema(listVilla, listHouse, listRoom, temp);
        System.out.println("List customer book cinema:");
        for(Customer customer: cinemaList){
            System.out.println(customer.showInfor());
        }
        displayMainMenu();
    };

    public static void main(String[] args) {
        displayMainMenu();
    }
}
