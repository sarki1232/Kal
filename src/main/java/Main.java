import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println(a +"первое число");
        System.out.println("Введите число");
        int b = scanner.nextInt();
        System.out.println("Введите +, -, *, /" );
        char g = scanner.next().charAt(0);
        int c = 0;
        switch(g) {
            case '+': c = sum1(a , b);
                break;
            case '-': c =minus(a,b);
                break;
            case '*': c = ymnojenie(a,b);
                break;
            case '/': c = dilenie(a,b);
                break;
        }
        System.out.println("Ответ " + c);
    }
    public static int sum1(int a, int b){
        return a + b;
    }
    public static int ymnojenie(int a, int b){
        return a * b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
    public static int dilenie(int a, int b){
        return a * b;
    }
}