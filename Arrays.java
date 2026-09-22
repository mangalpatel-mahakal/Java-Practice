import java.util.Scanner;
public class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //Array
        int numbers[] = new int[size];

        //outer loop//

        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int lowest = numbers[0];

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] < lowest){
                lowest = numbers[i];
            }

        }
        System.out.println("Lowest number is the : "+lowest);
    }
}