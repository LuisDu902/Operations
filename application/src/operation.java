import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Result: ");
        if (operation.equals("sum")){
        System.out.println(a + b);}
        else if (operation.equals("mul")) {
            System.out.println(a * b);
        }
        else if (operation.equals("div")){
            System.out.println(a / b);
        }
        else {
            System.out.println(a - b);}

    }
}