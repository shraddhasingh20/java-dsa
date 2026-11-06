public class First{
    public static void main(String[] args) {
        int a=20;
        int b=10;
        if(a>b){
            System.out.println(" A is greater");
        }
        else{
            System.out.println("B");
        }   
String result=a>b?"A":"B";
System.out.println(result);

int d=10;
int e=20;
int f=30;
String result2=(d>e && d>f)?"D":(e>f)?"E":"F";
System.out.println(result2);
    }

}