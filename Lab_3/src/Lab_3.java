import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public  class Lab_3{

    public static void main(String[] args){
        String key, filename;
        Properties properties = new Properties();
        boolean Error = true;
        do {
            System.out.println("Имя файла: ");
            Scanner in = new Scanner(System.in);
            filename = "src/" + in.nextLine() + ".properties";
            FileInputStream fin;
            try {
                fin = new FileInputStream(filename);
                Error = false;
                properties.load(fin);
            } catch(IOException ex){
                System.out.println("Файл: " + filename + " не существует");
            }
        } while(Error);
        Error = true;
        do{
            System.out.println("Введите ключ: ");
            Scanner in = new Scanner(System.in);
            String propertyname = in.nextLine();
            key = properties.getProperty(propertyname);
            if(key != null){
                System.out.println(propertyname + ": " + key + "\n");
            } else{
                System.out.println("Property not found\n");
            }

        }while (Error);
    }
}
