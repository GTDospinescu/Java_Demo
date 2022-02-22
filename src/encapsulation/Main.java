package encapsulation;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Teo", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

//        Player player = new Player();
//        player.fullname = "Tim";
//        player.health = 20;
//        player.weapon = "Ak";
//
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 10;
//        player.health = 200; //Pot da overwrite
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
