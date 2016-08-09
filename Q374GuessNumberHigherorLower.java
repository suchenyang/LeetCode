/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guessNumberHelper(1, n);
    }
    
    public int guessNumberHelper(int m, int n) {
       // if m > n {
            
    //    }else 
        int middle = m + (n-m)/2;
        if (guess(middle) == 0) {
            return middle;
        }else if (guess(middle) == -1) {
            return guessNumberHelper(m, middle-1);
        }else return guessNumberHelper(middle+1, n);

//        if (guess((m+n)/2) == 0){
//            return (m+n)/2;
//        }   
//        if (guess((m+n)/2) == 1){
//            return guessNumberHelper(m, (m+n)/2-1);
//        }
//        if (guess((m+n)/2) == -1){
//            return guessNumberHelper((m+n)/2+1, n);
//        }else return 0;
    }
}