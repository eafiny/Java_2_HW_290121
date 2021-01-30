package hw1_Game;

public class Treadmill implements Barrier {
    private int distance;

    public Treadmill (int distance){
        this.distance = distance;
    }
    @Override
    public void demandAction(GamePlayers player) {
        if (player.run() > distance){
            System.out.println("Barrier Threadmill is completed!");
        } else {
            System.out.println("Barrier Threadmill is NOT completed! Game over!");
            player.disablePlayer();
        }
        System.out.println();
    }
}
