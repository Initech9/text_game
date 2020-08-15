import java.util.*;

public class Player implements Runnable {

    public int health = 100;
    public String name;
    public int attackPower = 9;
    public int mapLocation;
    Scanner userInput;
    public String direct;


    Player(int location){

        this.mapLocation = location;
        //this.health = this.health - attacked;
    };


    public void run(){  
        System.out.println("thread is running...");  
 




      
       
            //enterDirection();
            //userInput = new Scanner(System.in); // Create a Scanner object
            //direct = userInput.nextLine();
           //System.out.println("Enter direction");
               //return direct;
//            Thread.sleep(1000);
  //          Thread.currentThread().interrupt();
  //          userInput = new Scanner(System.in); // Create a Scanner object
  //         String direct = userInput.nextLine();0

            
            try(Scanner in = new Scanner(System.in)) {
                System.out.print("Please enter your name: ");
                String name = in.nextLine();
                if(name.trim().isEmpty()) {
                    name = "TEST"; // default user name
                }else{} }
                //System.out.println("Name entered = " + name);

            
         
            
        catch(Exception e)
        {
            e.printStackTrace();


            
        }
        
    
        

 
 
    }

    public void interrupt(){
        Thread.currentThread().interrupt();

    }

    public String enterDirection(){
        
        userInput = new Scanner(System.in); // Create a Scanner object
        String direct = userInput.nextLine();
       //System.out.println("Enter direction");
         
       
       return direct;
       }
    
}