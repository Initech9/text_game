import java.util.*;
import java.util.Scanner;

public class World {

    public Player player;
    public Enemy enemy[] = new Enemy[2];
    
    //public Enemy enemy2 = new Enemy("Orc", 1);
    public Map map = new Map();
    Scanner userInput;
    String exits;
    String exit;
    boolean allowed = false;
    String enemyExits;
    int newEnemLoc = 3;
    Thread thread;
    Thread thread2;
    
    public Random random = new Random();
    Random randomTrue = new Random(System.currentTimeMillis());

    public World() {
        enemy[0] = new Enemy("Dragon", 1);
        enemy[1] = new Enemy("Orc", 4);
        thread = new Thread(enemy[0]);
        thread2 = new Thread(enemy[1]);
        // System.out.println("DRAGLOC " + enemy.mapLocation);
        this.player = new Player(4);

        // this.enemy
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


            System.out.println("Obvious exits: ");


            getExits();
            int randdd =  randomTrue.nextInt();
            //randomTrue = randomTrue.nextInt();
           // double randd = randomTrue;
            //randomTrue.nextInt();
            enemy[0].rand = Math.abs(randdd % 9);
            randomTrue = new Random(System.currentTimeMillis());
            randdd =  randomTrue.nextInt();
            enemy[1].rand = Math.abs(randdd % 9);
            // System.out.println("ENEMY IS " + enemyExits);
            System.out.println("RAND IS" + enemy[0].rand);
            System.out.println("RAND IS" + enemy[1].rand);
            enemyHere();

            // NOTE: CONTROL ENEMY MOVEMENT HERE!!!
            for(int i = 0; i < enemy.length-1; i++){
            if (enemy[i].movement == true) {
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
            enterDirection();
            exits = this.map.map[player.mapLocation];
            //enemyExits = this.map.map[enemy[0].mapLocation];
            
            System.out.print(" DRAGON IS at  " + enemy[0].mapLocation);
            System.out.print(" ORC IS at  " + enemy[1].mapLocation);
            
            
            for(int i = 0; i < enemy.length; i++){
            enemy[i].exits = this.map.map[enemy[i].mapLocation];
            };
            // exits = map.map[player.mapLocation];
            // exits = map.map[player.mapLocation];
        }



    };

    public void enemyHere() {


        for(int i = 0; i < enemy.length; i++){
        if (player.mapLocation == enemy[i].mapLocation)
            System.out.println("Also Here: " + enemy[i].name);
        }
    };

    public void getExits() {
        // System.out.println("Player location is " + player.mapLocation);

        // System.out.println("EXITS IS " + exits);
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

        // enterDirection();
        // getExits();
    };

    public void enterDirection() {
        userInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter direction");

        String direction = userInput.nextLine(); // Read user input
        // System.out.println("INPUT is: " + direction + "THIS"); // Output user input

        // System.out.println("INPUT IS " + userInput);
        // boolean allowed = false;

        if (direction.equals("")) {
            System.out.println("NOTHING");
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
        if (enemy[i].exits.substring(0, 1).equals("1"))
            enemy[i].mapLocation = this.enemy[i].mapLocation - map.WIDTH;
        };
        // System.out.println("PMAP" + player.mapLocation);
    };

    public void enemyGoSouth() {
        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(1, 2).equals("1"))
            enemy[i].mapLocation = this.enemy[i].mapLocation + map.WIDTH;
         };
    };

    public void enemyGoEast() {
        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(2, 3).equals("1")) {
            enemy[i].mapLocation = this.enemy[i].mapLocation + 1;

        };

    }

    };

    public void enemyGoWest(){
        for(int i = 0; i < enemy.length ;i++){
        if(enemy[i].exits.substring(3,  4).equals("1") ){
           enemy[i].mapLocation = enemy[i].mapLocation - 1;
      
        };
    }
    }
    public void enemyGoNE(){
       
        for(int i = 0; i < enemy.length ;i++){
            if(enemy[i].exits.substring(4,  5).equals("1") ){
                
                enemy[i].mapLocation = this.enemy[i].mapLocation - map.WIDTH;
                enemy[i].mapLocation = this.enemy[i].mapLocation + 1;
          
            };
        }
        }
    public void enemyGoSE(){
        
        for(int i = 0; i < enemy.length ;i++){
            System.out.println("NOT DIAG");
                if(enemy[i].exits.substring(5,  6).equals("1") ){
                    
                    enemy[i].mapLocation = this.enemy[i].mapLocation + map.WIDTH;
                    enemy[i].mapLocation = this.enemy[i].mapLocation + 1;
              
                };
            };
            }
    public void enemyGoSW(){
        
        for(int i = 0; i < enemy.length ;i++){
                    if(enemy[i].exits.substring(6,  7).equals("1") ){
                       
                        enemy[i].mapLocation = this.enemy[i].mapLocation + map.WIDTH;
                        enemy[i].mapLocation = enemy[i].mapLocation - 1;
                  
                    };
                };
            } 
    public void enemyGoNW() {
        
        for(int i = 0; i < enemy.length ;i++){
        if (enemy[i].exits.substring(7, 8).equals("1")) {
            
            enemy[i].mapLocation = this.enemy[i].mapLocation - map.WIDTH;
            enemy[i].mapLocation = enemy[i].mapLocation - 1;

        };

    };
    }
}