/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        int min = Integer.MAX_VALUE;

        while (l <= r){
            int m = (l + r)/2 ;
            min = Math.min(min, nums[m]); 
            int left = nums[l];
            int right = nums[r];
            int mid = nums[m];

            //if mid is less than both the smaller exists to the left of it
            if( mid < right && mid < left ){
                r = m ;
            }
            // if its greater than both move in the direction of smaller pointer
            else if (mid > left && mid > right) {
                if(left < right ){
                    r = m;
                }else{
                    l = m+1;
                }
            }else if (right > mid){
                r = m;
            }else{
                l = m +1;
            }
        }
        return min; 

    }

    public static void main(String[] args) {
        
        int[] nums = new int[]{3,4,5,6,1,2};
        int[] nums_2 = new int[]{4,5,0,1,2,3};
        int[] nums_3 = new int[]{9,-5,-2,0,3};
        int[] nums_4 = new int[]{ 4,5,6,7};
        new Solution().findMin(nums_4);
    }
}
// @lc code=end
// 
/*
 * 
if the mid point is less than both l and r min must exist left of m
if the mid point is greater than both l and r min must exist in the direction of smaller pointer
if the mid point is greater than [l] it must exist on the left
if the mid point is less than [l]   it must exist on the right


I want to always move in the direction of  smaller m
4,5,6,7


[9,-5,-2,0,3]
9 3



[3,4,5,6,1,2]
l = 0
r = 5
m = 2


if r < l 
  l = m

I want to go in the right direction
l = 2
r = 5
m = 3

6

right again 
l = 3
r = 5
m = 4
1

l = 4
r = 5
m = 4
I want to go left
l = 4
r = 4
m = 4
exit
smallest found



[6,1,2,3,4,5]
l = 6 
r = 5 
m = 2

if r < l



if

*/