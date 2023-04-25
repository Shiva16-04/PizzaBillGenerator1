package BillGenerator;
import java.util.*;

public class Domino {
    protected static ArrayList<ArrayList<Integer>>costlist=new ArrayList<>();
    protected static ArrayList<ArrayList<String>>Bill=new ArrayList<>();
    private static ArrayList<Integer> finalamount=new ArrayList<>();
    private static ArrayList<String>totalamount=new ArrayList<>();
                                                         //Menu ArrayLists
    private static String m1[]={"1. New Hand Tossed", "2. 100% WheatThin crust", "3. Cheese Burst crust","4. Fresh Pan Pizza crust","5. Classic Hand Tossed crust"};
    private static String R[]={"259", "304", "354","304","259"};
    private static String M[]={"459", "524", "578","514","510"};
    private static String L[]={"689", "NA", "NA","NA","NA"};
    private static String TV[]={"1. Grilled Mushroo", "2. Oniont", "3. Crisp Capsicum","4. Fresh Tomato"};
    private static String TNV[]={"1. Barbecue", "2. Periperi", "3. Grilled Chicken","4. Chicken Sausage"};


    private static int sum=0;

    public static void Menu(){
        System.out.println("Pizza Sizes");
        System.out.println("Regular (Serves 1) Medium (Serves 2) Large (Serves 4)");
        System.out.printf("%-30s%-10s%-10s%-10s\n","Crust","Regular","Medium","Large");
        for(int i=0;i<R.length;i++){
            System.out.printf("%-30s%-10s%-10s%-10s\n",m1[i],R[i],M[i],L[i]);
        }
        System.out.printf("%-28s%-10s\n","Veg Toppings","Non Veg Toppings");
        for(int i=0;i<TV.length;i++){
            System.out.printf("%-30s%-10s\n",TV[i],TNV[i]);
        }

    }
    public static void bagadd(String paperbag){
        if(paperbag.equalsIgnoreCase("yes")){
            ArrayList<Integer>fnl1=new ArrayList<>();
            fnl1.add(20);
            costlist.add(fnl1);
            ArrayList<String>fnl=new ArrayList<>();
            fnl.add("Paper Bag");
            Bill.add(fnl);
        }
    }
    public static void billgeneration1(String decision,int v,int nv){
        finalamount.add(0);
        costlist.add(finalamount);
        totalamount.add("Total Amount");
        Bill.add(totalamount);
        sum=0;
        for (int i = 0; i < costlist.size(); i++) {
            for (int j = 0; j < costlist.get(i).size(); j++) {
                sum = sum + costlist.get(i).get(j);
            }
        }
        costlist.get(costlist.size()-1).set(0,sum);
        if(decision.equalsIgnoreCase("yes")) {
            for (int i = 0; i < Bill.size() && i < costlist.size(); i++) {
                if (v != 0) System.out.println("Pizza" + (i + 1) + "-(Veg)");
                else if (nv != 0) System.out.println("Pizza" + (i + 1) + "-NonVeg");
                for (int j = 0; j < Bill.get(i).size(); j++) {
                    System.out.printf("%-28s %4s\n", Bill.get(i).get(j), costlist.get(i).get(j));
                }
                if (v != 0) v--;
                else if (nv != 0) nv--;
            }
        }
    }

                                     //Total final Amount Generation
    public static void billgeneration2(String bill,int v,int nv) {
        sum=0;
            for (int i = 0; i < costlist.size()-1; i++) {
                for (int j = 0; j < costlist.get(i).size(); j++) {
                    sum = sum + costlist.get(i).get(j);
                }
            }
            costlist.get(costlist.size()-1).set(0,sum);

            if (bill.equalsIgnoreCase("Yes")) {

                System.out.printf("%-28s %4s\n", "Items ordered", "Amount(Rs)");
                for (int i = 0; i < Bill.size() && i < costlist.size(); i++) {
                    if (v != 0) System.out.println("Pizza" + (i + 1) + "-(Veg)");
                    else if (nv != 0) System.out.println("Pizza" + (i + 1) + "-NonVeg");
                    for (int j = 0; j < Bill.get(i).size(); j++) {
                        System.out.printf("%-28s %4s\n", Bill.get(i).get(j), costlist.get(i).get(j));
                    }
                    if (v != 0) v--;
                    else if (nv != 0) nv--;
                }
            }

    }
}
