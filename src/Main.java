import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter writer = new PrintWriter("output.txt");

        try {
            double a = in.nextDouble();
            String operator = in.next();
            double b = in.nextDouble();
            in.close();

            if(!operator.matches("[-|+|*|/]{1}"))
                throw new Exception("Operation Error!");
            if(operator.equals("/") & b == 0)
                throw new Exception("Error! Division by zero");

            if(operator.equals("-")) writer.print(a - b);
            if(operator.equals("+")) writer.print(a + b);
            if(operator.equals("*")) writer.print(a * b);
            if(operator.equals("/")) writer.print(a / b);
        }
        catch (InputMismatchException e) {
            writer.print("Error! Not number");
        }catch (Exception e) {
            writer.print(e.getMessage());
        }
        writer.close();

    }
}