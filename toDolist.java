import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



public class toDolist {
    
    private static List <String> currentList = new ArrayList<String>(); 
    public static void main (String [] args ){


        System.out.println ("Welcome to your To-Do List!");
     int menuItem = -1; 
     while (menuItem != 0) {
        menuItem = menu(); 
        switch (menuItem) {
            case 1: 
                showList (); 
                break; 
            case 2: 
                addItem (); 
                break;
            case 3:
                removeItem (); 
                break; 
            case 0:
            break; 
            default: 
            System.out.println("ENTER A VALID OPTION"); 
        }
     }
    
    }
    public static int menu(){
             int choice; 
             Scanner keyboard = new Scanner(System.in); 
            System.out.println();
            System.out.println("-----------------"); 
            System.out.println("0. Exit the Program"); 
            System.out.println("1: Display To-Do List");
            System.out.println("2: Add Item to List"); 
            System.out.println("3.Remove Item to List"); 
            System.out.println(); 
            System.out.println("Enter Choice: "); 
            choice = keyboard.nextInt(); 
            return choice; 
            
        }

    public static void showList(){
        System.out.println();
        System.out.println("----------");
        System.out.println("To-Do List: ");
        System.out.println("-----------");
        int number = 0; 
        for (String item : currentList){
            System.out.println(++number+""+ item);
        }
        System.out.println("----------");
    }

    public static void addItem(){
        System.out.println("Add Item");
        System.out.println("-----------");
        System.out.println("Enter an item: ");
        Scanner scanner = new Scanner(System.in); 
        String item = scanner.nextLine(); 
        currentList.add(item); 
        showList();
    }

    public static void removeItem() {
        System.out.println("Remove Item");
        System.out.println("-----------");
        Scanner scanner = new Scanner(System.in); 
        System.out.println("What Do You Want to Remove?");
        int index = scanner.nextInt(); 
        if ((index-1)<0 || index> currentList.size()) {
            System.out.println("Wrong index number! Please enter in range 1 to "+currentList);
        }else {
            currentList.remove(index-1); 
        }
        System.out.println("--------------");
        showList();
    }
}  

        
    
