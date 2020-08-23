//import java.time.Year;
import java.util.*;
import java.util.Scanner;

//import jdk.internal.jshell.tool.resources.version;

//import javax.lang.model.util.ElementScanner14;

public class World {

    public Player player;
    public Enemy enemy[] = new Enemy[2];
    enum modes {ROAM, ATTACK};
    final short mode[] = {   };

    //public Enemy enemy2 = new Enemy("Orc", 1);
    public Map map = new Map();
    Scanner userInput;
    String exits;
    String exit;
    boolean allowed = false;
    String enemyExits;
    int newEnemLoc = 3;
    Thread threadPlayer;
    Thread thread;
    Thread thread2;
    String words[] = new String[10];



    String command;
    //public boolean isTyping = false;



    



    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Random random = new Random();
    Random randomTrue = new Random(System.currentTimeMillis());
    //Random randomTrue2 = new Random(System.currentTimeMillis()+321);
    int randdd =  randomTrue.nextInt();


    

    
    public World() {

        for(int i = 0; i < 10; i++){

            words[i] = "z";
    




        }

        enemy[0] = new Enemy("Dragon", 1);
        enemy[1] = new Enemy("Orc", 1);
        threadPlayer = new Thread(player);
        thread = new Thread(enemy[0]);
        thread2 = new Thread(enemy[1]);
        // System.out.println("DRAGLOC " + enemy.mapLocation);
        this.player = new Player(4);

        // this.enemy
        threadPlayer.start();
        thread.start();
        thread2.start();
        enemy[0].movement = true;
        enemy[1].movement = true;
        // enemy.movement = true;
        exits = this.map.map[player.mapLocation];
        //enemyExits = this.map.map[enemy[0].mapLocation];
        enemy[0].exits = this.map.map[enemy[0].mapLocation];
        enemy[1].exits = this.map.map[enemy[1].mapLocation];
        enemy[0].movement = true;
        enemy[1].movement = true;
        while (true) {
            // exits = map.map[player.mapLocation];
            //enemyExits = this.map.map[enemy[0].mapLocation];
            enemy[0].exits = this.map.map[enemy[0].mapLocation];
            enemy[1].exits = this.map.map[enemy[1].mapLocation];

           
            //System.out.println("Obvious exits: ");


            //randdd =  Math.abs( randomTrue.nextInt();
            //randdd = randomTrue;

            
            //randomTrue = randomTrue.nextInt();


           // double randd = randomTrue;
            //randomTrue.nextInt();



            randdd =  Math.abs( randomTrue.nextInt()  );
            enemy[1].rand = Math.abs(randdd % 9);

            randdd =  Math.abs( randomTrue.nextInt() );
            enemy[0].rand = Math.abs(randdd % 9);
            //randomTrue = new Random(System.currentTimeMillis());
            //randdd =  Math.abs( randomTrue.nextInt()+942 );
           
            //System.out.println("Enemy Exits " + enemyExits);
            //System.out.println("RAND IS" + enemy[0].rand);
            //System.out.println("RAND IS" + enemy[1].rand);
            //getExits();




            System.out.println(ANSI_RED + "Also Here: " + ANSI_RED);
            for(int i = 0; i < enemy.length; i++){


                
                enemy[i].exits = this.map.map[enemy[i].mapLocation];
                
                if(player.mapLocation == enemy[i].mapLocation)
                System.out.println( ANSI_RED + enemy[i].name + ANSI_RESET);

                };

                command = player.enterDirection();
                //enemyHere(command);
                enemyHere(command);
                enterDirection(command);


            //command = player.enterDirection();
               
                 //enemyHere(command);



                 getExits();
                
                    player.displayHealth();
               
                System.out.print(" Dragon is at map location " + enemy[0].mapLocation);
                System.out.println(" Orc is at map location  " + enemy[1].mapLocation);
                
                





                
           // }else
                

            // NOTE: CONTROL ENEMY MOVEMENT HERE!!!
            for(int i = 0; i < enemy.length; i++){
            if (enemy[i].movement == true && enemy[i].mode != 1) {
                switch (enemy[i].rand) {
                    case 0:
                        enemyGoNorth();
                        break;
                    case 1:
                        enemyGoSouth();
                        break;
                    case 2:
                        enemyGoEast();
                        break;
                    case 3:
                        enemyGoWest();
                        break;
                    case 4:
                        enemyGoNE();
                        break;
                    case 5:
                        enemyGoSE();
                        break;
                    case 6:
                        enemyGoSW();
                        break;
                    case 7:
                        enemyGoNW();
                        break;
                }
                // enemy.moveAround(newEnemLoc);
            }
            ;
        
 
            // exits = this.map.map[player.mapLocation];
            // getExits();
         }



            //enterDirection( player.enterDirection() );

            //enterDirection();
            exits = this.map.map[player.mapLocation];
            //enemyExits = this.map.map[enemy[0].mapLocation];
            
            


            // exits = map.map[player.mapLocation];
            // exits = map.map[player.mapLocation];
            }
        }



 





    

