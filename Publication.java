package publication;

public class Publication {

    protected int price;
    protected String title;

    public Publication(int price, String title) {
        this.price = price;
        this.title = title;}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
        
       
  public void display() {
        System.out.println (" Title is " + title + "price is " + price );}     
       
                
                
    
    
    }
    

    
    
    
    
    
    
    
    
    
    





