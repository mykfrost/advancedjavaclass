import java.util.Scanner;

public class HesabuCode {
    public static void main(String[] args){
        // IMplement main code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Lenth of The Square ");
        int length = scanner.nextInt();
        Square square = new Square(length);

        Shapes shapes = (Square s ) ->{
            return  s.calculateArea();
        };

        System.out.println("Area is :"+ shapes.getArea(square));
    }

    public static class Square{
        private int length ;
        //constructor
        public  Square(int length){
            this.length = length;
        }
        public  int calculateArea(){
            return length*length;
        }
    }

    interface Shapes{
        public abstract int getArea(Square square);
    }
}
