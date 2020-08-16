import java.util.*;

class Program {
  public static int[] largestRange(int[] array) {
    // Write your code here.
		int [] bestRange = new int[2];
		int longest = 0;
		Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
		for (int num :array){
			nums.put(num, true);
		}
		for(int num : array){
			if(!nums.get(num)){
				continue;
			}
			nums.put(num, false);
			int currentLength = 1;
			int left = num-1;
			int right = num +1;
			while(nums.containsKey(left)){
				nums.put(left, false);
				currentLength++;
				left--;
				
			}
			while(nums.containsKey(right)){
				nums.put(right, false);
				currentLength++;
				right++;
			}
			if(currentLength > longest){
				longest = currentLength;
				bestRange = new int[] { left+1, right-1};
			}
		}
		
    return bestRange;
  }
  
  public static int[] largestRangeBadBigO(int[] array) {
    // Write your code here.
		int [] bestRange = new int[2];
		int longest = 0;
		Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
		for (int num :array){
			nums.put(num, true);
		}
		for(int num : array){
			if(!nums.get(num)){
				continue;
			}
			nums.put(num, false);
			int currentLength = 1;
			int left = num-1;
			int right = num +1;
			while(nums.containsKey(left)){
				nums.put(left, false);
				currentLength++;
				left--;
				
			}
			while(nums.containsKey(right)){
				nums.put(right, false);
				currentLength++;
				right++;
			}
			if(currentLength > longest){
				longest = currentLength;
				bestRange = new int[] { left+1, right-1};
			}
		}
		
    return bestRange;
  }
}
