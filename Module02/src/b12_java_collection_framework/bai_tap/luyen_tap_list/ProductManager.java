package b12_java_collection_framework.bai_tap.luyen_tap_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void addProduct(List<Product> list) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        if(list.isEmpty()){
            product.setId(1);
        }else{
            product.setId(list.get(list.size()-1).getId() + 1);
        }
        System.out.print("Name:");
        product.setName(scanner.next());
        System.out.print("Price:");
        product.setPrice(scanner.nextInt());
        list.add(product);
        menu_small(list);
    }

    public static void editProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id: ");
        int idSearch = scanner.nextInt();
        for (Product product : list) {
            if (product.getId() == idSearch) {
                System.out.println(product.toString());
                System.out.println("re-enter the information");
                System.out.print("Name:");
                product.setName(scanner.next());
                System.out.print("Price:");
                product.setPrice(scanner.nextInt());
            }
        }
        menu_small(list);
    }

    public static void deleteProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id: ");
        int idSearch = scanner.nextInt();
        for (Product product : list) {
            if (product.getId() == idSearch) {
                list.remove(product);
            }
        }
        menu_small(list);
    }

    public static void displayProduct(List<Product> list) {
        System.out.println("Information product:");
        for (Product product : list) {
            System.out.println(product.toString());
        }
        menu_small(list);
    }


    public static void searchProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name: ");
        String nameSearch = scanner.next();
        int count = 0;
        for (Product product : list) {
            if (product.getName().equals(nameSearch)) {
                System.out.println("information: " + product.toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("not found");
        }
        menu_small(list);
    }


    public static void sortProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n 1.Sort up ascending \n 2.Descending arrangement\n");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                Collections.sort(list);
                displayProduct(list);
                break;
            }
            case 2: {
                Collections.sort(list);
                for (int i = list.size()-1; i >=0 ; i--) {
                    System.out.println(list.get(i));
                }
                break;
            }
        }
        menu_small(list);
    }

    public static void menu(List<Product> list) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n 1.Add Product \n 2.Edit Product" +
                "\n 3.Delete Product\n 4.Display Product\n 5.Search Product\n 6.Sort Product\n 7.Exit\n Enter your choice: \n");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                addProduct(list);
                break;
            }
            case 2: {
                editProduct(list);
                break;
            }
            case 3: {
                deleteProduct(list);
                break;
            }
            case 4: {
                displayProduct(list);
                break;
            }
            case 5: {
                searchProduct(list);
                break;
            }
            case 6: {
                sortProduct(list);
                break;
            }
            case 7: {
                System.exit(0);

            }
        }

    }
    public static void menu_small(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n 1.menu \n 2.exit\n Enter your choice\n");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                menu(list);
                break;
            }
            case 2: {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        List listProduct = new ArrayList();
        menu(listProduct);
    }
}
