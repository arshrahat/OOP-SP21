package calculator;

public class Calculator {

    private static double Firstnum;
    private static double Secondnum;

    public Calculator(double n1, double n2) {
        Firstnum = n1;
        Secondnum = n2;
    }
    
    
    public void setFirstnum(int n1) {
        Firstnum = n1;
    }

    public void setSecondnum(int n2) {
        Secondnum = n2;
    }

    public double getFirstnum() {
        return Firstnum;
    }

    public double getSecondnum() {
        return Secondnum;
    }



public static void sum(){
        double add = Firstnum + Secondnum;
        System.out.println(Firstnum+"+"+Secondnum+" = "+add); 
    }
    
        public static void multiply(){
        double m = Firstnum * Secondnum;
        System.out.println(Firstnum+"*"+Secondnum+" = "+m);
        
    }
    
        public static void divide(){
        double d = Firstnum / Secondnum;
        System.out.println(Firstnum+"/"+Secondnum+" = "+d);
        
    }
    
        public static void modulus(){
        double mod = Firstnum % Secondnum;
        System.out.println(Firstnum+"%"+Secondnum+" = "+mod);
        
    }
    
        public static void sine(){
        double radian = Math.toRadians(Firstnum);
        double sin = Math.sin(radian);
        System.out.println("sine of "+Firstnum+" is "+sin);
    }
    
        public static void cosine(){
        double radian = Math.toRadians(Secondnum);
        double cos = Math.sin(radian);
        System.out.println("cosine of "+Secondnum+" is "+cos);
    }
     
        public static void tangent(){
        double radian= Math.toRadians(Secondnum);
        double tan = Math.sin(radian);
        System.out.println("tangent of "+Secondnum+" is "+tan);
    }
}
