class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet<Integer> Duplicate = new HashSet<>();
     int i=0;
     for(i=0;i<nums.length;i++){
     if(!Duplicate.contains(nums[i]))
     {
        Duplicate.add(nums[i]);
        
     }
     else
     {
        return true;
     }
     }
return false;
    }}
