package zad2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mov = new MovablePoint(0,0);
        System.out.println("Aktulana pozycja: " + mov);

        mov.moveDown();
        System.out.println("moveDown: " + mov);

        mov.moveLeft();
        System.out.println("moveLeft: " + mov);

        mov.moveUp();
        System.out.println("moveUp: " + mov);

        mov.moveRight();
        System.out.println("moveRight: " + mov);

        System.out.println("Ostateczna pozycja: " + mov);
    }
}
