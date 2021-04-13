package pizzaa;

public class PIZZAA {

    private String pizzasize;
    private int cheeseT=0;
    private int peppT=0;
    private int hamT=0;
    private double calcCost;
    public PIZZAA(String ps, int ct, int pt, int ht) {
        
        cheeseT = ct;
        peppT = pt;
        hamT = ht;
        pizzasize=ps;
    }

    public void setPizzasize(String ps) {
        pizzasize = ps;
    }

    public void setCheeseT(int ct) {
        cheeseT = ct;
    }

    public void setPeppT(int pt) {
        peppT = pt;
    }

    public void setHamT(int ht) {
        hamT = ht;
    }

    public String getPizzasize() {
        return pizzasize;
    }

    public int getCheeseT() {
        return cheeseT;
    }

    public int getPeppT() {
        return peppT;
    }

    public double getHamT() {
        return hamT;
    }

    public double calcCost() {
        if (pizzasize == ("small")) {
            return 10+ (cheeseT + peppT + hamT) * 2;
            
        } 
        else if (pizzasize== ("medium") )   {
              return 12+ (cheeseT + peppT + hamT) * 2;
          }
          
        else if(pizzasize==(" large")){
               return 14+ (cheeseT + peppT + hamT) * 2;
          }
          else {return 0;
                  } 
    }
          
            
                
 public void getDescription() {
     
     System.out.println ("Pizza size: " + pizzasize + " Cheese toppings " 
				+ cheeseT + "Pepperoni toppings: "
				+ peppT + " Ham toppings: " + hamT
				+ " Pizza cost: " + calcCost());}
     
     
     
}

