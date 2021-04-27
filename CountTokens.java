
package counttokens;


public class CountTokens {
 static int count = 0;
    
    
   CountTokens(String token){
       boolean isDigit = false;
        if(token.charAt(0)>='0' && token.charAt(0)<='9'){
            isDigit = true;
        }
        if(!isDigit){
            count++;
        }
    }
   int getTokenCount(){
       return count;
   }
    
    
    
    
    
}


    
    