    public void enemyHere(String command) {

        //String command = player.enterDirection();

        for(int i = 0; i < enemy.length; i++ ){
        if (player.mapLocation == enemy[i].mapLocation){
            
        
            //enemy[i].mode =   enemy;
            //System.out.println(ANSI_RED + "Also Here: " + ANSI_RESET);
            
           // System.out.println(ANSI_RED + "Also Here: " + ANSI_RED + enemy[i].name + ANSI_RESET);

            enemy[i].mode = 1;//ATTACK mode

            if(player.isTyping == false && enemy[i].alive == true){
            enemy[i].displayEnemyAttack();
            player.health -= enemy[i].attack;
            }
            else if(enemy[i].alive == true && player.isTyping == false)
            player.health -= enemy[i].attack;   //NOTE THIS ONLY ATTACKS ONCE

            if( command.startsWith("a") )
            attackEnemy( command );
            //else        
            //

            //System.out.println(ANSI_RED + "Also Here: " + ANSI_RED + enemy[i].name + ANSI_RESET);

            

            
            
            //enterDirection( command  );
            
            
            //return true;

            }else{
                enemy[i].mode = 0;//ROAM mode
                //return false;
                }
            }    
           // return false;
    } 




public void attackEnemy(String attack){

    //if(words.length < 3){};
 
    if(attack.length() > 1 && attack.length() != 2){
    words[0] = attack.substring(0, 1);

    
    words[1] = attack.substring(2, 3);

    }

System.out.println("LENGTH IS " + words.length);







    if(words[0].equals("a")  ){

        System.out.println("words 1 is " );
        if( words[1].equals("o")  ){
            System.out.println("You attack Orc for 5 damage! "  + enemy[1].health);
            enemy[1].health -= 5;
    
        }else if(  words[1].equals("d") ){
            System.out.println("You attack Dragon for 5 damage! " + enemy[0].health);
            enemy[0].health -= 5;
        } 
        words[0] = "z";
    }

    //System.out.println("WORDS " + words[1]   );


    words[0] = "";
    words[1] = "";
    words[2] = null;
    words[3] = null;

}





    public void getExits() {
        // System.out.println("Player location is " + player.mapLocation);
        System.out.println(ANSI_CYAN + "Obvious exits: " + ANSI_RESET);
        // System.out.println("EXITS IS " + exits);
        System.out.println(ANSI_YELLOW );

        for (int i = 0; i < 8; i++) {

            exit = exits.substring(i, i + 1);
            // System.out.print("HAR" + exit);

            if (exit.equals("1")) {
                // allowed = true;

                switch (i) {

                    case 0:
                        System.out.print("N,");

                        break;
                    case 1:
                        System.out.print("S,");
                        break;
                    case 2:
                        System.out.print("E,");
                        break;
                    case 3:
                        System.out.print("W,");
                        break;
                    case 4:
                        System.out.print("NE,");
                        break;
                    case 5:
                        System.out.print("SE,");
                        break;
                    case 6:
                        System.out.print("SW,");
                        break;
                    case 7:
                        System.out.print("NW,");
                        break;

                }
                ;
                
            }
            ;
            
            // exits = map.map[player.mapLocation];

        }
        ;
        System.out.println("");
        System.out.print( ANSI_RESET );
        // enterDirection();
        // getExits();
    };



    public void enterDirection(String direct) {
        

        //String direction = userInput.nextLine(); // Read user input

        String direction = direct;
        // System.out.println("INPUT is: " + direction + "THIS"); // Output user input

        // System.out.println("INPUT IS " + userInput);
        // boolean allowed = false;

        if (direction.equals("")) {
            //System.out.println("NOTHING PRESSED");
        } else {
            switch (direction) {
                case "":
                    break;
                case "n":
                    goNorth();
                    break;
                case "s":
                    goSouth();
                    break;
                case "e":
                    goEast();
                    break;
                case "w":
                    goWest();
                    break;
                case "ne":
                    goNE();
                    break;
                case "se":
                    goSE();
                    break;
                case "sw":
                    goSW();
                    break;
                case "nw":
                    goNW();
                    break;

            }
            ;


        }
        ;
        player.isTyping = false;

    };

