import java.util.*;
import java.util.Arrays;
class GFG {
    public static int missingnumberinarray(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
          sum-=nums[i];
        return sum;
    }
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 4, 5, 6 };
        System.out.println(missingnumberinarray(a));
    }
}
