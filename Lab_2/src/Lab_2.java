import java.util.Scanner;

interface Product {
    String __className = "Default";

    void whoAmI();
}

class Book implements Product {
    private String __className = "Book";

    @Override
    public void whoAmI() {
    }
}

class Shoe implements Product {
    private String __className = "Shoe";

    @Override
    public void whoAmI() {
    }
}

interface Present extends Product {
    String itCanBePresented();
}

class Toy implements Present {
    private String __className = "Toy";

    @Override
    public String itCanBePresented() {
        return __className;
    }

    @Override
    public void whoAmI() {
    }
}

class Picture implements Present {
    private String __className = "Picture";

    @Override
    public String itCanBePresented() {
        return __className;
    }

    @Override
    public void whoAmI() {
    }
}

public class Lab_2 {
    private static int arraySize;

    private static Book book = new Book();
    private static Shoe shoe = new Shoe();
    private static Toy toy = new Toy();
    private static Picture picture = new Picture();

    private static Product objectArray[] = { book, shoe, toy, picture };

    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите колличество эллиментов: ");
            arraySize = in.nextInt();
        } catch (NumberFormatException exc) {
            System.out.print("Exception :: " + exc);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No args");
            return;
        }
        Product productArray[] = new Product[arraySize];

        for (int i = 0; i < arraySize; i++) {
            try {
                productArray[i] = objectArray[i];
            } catch (ArrayIndexOutOfBoundsException exc) {
                productArray[i] = objectArray[1];
            }
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(productArray[i]);
        }
        System.out.println("------------------------------");
        for (Product item : objectArray) {
            if (item instanceof Present)
                System.out.println(((Present) item).itCanBePresented());
        }
    }
}
