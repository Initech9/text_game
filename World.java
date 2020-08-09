import java.util.Scanner;

//import jdk.internal.jshell.tool.resources.version;

//import javax.lang.model.util.ElementScanner14;

public class World {

    public Player player;
<<<<<<< Updated upstream
    public Enemy enemy = new Enemy();
=======
    public Enemy enemy[] = new Enemy[2];
    enum modes {ROAM, ATTACK};
    final short mode[] = {   };

    //public Enemy enemy2 = new Enemy("Orc", 1);
>>>>>>> Stashed changes
    public Map map = new Map();
    Scanner userInput;
    String exits;
    String exit;
    boolean allowed = false;
<<<<<<< Updated upstream

    public World() {
        this.player = new Player(4);
        exits = this.map.map[player.mapLocation];
        while(true){
            //exits = map.map[player.mapLocation];
        //System.out.println("Obvious exits: ");
        getExits();
        //exits = this.map.map[player.mapLocation];
        //getExits();

        enterDirection();
        exits = this.map.map[player.mapLocation];
        
       // exits = map.map[player.mapLocation]; 
       // exits = map.map[player.mapLocation];
        }
    };



    public void getExits() {
        System.out.println("Player location is " + player.mapLocation);
        
        

        
        System.out.println("EXITS IS " + exits);
        for (int i = 0; i < 8; i++) {

            exit = exits.substring(i, i + 1);
            // System.out.print("HAR" + exit);

            if (exit.equals("1")) {
                //allowed = true;

                switch (i) {

=======
    String enemyExits;
    int newEnemLoc = 3;
    Thread threadPlayer;
    Thread thread;
    Thread thread2;
    
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
        enemy[0] = new Enemy("Dragon", 1);
        enemy[1] = new Enemy("Orc", 4);
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


            
            randomTrue = new Random(System.currentTimeMillis());
            
            //randomTrue = randomTrue.nextInt();
           // double randd = randomTrue;
            //randomTrue.nextInt();
            enemy[0].rand = Math.abs(randdd % 9);
            //randomTrue = new Random(System.currentTimeMillis());
            randdd =  randomTrue.nextInt()+321;
            enemy[1].rand = Math.abs(randdd % 9);
            //System.out.println("Enemy Exits " + enemyExits);
            //System.out.println("RAND IS" + enemy[0].rand);
            //System.out.println("RAND IS" + enemy[1].rand);
            
            //if(enemyHere() == false){
                enemyHere();
                enterDirection( player.enterDirection()  );

                System.out.print(" Dragon is at map location " + enemy[0].mapLocation);
                System.out.println(" Orc is at map location  " + enemy[1].mapLocation);
                
                
                for(int i = 0; i < enemy.length; i++){
                enemy[i].exits = this.map.map[enemy[i].mapLocation];
                getExits();

                };
                
           // }else
                

            // NOTE: CONTROL ENEMY MOVEMENT HERE!!!
            for(int i = 0; i < enemy.length-1; i++){
            if (enemy[i].movement == true && enemy[i].mode != 1) {
                switch (enemy[i].rand) {
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
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

>>>>>>> Stashed changes

                };
               
                


<<<<<<< Updated upstream
=======






















    public void enemyHere() {
>>>>>>> Stashed changes

            };
               
            //exits = map.map[player.mapLocation];

<<<<<<< Updated upstream
        };
        
        
        //enterDirection();
        //getExits();
    };

    public void enterDirection(){
        userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter direction");

        String direction = userInput.nextLine();  // Read user input
        System.out.println("INPUT is: " + direction + "THIS");  // Output user input

        //System.out.println("INPUT IS " + userInput);
        //boolean allowed = false;

        if( direction.equals("") ){
            System.out.println("NOTHING");
        }else{
        switch(direction){
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
=======
        for(int i = 0; i < enemy.length; i++){
        if (player.mapLocation == enemy[i].mapLocation){
       
        
            //enemy[i].mode =   enemy;
            //System.out.println(ANSI_RED + "Also Here: " + ANSI_RESET);
            System.out.println(ANSI_RED + "Also Here: " + ANSI_RED + enemy[i].name + ANSI_RESET);
            enemy[i].mode = 1;//ATTACK mode

            enemy[i].enemyAttack();

            enterDirection( player.enterDirection()  );
            
            
            //return true;

            }else{
                enemy[i].mode = 0;//ROAM mode
                //return false;
                }
            }    
            //return false;
    } 






    public void getExits() {
        // System.out.println("Player location is " + player.mapLocation);
        System.out.println(ANSI_CYAN + "Obvious exits: " + ANSI_RESET);
        // System.out.println("EXITS IS " + exits);
        System.out.println(ANSI_YELLOW );
>>>>>>> Stashed changes



        };
        
        for (int i = 0; i < 8; i++) {

            exit = exits.substring(i, i + 1);
            // System.out.print("HAR" + exit);
 


            if (exit.equals("1") ) {

                switch (i) {

                    case 0:
                        //goNorth();
                        break;
                    case 1:
                        //
                        //goSouth();
                        break;
                    case 2:
                        //System.out.print("E,");
                        break;
                    case 3:
                        //System.out.print("W,");
                        break;
                    case 4:
                        //System.out.print("NE,");
                        break;
                    case 5:
                        //System.out.print("SE,");
                        break;
                    case 6:
                        //System.out.print("SW,");
                        break;
                    case 7:
                        //System.out.print("NW,");
                        break;

                };
    



<<<<<<< Updated upstream

            };

        };

        };
=======
    
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
>>>>>>> Stashed changes



    };

    public void goNorth(){
        if(exits.substring(0,  1).equals("1"))
        this.player.mapLocation = this.player.mapLocation - map.WIDTH;
        System.out.println("PMAP" + player.mapLocation);
    };
    public void goSouth(){
        if(exits.substring(1,  2).equals("1"))
        this.player.mapLocation = this.player.mapLocation + map.WIDTH;
    };
    public void goEast(){
        if(exits.substring(2,  3).equals("1"))
        this.player.mapLocation = this.player.mapLocation + 1;
    };
    public void goWest(){
        if(exits.substring(3,  4).equals("1"))
        this.player.mapLocation = this.player.mapLocation -1;
    };
    public void goNE(){
        if(exits.substring(4,  5).equals("1")){
            this.player.mapLocation = this.player.mapLocation - map.WIDTH;
            this.player.mapLocation = this.player.mapLocation + 1;
        };
    };
    public void goSE(){
        if(exits.substring(5,  6).equals("1")){
            this.player.mapLocation = this.player.mapLocation + map.WIDTH;
            this.player.mapLocation = this.player.mapLocation + 1;
        };
 
 
    };
    public void goSW(){
        if(exits.substring(6,  7).equals("1")){
            this.player.mapLocation = this.player.mapLocation + map.WIDTH;
            this.player.mapLocation = this.player.mapLocation -1;
 
        };


    };
    public void goNW(){
        if(exits.substring(7,  8).equals("1")){
            this.player.mapLocation = this.player.mapLocation - map.WIDTH;
            this.player.mapLocation = this.player.mapLocation -1;

        };

    };




};