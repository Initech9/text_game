import java.util.Scanner;

public class World {

    public Player player;
    public Enemy enemy = new Enemy();
    public Map map = new Map();
    Scanner userInput;
    String exits;
    String exit;
    boolean allowed = false;

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

                };
               
                



            };
               
            //exits = map.map[player.mapLocation];

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
    




            };

        };

        };



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