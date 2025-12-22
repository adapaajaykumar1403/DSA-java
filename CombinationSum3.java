class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        generateComb(k,n,1,new ArrayList());
        return ans;
    }
    public void generateComb(int k,int n,int num,ArrayList<Integer> helper)
    {
        
        if(k==0 && n==0)
        {
            ans.add(new ArrayList(helper));
            return;
        }
        if(k<=0 || n<=0 || num>9 || n<num)
        {
            return;
        }
        helper.add(num);
        generateComb(k-1,n-num,num+1,helper);
        helper.remove(helper.size()-1);
        generateComb(k,n,num+1,helper);
    }
}
