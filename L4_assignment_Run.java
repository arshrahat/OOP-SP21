
package hdogstand;
public class L4_assignment_Run {
    public static void main(String[] args) {
         HDogStand h=new HDogStand();
        //System.out.println("ID = "+h.getID()+" bought "+h.getSold()+" hot dogs");
        h.setID(201202);
        h.setSold(6);
        //HotDogStand h1=new HotDogStand(201220,6);
        System.out.println("ID = "+h.getID()+" bought "+h.getSold()+" hot dogs");
        HDogStand h1=new HDogStand();
        h1.setID(250975);
        h1.setSold(7);
        System.out.println("ID = "+h1.getID()+" bought "+h1.getSold()+" hot dogs");
        HDogStand h2=new HDogStand();
        h2.setID(21108);
        h2.setSold(8);
        System.out.println("ID = "+h2.getID()+" bought "+h2.getSold()+" hot dogs");
    }
    
}
