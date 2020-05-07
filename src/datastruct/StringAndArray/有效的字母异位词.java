package datastruct.StringAndArray;

/**
 * @Author: Chuang
 * @Date: 2020/4/26 14:27
 */
public class 有效的字母异位词 {
    // 计数排序的思想
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char i : s.toCharArray()) {
            arr1[(int)i-97]++;
        }
        for (char i : t.toCharArray()) {
            arr2[(int)i-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
