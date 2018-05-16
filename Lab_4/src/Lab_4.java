import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public  class Lab_4{

    public static void main(String[] args){
        String key, filename;
        Properties properties = new Properties();
        boolean Error = true;
        char c;
        Map<String, String> map = new HashMap<>();
        do {
            System.out.println("Имя файла: ");
            Scanner in = new Scanner(System.in);
            filename = "src/" + in.nextLine() + ".properties";
            FileInputStream fin;
            try {
                fin = new FileInputStream(filename);
                Error = false;
                properties.load(fin);
                for (String name : properties.stringPropertyNames()){
                    map.put(name, properties.getProperty(name));
                }
            } catch(IOException ex){
                System.out.println("Файл: " + filename + " не существует");
            }
        } while(Error);
        Error = true;
        do{
            System.out.println("Введите ключ: ");
            Scanner in = new Scanner(System.in);
            String propertyname = in.nextLine();
            c = propertyname.charAt(0);
            if (c == 27)
                System.exit(0);
            key = map.get(propertyname);
            if(key != null){
                System.out.println(propertyname + ": " + key + "\n");
            } else{
                System.out.println("Такого ключа несеществует\n");
            }

        }while (Error);
    }
}
