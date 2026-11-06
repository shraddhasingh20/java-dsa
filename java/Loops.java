import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int num= sc.nextInt();

        int sum=0;
        while(num>0){
            int r=num%10;
            sum +=r;
            num/=10;
        }
        System.out.println("sum of digits: " + sum);
    }
    
}