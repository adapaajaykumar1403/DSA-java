class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        generatePerm(nums,nums.length,new ArrayList<>());
        return ans;
    }
    public void generatePerm(int[] nums,int n,ArrayList<Integer> helper)
    {
        if(helper.size()==n)
        {
            ans.add(new ArrayList(helper));
            return;
        }
        if(helper.size()>n)
        {
            return;
        }

        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<helper.size();j++)
            {
                if(nums[i]==helper.get(j))
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                continue;
            }
            helper.add(nums[i]);
            generatePerm(nums,n,helper);
            helper.remove(helper.size()-1);
        }
    }
}
