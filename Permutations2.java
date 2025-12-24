class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        generatePerm(nums,new boolean[nums.length],new ArrayList());
        return ans;
    }
    public void generatePerm(int[] nums,boolean[] vis,ArrayList<Integer> helper)
    {
        if(helper.size()==nums.length)
        {
            ans.add(new ArrayList<>(helper));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
           
             if(vis[i] || i>0 && nums[i]==nums[i-1] && vis[i-1]==true)
            {
                continue;
            }
            helper.add(nums[i]);
            vis[i]=true;
            generatePerm(nums,vis,helper);
            vis[i]=false;
            helper.remove(helper.size()-1);
        }

    }
}
