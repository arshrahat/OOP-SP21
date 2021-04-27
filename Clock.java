
package clock;


public class Clock {

    
        
   public int hour; 
   public int minutes; 
   public int seconds; 

   

   

   public Clock (int hr, int min, int sec) {
      this.hour=hr;
      this.minutes=min;
      this.seconds=sec;
      
      
   }

    public int getHr() {
        return hour;
    }

    public void setHr(int hr) {
        this.hour = hr;
    }

    public int getMin() {
        return minutes;
    }

    public void setMin(int min) {
        this.minutes = min;
    }

    public int getSec() {
        return seconds;
    }

    public void setSec(int sec) {
        this.seconds = sec;
    }
   
   
   
   
   public void displya(){
       if (hour <= 24 & minutes < 60 & seconds < 60) 
        {
            System.out.println(hour+ ":" + minutes+":" + seconds+" hrs");
        }
        else 
        {
            System.out.println("Invalid Time Entered    Time should be less than 24:59:59 ");
        }

    }

}