    public void goNorth() {
        if (exits.substring(0, 1).equals("1"))
            this.player.mapLocation = this.player.mapLocation - map.WIDTH;
        System.out.println("PMAP" + player.mapLocation);
    };

    public void goSouth() {
        if (exits.substring(1, 2).equals("1"))
            this.player.mapLocation = this.player.mapLocation + map.WIDTH;
    };

    public void goEast() {
        if (exits.substring(2, 3).equals("1"))
            this.player.mapLocation = this.player.mapLocation + 1;
    };

    public void goWest() {
        if (exits.substring(3, 4).equals("1"))
            this.player.mapLocation = this.player.mapLocation - 1;
    };

    public void goNE() {
        if (exits.substring(4, 5).equals("1")) {
            this.player.mapLocation = this.player.mapLocation - map.WIDTH;
            this.player.mapLocation = this.player.mapLocation + 1;
        }
        ;
    };

    public void goSE() {
        if (exits.substring(5, 6).equals("1")) {
            this.player.mapLocation = this.player.mapLocation + map.WIDTH;
            this.player.mapLocation = this.player.mapLocation + 1;
        }
        ;

    };


    public void goSW() {
        if (exits.substring(6, 7).equals("1")) {
            this.player.mapLocation = this.player.mapLocation + map.WIDTH;
            this.player.mapLocation = this.player.mapLocation - 1;

        }
        ;

    };

    public void goNW() {
        if (exits.substring(7, 8).equals("1")) {
            this.player.mapLocation = this.player.mapLocation - map.WIDTH;
            this.player.mapLocation = this.player.mapLocation - 1;

        }
        ;

    };






    public void enemyGoNorth() {
        

        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(0, 1).equals("1") && enemy[i].rand == 0  )
            enemy[i].mapLocation = this.enemy[i].mapLocation - map.WIDTH;
        };
        // System.out.println("PMAP" + player.mapLocation);
    };

    public void enemyGoSouth() {
        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(1, 2).equals("1") && enemy[i].rand == 1  )
            enemy[i].mapLocation = this.enemy[i].mapLocation + map.WIDTH;
         };
    };

    public void enemyGoEast() {
        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(2, 3).equals("1") && enemy[i].rand == 2  ) {
            enemy[i].mapLocation = this.enemy[i].mapLocation + 1;

        };

    }

    };

    public void enemyGoWest(){
        for(int i = 0; i < enemy.length ;i++){
        if(enemy[i].exits.substring(3,  4).equals("1") && enemy[i].rand == 3   ){
           enemy[i].mapLocation = enemy[i].mapLocation - 1;
      
        };
    }
    }
    public void enemyGoNE(){
       
        for(int i = 0; i < enemy.length ;i++){
            if(enemy[i].exits.substring(4,  5).equals("1")  && enemy[i].rand == 4  ){
                
                enemy[i].mapLocation = this.enemy[i].mapLocation - map.WIDTH;
                enemy[i].mapLocation = this.enemy[i].mapLocation + 1;
          
            };
        }
        }
    public void enemyGoSE(){
        
        for(int i = 0; i < enemy.length ;i++){
            //System.out.println("NOT DIAG");
                if(enemy[i].exits.substring(5,  6).equals("1")  && enemy[i].rand == 5   ){
                    
                    enemy[i].mapLocation = this.enemy[i].mapLocation + map.WIDTH;
                    enemy[i].mapLocation = this.enemy[i].mapLocation + 1;
              
                };
            };
            }
    public void enemyGoSW(){
        
        for(int i = 0; i < enemy.length ;i++){
                    if(enemy[i].exits.substring(6,  7).equals("1")  && enemy[i].rand == 6  ){
                       
                        enemy[i].mapLocation = this.enemy[i].mapLocation + map.WIDTH;
                        enemy[i].mapLocation = enemy[i].mapLocation - 1;
                  
                    };
                };
            } 
    public void enemyGoNW() {
        
        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(7, 8).equals("1") && enemy[i].rand == 7  ) {
            
            enemy[i].mapLocation = this.enemy[i].mapLocation - map.WIDTH;
            enemy[i].mapLocation = enemy[i].mapLocation - 1;

        };

    };
    }
}