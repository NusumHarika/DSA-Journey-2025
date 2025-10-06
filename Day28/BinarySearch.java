class Solution {
    public int search(int[] nums, int target) {
        return sol(nums, 0, nums.length-1, target);
    }
    public int sol(int[] nums, int l, int h, int t){
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<t){
                return sol(nums,mid+1,h,t);
            }else if(nums[mid]>t){
                return sol(nums,l,mid-1,t);
            }else if(nums[mid]==t){
                return mid;
            }
        }
        return -1;
    }
}