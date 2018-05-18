import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Rab1 extends  Thread {
    @Override
    public void run() {
        //new Rab2().start();
        /*
        for (; Lab5.arr1.size() >= 1;) {
            Lab5.arr2.add(Lab5.arr1.get(0));
            System.out.println("Работник 1: " + Lab5.arr1.get(0));
            //int i = Lab5.arr1.get(0);
            Lab5.arr1.remove(0 );
            try {
                Rab1.sleep(200 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Lab5.arr2.add(i);
            //if (i == 1)
            //    new Rab2().start();
        }
        */

        ////////////////////////////////////////////////////////////////
        if (Lab5.a <= Lab5.h) {
            System.out.println("Работник 1: " + Lab5.a);
            Lab5.b = Lab5.a;
            new Rab2().start();
            Lab5.a++;
        }


        //new Rab2().start();
        /*for (Lab5.a = 1; Lab5.a <= Lab5.h; Lab5.a++){
            System.out.println("Работник 1: " + Lab5.a);
            Lab5.b = Lab5.a;
            new Rab2().start();
        }*/
    }
}

class Rab2 extends  Thread {
    @Override
    public void run() {
        //new Rab3().start();
        /* (; Lab5.arr2.size() >= 1;) {
            Lab5.arr2.add(Lab5.arr1.get(0));
            System.out.println("Работник 2: " + Lab5.arr2.get(0));
            //int i = Lab5.arr2.get(0);
            Lab5.arr2.remove(0 );
            try {
                Rab2.sleep(200 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Lab5.arr3.add(i);
            //if (i == 1)
            //   new Rab3().start();

        }*/
        ///////////////////////////////////////
        /*new Rab3().start();
        for (int i = 0; i <= Lab5.b; i++){
            System.out.println("Работник 2: " + i);
            Lab5.c = i;
            //new Rab2().start();
        }*/

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
        boolean Error = true;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Колличество саженцев: ");
            try {
                Lab5.h = in.nextInt();
                if (Lab5.h <= 0)
                    System.out.println("Колличество саженцев должно быть > 0");
                else
                    Error = false;
            } catch(InputMismatchException ex){
                System.out.println("Колличество саженцев введено не верно");
            }
        } while(Error);


        new Rab1().start();
    }
}
