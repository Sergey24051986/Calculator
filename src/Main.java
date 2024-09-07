import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter writer = new PrintWriter("output.txt");

        while(in.hasNext()) {
            String str = in.nextLine();
            String[] mas = str.split(" ");
            try {
                int a = Integer.parseInt(mas[0]);
                String operator = mas[1];
                if (!operator.matches("[-|+|*|/]{1}"))
                    throw new Exception(str + " = Operation Error!");
                int b = Integer.parseInt(mas[2]);

                if (operator.equals("/") & b == 0)
                    throw new Exception(str + " = Error! Division by zero");

                if (operator.equals("-")) writer.println(str + " = " + (double)(a - b));
                if (operator.equals("+")) writer.println(str + " = " + (double)(a + b));
                if (operator.equals("*")) writer.println(str + " = " + (double)(a * b));
                if (operator.equals("/")) writer.println(str + " = " + (double)(a / b));

            } catch (NumberFormatException e) {
                writer.println(str + " = Error! Not number");
            } catch (Exception e) {
                writer.println(e.getMessage());
            }
        }
        in.close();
        writer.close();

    }
}