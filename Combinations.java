class Solution {
    public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        generateComb(n,1,k,new ArrayList());
        return ans;
    }
    public void generateComb(int n,int ind,int k,ArrayList<Integer> helper)
    {
        if(k==0)
        {
            ans.add(new ArrayList<>(helper));
            return;
        }
        for(int i=ind;i<=n;i++)
        {
            helper.add(i);
            generateComb(n,i+1,k-1,helper);
            helper.remove(helper.size()-1);
        }
    }
}
