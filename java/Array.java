public class Array {
    public static void main(String[] args) {
        int sum=0;
        int sums=0;
//static 
        int arr[]={10,11,12,14,19,56,33};
//dynamic
        float nums[]=new float[5];
        nums[2]=60;
        System.out.println(arr[5]);

//loops in array
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);

// for each loop 
        for(int n: arr){
            System.out.println(n);
            sums=sums+n;
            System.out.println(sums);
        }
        

        
    }
}
