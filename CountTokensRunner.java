
package counttokens;

import java.util.StringTokenizer;


public class CountTokensRunner {
    

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Areesha 14");
        
   
      CountTokens c = null;
    while (st.hasMoreTokens()){
      c= new CountTokens(st.nextToken());
    }
    
    
    int count = c.getTokenCount();
        System.out.println("Total number of Tokens: "
                           + count);
    }
    
    }
    

