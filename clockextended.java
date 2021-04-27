
package clock;


public class clockextended extends Clock {
    
    
	public clockextended(int hours, int minutes, int seconds) 
    {
        super(hour, minutes, seconds);
    }
    
    public void display()
    {
        if (hour<=24 & minutes<60 & seconds<60)
        {
            if(hour<12 || hour==24)
            {
                System.out.println(hour + ":" + minutes + ":" + seconds+" AM");
            }
            else if(hour>=12 && hour<24)
            {
                System.out.println(hour %12 + ":" + minutes + ":" + seconds +" PM");
            }
        } 
        super.displya();
        
    }    
}

