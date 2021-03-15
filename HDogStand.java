
package hdogstand;

public class HDogStand {
    
    private int ID;
    private int sold_hdogs;
    HDogStand()
    {
        ID=170157;
        sold_hdogs=3;
    }
    HDogStand(int id,int s)
    {
        ID=id;
        sold_hdogs=s;
    }
    public void setID(int id)
    {
        ID=id;
    }
    public int getID()
    {
        return (ID);
    }
    public void setSold(int s)
    {
       sold_hdogs=s;
    }
    public int getSold()
    {
        justSold();
        return (sold_hdogs);
    }
    public void justSold()
    {
       sold_hdogs+=1;
        //return (sold_hdog);
    }
    }

    
    

