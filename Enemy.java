import java.util.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//import javax.swing.*;
//import java.awt.*;//


//Window activeWindow = javax.swing.FocusManager.getCurrentManager().getActiveWindow();


public class Enemy implements Runnable {

    //KeyboardFocusManager currentManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();  
//Window activeWindow = getActiveWindow();






    //Window activeWindow;
    public int health = 100;
    public String name;
    public int attackPower = 9;


    

    //enum Modes {ROAM, ATTACK};
      
    public short mode;

    public short attack = 5;
    public int mapLocation;
    public boolean movement;
    public Random random = new Random();   
    public int rand; 
    public int newLocation;
    public String exits = "11111111";
    Robot robot;

    Enemy(String namee, int location){

        this.name = namee;
        this.mapLocation = location;   
        
        //this.movement = true;
        //this.health = this.health - attacked;
    };

    public void run(){  
        
        System.out.println("thread is running...");  
 
        
       // javax.swing.FocusManager.getCurrentManager().getGlobalActiveWindow();



        try
        {
            robot = new Robot();
            Thread.sleep(700);
            //this.mapLocation += this.newLocation;

            //System.out.println("NEW " + newLocation);

            rand = random.nextInt(9); 

            

            
            //activeWindow = getSelectedWindow(5);



            
            while(movement == true ){
                //activeWindow = getActiveWindow();




               

                //System.out.println("WINDOW" + activeWindow );
                Thread.sleep(TimeUnit.SECONDS.toMillis(5));
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            
            //System.out.println("WINDOW WOW" + activeWindow.getName() );
           // this.enemy = new Enemy(3);
           if(this.mode == 1){
            for(int i=0; i < 5; i++){
            enemyAttack();
                Thread.sleep(500);
            }
        }else
            this.mode = 0;


    }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
 
 
 
    }

    public void enemyAttack(){

       
            System.out.println(this.name + " attacks you for " + this.attack + " damage!!");



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