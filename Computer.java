
package computer;


public class Computer {

     protected int wordsize;//in bits
    protected int memorysize;//in megabytes
    protected int storagesize;//in megabytes
    protected int speed;//in megaHertz
    public Computer(){
        wordsize=0;
        memorysize=0;
        storagesize=0;
        speed=0;
    }
    public Computer(int wordSize,int memorySize,int storageSize,int speed){
        this.wordsize=wordSize;
        this.memorysize=memorySize;
        this.storagesize=storageSize;
        this.speed=speed;
    }

    public int getWordSize() {
        return wordsize;
    }

    public void setWordSize(int wordSize) {
        this.wordsize = wordSize;
    }

    public int getStorageSize() {
        return storagesize;
    }

    public void setStorageSize(int storageSize) {
        this.storagesize = storageSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMemorySize() {
        return memorysize;
    }

    public void setMemorySize(int memorySize) {
        this.memorysize = memorySize;
    }
  
    public void Display(){
        System.out.println("\n The word size in bits is "+wordsize+
                "\n The memory size in megabytes is "+memorysize+
                "\n The storage size in megabytes is "+storagesize+
                "\n The speed in mega hertz is "+speed);
    }

    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

