class Per {
    private int age;

    public void setAge(int a){
        if(a > 0){
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge(){
        return age;
    }
}

public class Person{
    public static void main(String args[]){
        Per p = new Per();

        System.out.println(p.getAge());  

        p.setAge(25);  
        System.out.println(p.getAge());
    }
}