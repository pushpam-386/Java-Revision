public class Main {
    public static void main(String[] args){
        Shapes shapes=new Shapes();
        shapes.area(new Circle(4));
        shapes.area(new Rectangle(10,20));
        shapes.area(new Square(20));
    }
}