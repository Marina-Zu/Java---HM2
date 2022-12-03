
// К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);

        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log_02.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
      
        System.out.print("Введите первое число => ");
        Scanner num1 = new Scanner(System.in);
        int n1 = num1.nextInt();
        System.out.print("Введите второе число => ");
        Scanner num2 = new Scanner(System.in);
        int n2 = num2.nextInt();
        System.out.print("Что будем делать? \n"
                            + " '+' => 1\n"
                            + " '-' => 2\n"
                            + " '*' => 3\n"
                            + " '/' => 4\n");
        Scanner step = new Scanner(System.in);
        int s = step.nextInt();

        
        if (s == 1){
            String g = String.format("%s + %s = %s  ", n1, n2, n1 + n2);
            System.out.printf("%s + %s = %s  ", n1, n2, n1 + n2);
            logger.severe(g);
            fh.close();
           
        }
        if (s == 2){
            String g = String.format("%s - %s = %s  ", n1, n2, n1 - n2);
            System.out.printf("%s - %s = %s  ", n1, n2, n1 - n2);
            logger.severe(g);
            fh.close();
        }
        if (s == 3){
            String g = String.format("%s * %s = %s  ", n1, n2, n1 * n2);
            System.out.printf("%s * %s = %s  ", n1, n2, n1 * n2);
            logger.severe(g);
            fh.close();
        }
        if (s == 4){
            String g = String.format("%s / %s = %s  ", n1, n2, n1 / n2);
            System.out.printf("%s / %s = %s  ", n1, n2, n1 / n2);
            logger.severe(g);
            fh.close();
        }
    }
}

