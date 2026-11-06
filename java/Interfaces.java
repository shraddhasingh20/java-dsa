public class Interfaces {
    public static void main(String[] args) {
        Bank acc =new SBI();
        System.out.println(acc.getInterestRate());
    }
}
interface Bank{
    int a=10;
    float getInterestRate();
}
class SBI implements Bank{
    @Override
    public float getInterestRate() {
        return 7.5f;
    }
}