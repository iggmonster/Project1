import java.util.*;

import static java.lang.Double.parseDouble;

public class Project1 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Problem01 problem1 = new Problem01();
        System.out.println("enter your operation type followed by two nums");
        String operator = in.nextLine();
        double a = parseDouble(in.nextLine());
        double b = parseDouble(in.nextLine());
        if(operator.contains("a")){
            System.out.println(problem1.addition(a, b));
        }else if(operator.contains("s")){
            System.out.println(problem1.subtract(a, b));
        }else if(operator.contains("d")){
            System.out.println(problem1.divide(a, b));
        }else if(operator.contains("m")){
            System.out.println(problem1.multiple(a, b));
        }
        Problem02 problem = new Problem02();
        System.out.println(problem.getTotal());
        Problem03 problem3 = new Problem03();
        System.out.println(problem3.sayName());
        Problem04 problem4 = new Problem04();
        System.out.println(problem4.sayNameFifty());
        System.out.println("Enter your name plz");
        String name = in.nextLine();
        Problem05 problem5 = new Problem05();
        System.out.println(problem5.greet(name));
        Problem06 problem6 = new Problem06();
        System.out.print(problem6.gimmeNumbers());
        Problem07 problem7 = new Problem07();
        int[] sizes = new int[11];
        for(int i = 6; i!=17; i++){
            sizes[i-6] = i;
        }
        System.out.print(problem7.pizzaStuff(sizes));

    }
}






