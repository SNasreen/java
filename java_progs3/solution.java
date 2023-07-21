import java.util.*;
class Solution 
{
    public static int solve (ArrayList < Integer > list) 
    {
        int n = list.size ();
        if (n == 0)
            return 0;
        int max = list.get (0);

        for (int i = 1; i < n; i++)
            max = Math.max (max, list.get (i));
        if (max <= 0)
            return 0;
        int maxSum = 0;
        int sum = 0;
    
        for (int i = 0; i < n; i++)
        {
            sum = sum + list.get (i);
            if (sum < 0)
                sum = 0;
            maxSum = Math.max (maxSum, sum);
        }
        return maxSum;
    }
  
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        ArrayList < Integer > list = new ArrayList ();
        
        for (int i = n - 2; i >= 0; i--)
            list.add (arr[i] - arr[i + 1]);
        int res = solve (list);
    
        if (res < 0)
            System.out.println (0);
        else
            System.out.println (res);
    }
}