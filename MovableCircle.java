public class MovableCircle {
    private int raidus;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int raidus){
        this.raidus = raidus;
        this.centre = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "raidus=" + raidus +
                ", centre=" + centre +
                '}';
    }
    public void moveUp(){
        centre.moveUp();
    }
    public void moveDown(){
        centre.moveDown();
    }
    public void moveLeft(){
        centre.moveLeft();
    }
    public void moveRight(){
        centre.moveRight();
    }
}
