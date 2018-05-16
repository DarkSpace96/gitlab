import java.util.ArrayList;
import java.util.Scanner;

class Rab1 extends  Thread {
    @Override
    public void run() {       
        if (Lab5.a <= Lab5.h) {
            System.out.println("Работник 1: " + Lab5.a);
            Lab5.b = Lab5.a;
            new Rab2().start();
            Lab5.a++;
        }
    }
}

class Rab2 extends  Thread {
    @Override
    public void run() {
        System.out.println("Работник 2: " + Lab5.b);
        Lab5.c = Lab5.b;
        new Rab3().start();

    }
}

class Rab3 extends  Thread {
    @Override
    public void run() {
        System.out.println("Работник 3: " + Lab5.c);
        new Rab1().start();
    }
}


public class Lab5 {
    public static int a = 1;
    public static int b = 0;
    public static int c = 0;
    public static int h = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Колличество саженцев: ");
        Lab5.h = in.nextInt();
        
        new Rab1().start();        
    }
}
