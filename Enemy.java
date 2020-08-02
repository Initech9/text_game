public class Enemy {

    public int health = 100;
    public String name;
    public int attackPower = 9;

    Enemy(){

        //this.health = this.health - attacked;
    };

    void attackPlayer(Player plr){
        plr.health -= this.attackPower;

    };
    
}