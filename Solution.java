import java.util.Scanner;
public class Solution{

    public static int printSquare(int x, int n){
        int power = 1;

        for(int i =1; i<=n; i++){
            power = power * x;
        }
        return power;
    }
    public static void main(String args[]){
        System.out.println("Enter x :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n :");
        int n = sc.nextInt();

        int result = printSquare(x, n);

        System.out.println("x to the power n is : "+result);

        sc.close();
    }
}