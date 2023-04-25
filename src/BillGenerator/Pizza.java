package BillGenerator;
import java.util.*;

public class Pizza extends Domino{
                                        //Pizza sizes
    String Regular="Regular";
    String Medium="Medium";
    String Large="Large";
                                      //Crust varieties
    private int newHandTossed;
    private int WheatThinCrust100;
    private int CheeseBurst;
    private int FreshPanPizza;
    private int ClassicHandTossed;
                                      //Veg Toppings
    private int GrilledMushroom;
    private int Onion;
    private int CrispCapsicum;
    private int FreshTomato;
    private int Paneer;
    private int RedPepper;
    private int Jalapeno;
    private int BlackOlive;
                                 //Non Veg Toppings
    private int Barbecue;
    private int Periperi;
    private int GrilledChicken;
    private int Rasher;
    private int ChickenSausage;
    private int ChickenTikka;
    private int ChickenPepperum;
    private int Chicken65;
                                  //Additional
    private int Cheese=50;
    private int PaperBag=20;
                                  // Cost List
    private ArrayList<Integer>cost=new ArrayList<>();
    private ArrayList<String>Itemsordered=new ArrayList<>();
    private int totalcost=0;


    Pizza(String size, int crust,String Type,ArrayList<String>Topping,String cheese) {
        if (size.equalsIgnoreCase(Regular)) {
            switch (crust) {
                case 1 -> {
                    this.newHandTossed = 259;
                    this.cost.add(newHandTossed);
                    this.Itemsordered.add("New Hand Tossed crust - R");
                }
                case 2 -> {
                    this.WheatThinCrust100 = 304;
                    this.cost.add(this.WheatThinCrust100);
                    this.Itemsordered.add("100% WheatThin crust - R");
                }
                case 3 -> {
                    this.CheeseBurst = 354;
                    this.cost.add(this.CheeseBurst);
                    this.Itemsordered.add("Cheese Burst crust - R");
                }
                case 4 -> {
                    this.FreshPanPizza = 304;
                    this.cost.add(this.FreshPanPizza);
                    this.Itemsordered.add("Fresh Pan Pizza crust - R");
                }
                case 5 -> {
                    this.ClassicHandTossed = 259;
                    this.cost.add(this.ClassicHandTossed);
                    this.Itemsordered.add("Classic Hand Tossed crust - R");
                }
            }

        } else if (size.equalsIgnoreCase(Medium)) {
            switch (crust) {
                case 1 -> {
                    this.newHandTossed = 459;
                    this.cost.add(this.newHandTossed);
                    this.Itemsordered.add("New Hand Tossed crust - M");
                }
                case 2 -> {
                    this.WheatThinCrust100 = 524;
                    this.cost.add(this.WheatThinCrust100);
                    this.Itemsordered.add("100% WheatThin crust - M");
                }
                case 3 -> {
                    this.CheeseBurst = 578;
                    this.cost.add(this.CheeseBurst);
                    this.Itemsordered.add("Cheese Burst crust - M");
                }
                case 4 -> {
                    this.FreshPanPizza = 514;
                    this.cost.add(this.FreshPanPizza);
                    this.Itemsordered.add("Fresh Pan Pizza crust - M");
                }
                case 5 -> {
                    this.ClassicHandTossed = 510;
                    this.cost.add(this.ClassicHandTossed);
                    this.Itemsordered.add("Classic Hand Tossed crust - M");
                }
            }

        } else if (size.equalsIgnoreCase(Large)) {
            switch (crust) {
                case 1 -> {
                    this.newHandTossed = 689;
                    this.cost.add(this.newHandTossed);
                    this.Itemsordered.add("New Hand Tossed crust - L");
                }
            }
        }

                            //Veg and Non Veg Toppings Addition
//        Pizza(String Type, ArrayList < String > Topping, String size) {
            String Toppings[] = Topping.toArray(new String[Topping.size()]);
            //Veg Toppings Addition
            if (Type.equalsIgnoreCase("veg")) {
                for (int i = 0; i < Toppings.length; i++) {
                    String option = Toppings[i];
                    switch (option) {
                        case "1" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.GrilledMushroom = 35;
                                this.cost.add(this.GrilledMushroom);
                                this.Itemsordered.add("Topping Grilled Mushroom");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.GrilledMushroom = 60;
                                this.cost.add(this.GrilledMushroom);
                                this.Itemsordered.add("Topping Grilled Mushroom");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.GrilledMushroom = 80;
                                this.cost.add(this.GrilledMushroom);
                                this.Itemsordered.add("Topping Grilled Mushroom");
                            }
                        }
                        case "2" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.Onion = 35;
                                this.cost.add(this.Onion);
                                this.Itemsordered.add("Topping Onion");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.Onion = 60;
                                this.cost.add(this.Onion);
                                this.Itemsordered.add("Topping Onion");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.Onion = 80;
                                this.cost.add(this.Onion);
                                this.Itemsordered.add("Topping Onion");
                            }
                        }
                        case "3" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.CrispCapsicum = 35;
                                this.cost.add(this.CrispCapsicum);
                                this.Itemsordered.add("Topping Crisp Capsicum");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.CrispCapsicum = 60;
                                this.cost.add(this.CrispCapsicum);
                                this.Itemsordered.add("Topping Crisp Capsicum");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.CrispCapsicum = 80;
                                this.cost.add(this.CrispCapsicum);
                                this.Itemsordered.add("Topping Crisp Capsicum");
                            }
                        }
                        case "4" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.FreshTomato = 35;
                                this.cost.add(this.FreshTomato);
                                this.Itemsordered.add("Topping Fresh Tomato");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.FreshTomato = 60;
                                this.cost.add(this.FreshTomato);
                                this.Itemsordered.add("Topping Fresh Tomato");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.FreshTomato = 80;
                                this.cost.add(this.FreshTomato);
                                this.Itemsordered.add("Topping Fresh Tomato");
                            }
                        }
                    }
                }
                                                 //Non veg Toppings addition
            } else if (Type.equalsIgnoreCase("nonveg")) {
                for (int i = 0; i < Toppings.length; i++) {
                    String option = Toppings[i];
                    switch (option) {
                        case "1" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.Barbecue = 50;
                                this.cost.add(this.Barbecue);
                                this.Itemsordered.add("Topping Barbecue");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.Barbecue = 75;
                                this.cost.add(this.Barbecue);
                                this.Itemsordered.add("Topping Barbecue");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.Barbecue = 95;
                                this.cost.add(this.Barbecue);
                                this.Itemsordered.add("Topping Barbecue");
                            }
                        }
                        case "2" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.Periperi = 50;
                                this.cost.add(this.Periperi);
                                this.Itemsordered.add("Topping Periperi");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.Periperi = 75;
                                this.cost.add(this.Periperi);
                                this.Itemsordered.add("Topping Periperi");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.Periperi = 95;
                                this.cost.add(this.Periperi);
                                this.Itemsordered.add("Topping PeriPeri");
                            }
                        }
                        case "3" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.GrilledChicken = 50;
                                this.cost.add(this.GrilledChicken);
                                this.Itemsordered.add("Topping Grilled Chicken");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.GrilledChicken = 75;
                                this.cost.add(this.GrilledChicken);
                                this.Itemsordered.add("Topping Grilled Chicken");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.GrilledChicken = 95;
                                this.cost.add(this.GrilledChicken);
                                this.Itemsordered.add("Topping Grilled Chicken");
                            }
                        }
                        case "4" -> {
                            if (size.equalsIgnoreCase("Regular")) {
                                this.ChickenSausage = 50;
                                this.cost.add(this.ChickenSausage);
                                this.Itemsordered.add("Topping Chicken Sausage");
                            } else if (size.equalsIgnoreCase("Medium")) {
                                this.ChickenSausage = 75;
                                this.cost.add(this.ChickenSausage);
                                this.Itemsordered.add("Topping Chicken Sausage");
                            } else if (size.equalsIgnoreCase("Large")) {
                                this.ChickenSausage = 95;
                                this.cost.add(this.ChickenSausage);
                                this.Itemsordered.add("Topping Chicken Sausage");
                            }
                        }
                    }
                }
            }
                                             //cheese addition
        if(cheese.equalsIgnoreCase("Yes")){
            cost.add(this.Cheese);
            this.Itemsordered.add("Extra cheese");
        }
//        }
    }

                                 //final individual pizza cost and receipt generation
    void calculatepizzabill(){
        costlist.add(cost);
        Bill.add(Itemsordered);
    }
                                                 //removal of pizza
    public void pizzaremoval(int i) {
        costlist.remove(i-1);
        Bill.remove(i-1);
    }
    public void itemsremoval(int i,ArrayList<Integer> items){
        for(int j=0;j<items.size();j++){
            int no=items.get(j)-j;
           costlist.get(i-1).remove(no);
           Bill.get(i-1).remove(no);
        }
    }
}
