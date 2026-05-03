import java.util.*;

public class KadanesMaxsum{

	static int kadane(int [] nums){
		int n = nums.length;
		int currSum = nums[0];
        	int maxSum = nums[0];

        	for(int i= 1; i < n; i++){
            		currSum = Math.max(nums[i],currSum + nums[i]);

            		maxSum = Math.max(currSum,maxSum);
        	}
		return maxSum;
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int n = sc.nextInt();
		int [] nums = new int[n];
		System.out.println("Enter the elements in array");
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			System.out.print(nums[i]+" ");
		}
		
		//int [] nums = {-2,-3,-1,-2,-3};
		System.out.println("\n"+kadane(nums));
		sc.close();
	}
}
