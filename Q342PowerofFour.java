//add this line to test whether git stores my github credential 
import java.lang.Math;

public class Q342PowerofFour {
	public static void main (String[] args) {
		Solution2 s = new Solution2();
		if (s.isPowerofFour(16)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}

class Solution1 {
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

class Solution2 {
	public boolean isPowerofFour(int num) {
	// If num are not positive integer, return false. Otherwise, take logarithm (base 4) and then round to the closest integer. Finally take the power (base 4) to compare with the original num. If the same, return true, otherwise return false.

		if (num <= 0) {return false;}
		double doublePower = Math.log10(num)/Math.log10(4);
		long longPower = Math.round(doublePower);
		double temp = Math.pow(4, longPower);
		long longTemp = Math.round(temp);
		if (longTemp == num) {
			return true;
		}else {
			return false;
		}
	}
} 