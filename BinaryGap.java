/*
	Solution to Codility's Binary Gap Task
	Average Run Time O(log(N))
*/
class Solution 
{
    public int solution(int N) 
    {
        //Base and Edge Cases
		if (N<5)
			return 0;
		else if (N==5)
			return 1;
		else if (N<9)
			return 0;
		
        int mc = 0; //Max Count
		int cc = 0; //Count
		
        while (N>0 && N%2==0) //Remove Trailing Zeroes
            N/=2;
        while (N>0) //Check Digits
        {
            if (N%2==0) //If Digit is 0
                cc++; //Increment Count
            else if (cc!=0) //Digit is 1, If Count Isn't Zero
            {
                mc = (cc>mc) ? cc : mc; //Set Max Count if Count is Greater
				cc = 0; //Reset Count
            }
            
            N/=2; //Set Next Digit to Check
        }
        return mc; //Return Max Count
    }
}