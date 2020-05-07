package Algorithm4笔记;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Chuang
 * @Date: 2020/4/26 16:07
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7,8,9};
        int x = rank(4,a);
        Arrays.sort(a);
        System.out.println(x);
    }
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
