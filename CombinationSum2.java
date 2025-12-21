//Method 1--> using for loop
class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        generateComb(candidates,target,0,new ArrayList());
        return ans;
        
    }
    public void generateComb(int[] candidates,int target,int ind,ArrayList<Integer> helper)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(helper));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=ind;i<candidates.length;i++)
        {
            if(i>ind && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(candidates[i]>target)
            {
                break;
            }
        
        helper.add(candidates[i]);
        generateComb(candidates,target-candidates[i],i+1,helper);
        helper.remove(helper.size()-1);
        }

    }
}
