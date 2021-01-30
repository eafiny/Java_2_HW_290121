package hw1_Game;

public class Game {
    public static void main(String[] args) {
        new Game().go();
    }

    void go(){
        GamePlayers[] players = {
                new Man(1500, 1.5),
                new Cat(500, 0.5),
                new Robot(10000, 0.5)
        };
        Barrier[] barriers = {
                new Wall(1),
                new Treadmill(1000)
        };
        for (GamePlayers player:players)
            for (Barrier barrier:barriers){
                if(player.canPlay()) barrier.demandAction(player);
            }
    }
}
