
package pizzaa;

public class lab7_runner {
    public static void main(String[] args) {
        
        PIZZAA p1 = new PIZZAA ("small", 1,2,3);
        PIZZAA p2 = new PIZZAA ("medium", 3,2,1);
        Pizza_Order or =new Pizza_Order(new PIZZAA[]{p1,p2}); 
        System.out.println(or.calcTotal());
        p1.getDescription();
    }
    
}
        
     
        
        
        
        
    
    

    

