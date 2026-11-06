public class Searching {
    public static void main(String[] args) {
        int arr[]={10,11,12,14,19,56,33};
        int key=14;
//linear search
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                System.out.println(i);
                break;
            }
        }
    }
}
