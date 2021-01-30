package hw1_Game;

public class Wall implements Barrier {
    private int height;

    public Wall(int height){
        this.height = height;
    }
    @Override
    public void demandAction(GamePlayers player) {
        if (player.jump() > height){
            System.out.println("Barrier Wall is completed!");
        } else{
            System.out.println("Barrier Wall is NOT completed! Game over!");
            player.disablePlayer();
        }
        System.out.println();
    }
}
