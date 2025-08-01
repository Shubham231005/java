class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> Duplicate = new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        if(Duplicate.contains(nums[i]))
        {
            return true;
        }
        else
        { 
         Duplicate.add(nums[i]);
        }
    } return  false;
        
    }}
