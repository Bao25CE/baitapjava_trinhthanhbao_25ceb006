public class Circle  {
        private double raidus;
    public Circle(double radius){
        }
        @Override
        public String toString() {
            return "Circle{" +
                    "raidus=" + raidus +
                    '}';
        }
        public double getPremeter(){
            return 2 * raidus * Math.PI;
        }

}
