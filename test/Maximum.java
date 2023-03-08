package com.test;

public class Maximum {

	public static void main(String[] args) 
	{
		int[] arr= {7,1,5,3,6,4};
		Maximum z=new Maximum();
	   System.out.println(z.maxProfit(arr)); 
    }
	public int maxProfit(int[] prices) {
		        int len = prices.length;
		        if(len<=1) return 0;
		        int max = 0;
		        int low = prices[0];
		        for(int i=1; i<len; i++){
		            max = prices[i]-low>max?prices[i]-low:max;
		            low = prices[i]<low?prices[i]:low;
		        }
		        return max;
		    }
		
		
	}



	


