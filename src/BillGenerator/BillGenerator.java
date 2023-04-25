package BillGenerator;
import java.util.*;

public class BillGenerator {
    public static void main(String[] args) {
        Pizza pi = null;
        System.out.println("What is your name?");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+name+". Welcome to ACCIO PIZZA HOUSE\nHere is the Menu to the door of CUSTOMIZED PIZZAS.Hope you enjoy it...");
        Domino.Menu();
        System.out.print("How many pizzas do you want to order: ");
        int n=sc.nextInt();
        System.out.print("How many veg Pizzas do you want to order: ");
        int v=sc.nextInt();
        System.out.print("How many Non veg Pizzas do you want to order: ");
        int nv=sc.nextInt();
        for(int i=1;i<=v;i++){
            String veg="veg";
            System.out.println("Size of veg pizza "+i+" you want to eat?");
            String size=sc.next();
            System.out.println("Crust of pizza "+i+" you want to eat?\nChoose options from the menu provided: ");
            int crust=sc.nextInt();
            System.out.println("What are the veg toppings that you want to add on?\nYou can choose multiple toppings from the menu provided\nType \"done\" after choosing options");
            ArrayList<String>Toppings=new ArrayList<>();
            String topping="notdone";
            while(!(topping.equals("done"))){
                topping=sc.next();
                Toppings.add(topping);
            }
            System.out.println("Do you want extra cheese to be added? Reply with Yes/No");
            String cheese=sc.next();
            pi = new Pizza(size,crust,veg,Toppings,cheese);
            pi.calculatepizzabill();
        }
        for(int i=v+1;i<=n;i++){
            String veg="nonveg";
            System.out.println("Size of non veg pizza "+i+" you want to eat?");
            String size=sc.next();
            System.out.println("Crust of pizza "+i+" you want to eat?\nChoose options from the menu provided: ");
            int crust=sc.nextInt();
            System.out.println("What are the veg toppings that you want to add on?\nYou can choose multiple toppings from the menu provided\nType \"done\" after choosing options");
            ArrayList<String>Toppings=new ArrayList<>();
            String topping="notdone";
            while(!(topping.equals("done"))){
                topping=sc.next();
                Toppings.add(topping);
            }
            System.out.println("Do you want extra cheese to be added? Reply with Yes/No");
            String cheese=sc.next();
            pi = new Pizza(size,crust,veg,Toppings,cheese);
            pi.calculatepizzabill();
        }
        System.out.println("Do you want Paper bag to carry? Reply with Yes/No");
        String paperbag=sc.next();
        Domino.bagadd(paperbag);
        System.out.println("Your Bill according to the items you have ordered...");
        String finalbill="yes";
        Domino.billgeneration1(finalbill,v,nv);
        System.out.println("Do you want to remove any items? Reply with Yes/No");
        String removal=sc.next();
        if (removal.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to remove any pizza? Reply with Yes/No");
            removal=sc.next();
            if(removal.equalsIgnoreCase("Yes")){
                System.out.println("Enter the serial number of the ordered pizza according to the bill that you want to remove");
                int i=sc.nextInt();
                pi.pizzaremoval(i);
            }
            System.out.println("Do you want to remove any items from the particular pizzas ordered ? Reply with Yes/No");
            String remove=sc.next();
            if(remove.equalsIgnoreCase("yes")){
                for(;;){
                   System.out.println("What is the pizza number according to the bill in which you want to remove items: ");
                   int i=sc.nextInt();
                    System.out.println("What are the topping nos that you want to remove according to the bill.\nYou can choose multiple toppings from the menu provided\nType \"done\" after choosing options");
                    ArrayList<Integer>Toppings=new ArrayList<>();
                    String topping="notdone";
                    while(!(topping.equals("done"))){
                        topping=sc.next();
                        if(topping.equalsIgnoreCase("done"))break;
                        int no=topping.charAt(0)-48;
                        Toppings.add(no);
                    }
                    System.out.println("Do you still want to remove any items from other pizzas. Reply with Yes/No");
                    String descision =sc.next();
                    pi.itemsremoval(i,Toppings);
                    if(descision.equalsIgnoreCase("no"))break;
                }
            }
        }
        System.out.println("Final AI generated Bill Receipt");
        Domino.billgeneration2("yes",v,nv);
        System.out.println("Have a nice day!!!");
    }
}
