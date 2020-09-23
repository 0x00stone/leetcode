package leetcode.array.busyStudent1450;

import java.util.ArrayList;
/*### 解题思路
        第一个循环 : 开始时间与时间线比较, 开始时间 < 时间线的 人放入新创建的数组
        第二个循环 : 从新数组中循环符合条件的人, 再将他们与截至时间相比较

### 代码*/
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum = 0;
        int[] list = new int[startTime.length];
        for(int i = 0; i < startTime.length ; i++){
            if(startTime[i] <=  queryTime){
                list[i]++;
            }
        }

        for(int j = 0 ; j < list.length ; j++){
            if(list[j] == 1 && endTime[j] >= queryTime){
                sum++;
            }
        }
        return  sum;
    }
}