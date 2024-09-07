import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));

        try {
            double a = in.nextDouble();
            String operator = in.next();
            double b = in.nextDouble();

            if(!operator.matches("[-|+|*|/]{1}"))
                throw new Exception("Operation Error!");
            if(operator.equals("/") & b == 0)
                throw new Exception("Error! Division by zero");

            if(operator.equals("-")) System.out.println(a - b);
            if(operator.equals("+")) System.out.println(a + b);
            if(operator.equals("*")) System.out.println(a * b);
            if(operator.equals("/")) System.out.println(a / b);
        }
        catch (InputMismatchException e) {
            System.out.println("Error! Not number");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}