public class Fact {
    public static void main(String[] args) {
        for(int n=1;n<=10;n++){

        int fact=1;
        for (int i=1; i<=n;i++){
            fact=i*fact;
        }
            System.out.println("factorial of " +n + " = " +fact);

    }
    
}
}