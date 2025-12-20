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
