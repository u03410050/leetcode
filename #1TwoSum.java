import java.util.Arrays;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] numbers=new int[2];
        
        int flag=0;
    	for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        	{
        		if(target==(nums[i]+nums[j]))
        		{
        			numbers[0]=i;
        			numbers[1]=j;
        			flag=1;
        			break;
        		}
        	}
        	if(flag==1)
        	{
        		break;
        	}
        }
		return numbers;
        
    }
    public static void main(String[] args) {
    	int[] test= {2, 7, 11, 15};
    	int[] re=new int[2];
    	re=twoSum(test,9);
    	System.out.println(Arrays.toString(re));
    }
}
