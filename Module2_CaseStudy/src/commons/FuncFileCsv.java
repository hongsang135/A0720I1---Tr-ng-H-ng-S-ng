package commons;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import models.*;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FuncFileCsv {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String FILE_HEADER_VILLA = "name Services, area, rate, max Capacity, rent Type, id, standard Room, convenient Other, area Pool, number Of Floors";
    public static final String FILE_NAME_VILLA = "src/data/villa.csv";
    public static final String FILE_HEADER_HOUSE = "name Services, area, rate, max Capacity, rent Type, id, standard Room, convenient Other, number Of Floors";
    public static final String FILE_NAME_HOUSE = "src/data/house.csv";
    public static final String FILE_HEADER_ROOM = "name Services, area, rate, max Capacity, rent Type, id, serviceFree";
    public static final String FILE_NAME_ROOM = "src/data/room.csv";
    public static final String FILE_NAME_CUSTOMER = "src/data/customer.csv";
    public static final String FILE_HEADER_CUSTOMER = "Name, birthday, sex, Id card, phone number, email, type of customer, address, services use";
    public static final String FILE_NAME_EMPLOYEE = "src/data/Employee.csv";
    public static final String FILE_NAME_BOOKING = "src/data/booking.csv";


    public static void villaWriteToFileCsv(ArrayList<Villa> villaArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_VILLA);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa : villaArrayList) {
                fileWriter.append(villa.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getArea());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRate());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getMaxCapacity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRentType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getStandardRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientOther());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getAreaPool());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNumberOfFloors());
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void houseWriteToFileCsv(ArrayList<House> housesArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_HOUSE);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house : housesArrayList) {
                fileWriter.append(house.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getArea());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRate());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getMaxCapacity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRentType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getStandardRoom());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientOther());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNumberOfFloors());
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void roomWriteToFileCsv(ArrayList<Room> roomArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_ROOM);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room : roomArrayList) {
                fileWriter.append(room.getNameServices());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getArea());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getRate());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getMaxCapacity());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getRentType());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getServiceFree());
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void customerWriteToFileCsv(ArrayList<Customer> listCustomer) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_CUSTOMER);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer : listCustomer) {
                /*fileWriter.append(customer.showInfor());
                fileWriter.append(NEW_LINE_SEPARATOR);*/
                fileWriter.append(customer.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getSex());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                if(customer.getServicesUse() != null) {
                    fileWriter.append(customer.getServicesUse().getId());
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }else {
                    fileWriter.append("null");
                    fileWriter.append(NEW_LINE_SEPARATOR);
                }

            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Villa> getFileCsvVilla() {
        BufferedReader br = null;
        ArrayList<Villa> villaArrayList = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_VILLA));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name Services")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setNameServices(splitData[0]);
                villa.setArea(splitData[1]);
                villa.setRate(splitData[2]);
                villa.setMaxCapacity(splitData[3]);
                villa.setRentType(splitData[4]);
                villa.setId(splitData[5]);
                villa.setStandardRoom(splitData[6]);
                villa.setConvenientOther(splitData[7]);
                villa.setAreaPool(splitData[8]);
                villa.setNumberOfFloors(splitData[9]);
                villaArrayList.add(villa);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return villaArrayList;
    }

    public static ArrayList<Room> getFileCsvRoom() {
        BufferedReader br = null;
        ArrayList<Room> roomArrayList = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_ROOM));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name Services")) {
                    continue;
                }
                Room room = new Room();
                room.setNameServices(splitData[0]);
                room.setArea(splitData[1]);
                room.setRate(splitData[2]);
                room.setMaxCapacity(splitData[3]);
                room.setRentType(splitData[4]);
                room.setId(splitData[5]);
                room.setServiceFree(splitData[6]);
                roomArrayList.add(room);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return roomArrayList;
    }

    public static ArrayList<House> getFileCsvHouse() {
        BufferedReader br = null;
        ArrayList<House> houseArrayList = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_HOUSE));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name Services")) {
                    continue;
                }
                House house = new House();
                house.setNameServices(splitData[0]);
                house.setArea(splitData[1]);
                house.setRate(splitData[2]);
                house.setMaxCapacity(splitData[3]);
                house.setRentType(splitData[4]);
                house.setId(splitData[5]);
                house.setStandardRoom(splitData[6]);
                house.setConvenientOther(splitData[7]);
                house.setNumberOfFloors(splitData[8]);
                houseArrayList.add(house);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return houseArrayList;
    }

    public static ArrayList<Customer> getFileCsvCustomer(List<Villa> villaList, List<House> houseList, List<Room> roomList) {
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_CUSTOMER));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setSex(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                if(!splitData[8].equals("null")) {
                    String serviceID = splitData[8];
                    if (serviceID.substring(0, 4).equals("SVVL")) {
                        for (Services services : villaList) {
                            if (services.getId().equals(serviceID)) {
                                customer.setServicesUse(services);
                                //listCustomer.add(customer);
                                //break;
                            }
                        }
                    } else if (serviceID.substring(0, 4).equals("SVHO")) {
                        for (Services services : houseList) {
                            if (services.getId().equals(serviceID)) {
                                customer.setServicesUse(services);
                                //listCustomer.add(customer);
                                //break;
                            }
                        }
                    } else if (serviceID.substring(0, 4).equals("SVRO")) {
                        for (Services services : roomList) {
                            if (services.getId().equals(serviceID)) {
                                customer.setServicesUse(services);
                                //listCustomer.add(customer);
                                //break;
                            }
                        }
                    }
                }
                listCustomer.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }

    public static Map<String, Employee> getFileCsvEmployee(){
        BufferedReader br = null;
        Map<String, Employee> employeeMap = new LinkedHashMap<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_EMPLOYEE));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setName(splitData[0]);
                employee.setAge(splitData[1]);
                employee.setAddress(splitData[2]);
                String idEmployee = String.format("NV%d", employeeMap.size() + 1);
                employeeMap.put(idEmployee,employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return employeeMap;
    }

    public static void writeBooking(ArrayList<Customer> bookingList){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_BOOKING);
            for (Customer customer : bookingList) {
                fileWriter.append(customer.showInfor());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<Customer> getFileBooking(List<Villa> villaList, List<House> houseList, List<Room> roomList) {
        BufferedReader br = null;
        ArrayList<Customer> listBooking = new ArrayList<>();
        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_BOOKING));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setName(splitData[0]);
                customer.setBirthday(splitData[1]);
                customer.setSex(splitData[2]);
                customer.setIdCard(splitData[3]);
                customer.setPhoneNumber(splitData[4]);
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                String serviceID = splitData[8];
                if (serviceID.substring(0, 4).equals("SVVL")) {
                    for (Services services : villaList) {
                        if (services.getId().equals(serviceID)) {
                            customer.setServicesUse(services);
                            //listCustomer.add(customer);
                            //break;
                        }
                    }
                } else if (serviceID.substring(0, 4).equals("SVHO")) {
                    for (Services services : houseList) {
                        if (services.getId().equals(serviceID)) {
                            customer.setServicesUse(services);
                            //listCustomer.add(customer);
                            //break;
                        }
                    }
                } else if (serviceID.substring(0, 4).equals("SVRO")) {
                    for (Services services : roomList) {
                        if (services.getId().equals(serviceID)) {
                            customer.setServicesUse(services);
                            //listCustomer.add(customer);
                            //break;
                        }
                    }
                }
                listBooking.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listBooking;
    }

}
