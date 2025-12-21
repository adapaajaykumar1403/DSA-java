//Method 1 suing normal recursion..(17ms) timecomplexity.....
class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        generateSubsets(nums,0,new ArrayList());

        return ans;
    }
    public void generateSubsets(int[] nums,int ind,ArrayList<Integer> helper)
    {
        if(ind==nums.length)
        {
            ArrayList<Integer> li=new ArrayList<>(helper);
            for(int i=0;i<ans.size();i++)
            {
                if(ans.get(i).equals(li))
                {
                    return;
                }
            }
            ans.add(li);
            return;
        }
        helper.add(nums[ind]);
        generateSubsets(nums,ind+1,helper);
        helper.remove(helper.size()-1);
        generateSubsets(nums,ind+1,helper);
    }
}


//method-2 usinf for loop (2ms) time
public void generateSubsets(int[] nums,int ind,ArrayList<Integer> helper)
    {
       
        ans.add(new ArrayList<>(helper));
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind && nums[i]==nums[i-1])
            {
                continue;
            }
            helper.add(nums[i]);
            generateSubsets(nums,i+1,helper);
            helper.remove(helper.size()-1);
        }
        
    }
