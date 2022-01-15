//https://leetcode.com/problems/guess-number-higher-or-lower/

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int ans = -1;
        while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        int call = guess(mid);
        if(call==0)
        {   
            ans=mid;
            break;
        }
        else if(call==-1)
        {
            hi=mid-1;
        }
        else
        {
            lo=mid+1;
        }
            
        }
        return ans;
    }
}
