import java.util.*;

public class Enemy implements Runnable{

    public int health = 100;
    public String name;
    public int attackPower = 9;

    public int mapLocation;
    public boolean movement;
    public Random random = new Random();   
    public int rand; 
    public int newLocation;
    public String exits = "11111111";

    Enemy(String namee, int location){

        this.name = namee;
        this.mapLocation = location;   
        //this.movement = true;
        //this.health = this.health - attacked;
    };

    public void run(){  
        System.out.println("thread is running...");  
 
        try
        {
            Thread.sleep(700);
            //this.mapLocation += this.newLocation;

            //System.out.println("NEW " + newLocation);

            rand = random.nextInt(9); 
           // this.enemy = new Enemy(3);

        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
 
 
 
    }

    public int moveAround(int location){

     

        
        // if(movement == true){
        //     this.mapLocation += 1;
        //     //movement = false;
        // };
        
            return location;
    }

    
    void attackPlayer(Player plr){
        plr.health -= this.attackPower;

    };
    


}