package hw1_Game;

public class Cat implements GamePlayers{
    private int distance;//m
    private  double jumpHeight;//m
    boolean canPlay = true;

    @Override
    public boolean canPlay() {
        return canPlay;
    }

    @Override
    public void disablePlayer() {
        canPlay = false;
    }

    public Cat(int distance, double jumpHeight) {
        this.distance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int run(){
        System.out.println("Cat is running...");
        return distance;
    }
    @Override
    public double jump(){
        System.out.println("Cat is jumping...");
        return jumpHeight;
    }
}
