public class Q342PowerofFour {
	public static void main (String[] args) {
		Solution s = new Solution();
		if (s.isPowerofFour(-4)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}

class Solution {
	public boolean isPowerofFour(int num) {
	//divide num by 4 again and again, if finally it gets to 1, it is a power of 4. Otherwise it is not.	
	
		if (num <= 0) {return false;}
		int temp = num;
		while (temp > 1) {
			if (temp%4 == 0) {
				temp = temp/4;
			}else {
				return false;
			}
		}
		return true;
	}
}  