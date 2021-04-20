
package publication;


public class Book extends Publication {
    
    
     private int pagecount;

    public Book( int price, String title, int pc) {
        
        super (price,title);
        this.pagecount=pc;
        
    }
                
    public void setPagecount (int pc)   {
        this.pagecount=pc;
    }         
                
                
    public int getPagecount(){
        return pagecount;
    }            
                
    public void display() {
        System.out.println (" Book information " + title + "price is " + price + " and the number of pages are " + pagecount );}          
                
    
}
