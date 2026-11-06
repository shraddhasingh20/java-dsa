import java.util.Arrays;
public class Perimeter {
    public int Perimeter(int [] nums){
        Arrays.sort(nums);
        for(int i= nums.length-1;i>=2;i--)
        {
           int c=nums[i];
           int b=nums[i-1];
           int a=nums[i-2];
           if(a+b>c){
            return a+b+c;
           }
        }
        return 0;
    }
            
    public static void main(String args[]){
        
        
    }
}
