import java.util.*;
import java.lang.*;

public class Q27RemoveElement {
	public static void main(String[] args) {
		//input the array and the value to remove
		int[] nums;
		int val;
		List<Integer> list = new ArrayList<Integer>();
		Scanner stdin = new Scanner(System.in);
		do {
			System.out.println("Current list is " + list);
			System.out.println("Add more? (y/n)");
			if (stdin.next().startsWith("y")) {
				System.out.println("Enter : ");
				list.add(Integer.parseInt(stdin.next()));
			} else {
				break;
			}
		} while (true);
		System.out.println("Input the value to remove:");
		val = Integer.parseInt(stdin.next());
		nums = new int[list.size()];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = list.get(i);
		}
		System.out.println("Array is " + Arrays.toString(nums));
		System.out.println("The value to remove is " + val);
		Solution s = new Solution();
		int length = s.removeElement(nums, val);
		System.out.println("The new array after removal is ");
		for(int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("with length " + length);
	}	
}

class Solution {
    public int removeElement(int[] nums, int val) {
		int temp;
        for(int l = 0; l < nums.length; l++) {
			if(nums[l] == val) {
				for(int t = l + 1; t < nums.length; t++) {
					if(nums[t] != val) {
						temp = nums[l];
						nums[l] = nums[t];
						nums[t] = temp;
						l++;
						//t++;
					}
				}
				return l;
			}
		}
		return nums.length;		
    }
}