package leetcode;

import java.util.Arrays;

public class L441_ArrangeCoin_binarysearch {
    public int coinChange(int n) {
        return binary_search(n);   
    }
    public int binary_search(int n) {
        int l = 1, r = n; // n rows are way too high ... n-1?
        int mid, num_coins, ans = 0;
        int tmp;
        while (l <= r) {
            mid = (l + r)/2;
            num_coins = (mid * mid + mid)/2;
            if (num_coins > n) { // not enough
                r = mid - 1;
            } else { // if l + 1 and l - 1 is false
                tmp = mid + 1;
                if ( (tmp * tmp + tmp)/2 > n) {
                    ans = mid;
                    break;
                }
                l = mid + 1;
            }
            if (l > r) {
                // System.out.println("by binary");
                ans = mid;
            }
        }
        return ans;    
    }

    public static void main(String[] args) {
        L441_ArrangeCoin_binarysearch sol = new L441_ArrangeCoin_binarysearch();
        System.out.println( sol.coinChange(5) );
        System.out.println( sol.coinChange(8) );
    }
}
