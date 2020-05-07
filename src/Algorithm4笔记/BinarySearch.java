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
        int x = rank(9,a);
        int x1 = new Test().binarySearch(a,9);
        System.out.println(x1);
    }
    public static int rank(int key, int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key < a[mid]) {
                right = mid - 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
class Test{
    public int binarySearch(int[] nums,int key){
        int left = 0,right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid]>key){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
