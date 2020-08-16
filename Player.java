import java.util.*;

public class Player implements Runnable {

    public int health = 100;
    public String name;
    public int attackPower = 9;
    public int mapLocation;
    Scanner userInput;
    public String direct;
    public boolean isTyping = false;


    Player(int location){

        this.mapLocation = location;
        //this.health = this.health - 
        
        
    };


    public void run(){  
        System.out.println("thread is running...");  
 
        // enterDirection();
                   
        //     try(Scanner in = new Scanner(System.in)) {
        //         System.out.print("Please enter your name: ");
        //         String name = in.nextLine();
        //         if(name.trim().isEmpty()) {
        //             name = "TEST"; // default user name
        //         }else{} }
        //         //System.out.println("Name entered = " + name);

            
         
            
        // catch(Exception e)
        // {
        //     e.printStackTrace();


            
        // }
        
    }

    public void interrupt(){
        Thread.currentThread().interrupt();

    }

    public void displayHealth(){

        System.out.println("Health: " + this.health);
    }

    public String enterDirection(){
        isTyping = true;
        
        userInput = new Scanner(System.in); // Create a Scanner object
        String direct = userInput.nextLine();
       //System.out.println("Enter direction");
         
       isTyping = false;
       return direct;
       }
    
}