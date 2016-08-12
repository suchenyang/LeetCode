public class Q292NimGame {
	public static void main(String[] args) {
		int n = 8;
		Solution2 s = new Solution2();
		if (s.canWinNim(n)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}		
	}
}

class Solution1 {
	public boolean canWinNim(int n) {
        //We can use recursion. If n<=3, always win. For n > 3, we have three options, pick 1 ,2 or 3 at first time, if any one of them corresponds to opponent always lose, you always win. Otherwise you always lose.
		
		if (n <= 3) {
			return true;
		} else {
			if (!canWinNim(n - 1) || !canWinNim(n - 2) || !canWinNim(n - 3)) {
				return true;
			} else {
				return false;
			}
		}
    }
}

class Solution2 {
	public boolean canWinNim(int n) {
		//Actually we can directly conclude all the cases that you will lose are the multiple of 4
		
		if (n % 4 == 0) {
			return false;
		} else {
			return true;
		}
	}
}