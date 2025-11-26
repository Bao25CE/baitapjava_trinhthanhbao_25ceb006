public class Rectangle {
    private double Width;
    private double Length;
    public Rectangle(double width, double length){
        this.Length = length;
        this.Width = width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "Width=" + Width +
                ", Length=" + Length +
                '}';
    }
    public double getArea(){
        return Width * Length;
    }
    public double getPremeter(){
        return 2 * (Width + Length);
    }

}
