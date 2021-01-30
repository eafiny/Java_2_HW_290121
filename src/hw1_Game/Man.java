package hw1_Game;

public class Man implements GamePlayers {
    private int distance; //m
    private double jumpHeight; //m
    boolean canPlay = true;

    public Man (int distance, double jumpHeight){
        this.distance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean canPlay() {
        return canPlay;
    }

    @Override
    public void disablePlayer() {
        canPlay = false;
    }

    @Override
    public int run(){
        System.out.println("Man is running...");
        return distance;
    }
    @Override
    public double jump(){
        System.out.println("Man is jumping...");
        return jumpHeight;
    }
}
