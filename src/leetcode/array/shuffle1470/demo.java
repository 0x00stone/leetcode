package leetcode.array.shuffle1470;

public class demo {
    public static void main(String[] args) {
        int[] nums1 = {2,5,1,3,4,7};
        int n1 = 3;    //[2,3,5,4,1,7]
        int[] nums2 = {1,2,3,4,4,3,2,1};
        int n2 = 4;    //[1,4,2,3,3,2,4,1]
        int[] nums3 = {1,1,2,2};
        int n3 = 2;      //[1,2,1,2]

        Solution s = new Solution();
        for(int i :s.shuffle(nums1,n1)){
            System.out.print(i);
        }
        System.out.println();
        for(int i :s.shuffle(nums2,n2)){
            System.out.print(i);
        }
        System.out.println();
        for(int i :s.shuffle(nums3,n3)){
            System.out.print(i);
        }
        System.out.println();


    }
}
