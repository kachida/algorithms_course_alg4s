package test.minimumcoins;


public class MinCoinsCost {


	static	int[] coins;
	static int[] array;
    	public int findMinCoins(int[] coinsDenom, int amount)
    	{
    		for(int i=0;i<coinsDenom.length;i++)
    		{
			if(coinsDenom[i] == 0)
			return 0;
			 if(coinsDenom[i]<0)
			return 0;
    		}
		
    		coins =new int[coinsDenom.length];
    		array =new int[amount+1];
    		System.arraycopy(coinsDenom,0,coins,0,coinsDenom.length);
	
    		int count;
    		count=mini(amount);
    		return count;
        
    	}
    	public static int mini(int n)
    	{if(n<0)
    	{
    		return Integer.MAX_VALUE-1;
    	}
    	if(n==0)
    	{
    		return 0;
    	}
    	else{
    		array[n]=1+mini(n-coins[0]);
    		for(int i=1;i<coins.length;i++)
    			{
    			array[n]=Math.min(array[n], 1+mini(n-coins[i]));
    			}
    		if(array[n]>2147483644)
    		{
    			return 0;
    		}
    		else
    		{
    			return array[n];
    		}
    	}
    	
    }



    public static void main(String args[]){
        //Test Case 1
        {
            int[] coinDenoms = new int[] {100,200,300,400,500};
            int amount = 1300;
            int solnList = new MinCoinsCost().findMinCoins(coinDenoms,amount);
            System.out.println("1. Min coin : " + solnList);
        }
        //Test Case 2
        {
            int[] coinDenoms = new int[] {5,10,30,40};
            int amount = 60; 
            int solnList = new MinCoinsCost().findMinCoins(coinDenoms,amount);
            System.out.println("2. Min coin : " + solnList);
        }
        //Test Case 3
        {
            int[] coinDenoms = new int[] {100,100,300,400,500,600};
            int amount = 50;
            int solnList = new MinCoinsCost().findMinCoins(coinDenoms,amount);
            System.out.println("3. Min coin : " + solnList);
        }
        
    }
}