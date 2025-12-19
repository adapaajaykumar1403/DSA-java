class Solution {
    public List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        generateComb(candidates,target,0,0,new ArrayList<Integer>());
        return ans;
        
    }
    public void generateComb(int[] candidates,int target,int sum,int ind,ArrayList<Integer> helper)
    {
        if(sum==target)
        {
            List<Integer> li=new ArrayList<>(helper);
            ans.add(li);
            return;
        }
        if(sum>target)
        {
            return;
        }

        for(int i=ind;i<candidates.length;i++)
        {
            helper.add(candidates[i]);
            generateComb(candidates,target, sum+candidates[i],i,helper);
            helper.remove(helper.size()-1);
        }
    }
}
