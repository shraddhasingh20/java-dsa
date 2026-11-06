public class Binary{
    static int binarySearch(int arr[], int key){
        int left=0;
        int right=arr.length - 1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                left=mid+1;

            }
            else
            {
                right=mid-1;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int key=40;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                System.out.println(i);
                break;
            }
        }

        
    }
}