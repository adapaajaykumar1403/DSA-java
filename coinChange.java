class Solution {
    //public ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++)
        {
            for(int coin: coins)
            {
                if(coin<=i)
                {
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    
    }
}
//         generate(coins,amount,new ArrayList());
//         if(ans.size()==0)
//         {
//             return -1;
//         }
//         else
//         {
//             ArrayList<Integer> n=new ArrayList<>(ans.get(0));
//             return n.size();
//         }
        
        
//     }
//     public void generate(int[] coins,int amount,ArrayList<Integer> helper)
//     {
//         if(amount==0)
//         {
//             if(ans.size()==0)
//             {
//                 ans.add(new ArrayList<>(helper));
//                 return;
//             }
//             else if(helper.size()<ans.size())
//             {
//                 ans.remove(ans.size()-1);
//                 ans.add(new ArrayList<>(helper));
//                 return;
//             }
//             else
//                 return;
//         }
//         if(amount<0)
//         {
//             return;
//         }
//         for(int i=coins.length-1;i>=0;i--)
//         {
//             helper.add(coins[i]);
//             generate(coins,amount-coins[i],helper);
//             helper.remove(helper.size()-1);
//         }
//     }
// }
