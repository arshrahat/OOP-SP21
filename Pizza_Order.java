package pizzaa;

public class Pizza_Order {
     private  PIZZAA[] piz=new PIZZAA[3];
    
   
    public Pizza_Order(PIZZAA [] pizs){
        
            piz=pizs;
        
        
    }

    public void setPizzas(PIZZAA[] pizs) {
           piz = pizs;
    }

    public PIZZAA[] getPizzas() {
        return piz;
    }
    
    public double calcTotal(){
        double totalCost = 0;
        for(int i=0;i<piz.length;i++){
             if(piz[i]!=null)
            totalCost+=piz[i].calcCost();
            
        }
       
        
        System.out.println("Total cost : ");
        return totalCost;
    }
  
    
         
         
         
    
         
         
         
         
     
         
     }
