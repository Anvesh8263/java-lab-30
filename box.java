public class Box {
    double height,width,length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getVolume(){
        return this.height*this.width*this.length;
    }
}

// Execution Class
class boxExecution{
    public static void main(String[] args) {
        Box box1 = new Box(10.2,12.3,45.6);
        System.out.println("The Volume of box is : " + box1.getVolume());
    }
}