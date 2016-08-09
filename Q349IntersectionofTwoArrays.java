import java.util.*;

public class Q349IntersectionofTwoArrays {
	public static void main(String[] args) {
		Solution s = new Solution();
		int nums1[] = {1};
		int nums2[] = {2,2};
		int[] nums3 = s.intersection(nums1, nums2);
		System.out.println(Arrays.toString(nums3));
	}
}


class Solution {	
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> set = new HashSet<Integer>();
		int i = 0;
		int j = 0;
		while (i <= nums1.length - 1 && j <= nums2.length - 1) {
			if (nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
			}else if (nums1[i] > nums2[j]) {
				j++;
			}else {
				i++;
			}
		}
		Integer[] array = new Integer[set.size()];
		set.toArray(array);
		int[] nums3 = new int[array.length];
		for (int k = 0; k <= array.length - 1; k++) {
			nums3[k] = array[k];
		}
		return nums3;
	}
}