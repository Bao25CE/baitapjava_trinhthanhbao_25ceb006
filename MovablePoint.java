public class MovablePoint {
        int x;
        int y;
        int xSpeed;
        int ySpeed;

        public MovablePoint(int y, int x, int xSpeed, int ySpeed) {
            this.y = y;
            this.x = x;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public String toString(){
            return "("+x+","+y+") Speed = ("+xSpeed+ ","+ ySpeed+")";
        }
        public void moveUp(){
            y -= ySpeed;
        }
        public void moveDown(){
            y += ySpeed;
        }
        public void moveLeft(){
            x -= xSpeed;
        }
        public void moveRight(){
            x += xSpeed;
        }
    }
