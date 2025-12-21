class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        generateSubsets(nums,0,new ArrayList());
        return ans;
        
    }
    public void generateSubsets(int[]nums,int ind,ArrayList<Integer> helper)
    {
        if(ind==nums.length)
        {
            ArrayList<Integer> li =new ArrayList<>(helper);
            ans.add(li);
            return;
        }
        helper.add(nums[ind]);
        generateSubsets(nums,ind+1,helper);
        helper.remove(helper.size()-1);
        generateSubsets(nums,ind+1,helper);

    }
}
//method 2 -> usimg for loop
ans.add(new ArrayList<>(helper));
        for(int i=ind;i<nums.length;i++)
        {
            helper.add(nums[i]);
            generateSubsets(nums,i+1,helper,ans);
            helper.remove(helper.size()-1);
        }
