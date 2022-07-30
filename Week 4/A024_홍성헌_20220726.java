class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0, ten=0;

        if(bills[0]!=5) return false;

        for(int i=0; i<bills.length; i++) {
            if(bills[i]==5) {
                five++;
            }else if(bills[i]==10) { 
                if(five>0) {
                    ten++; five--;	    				
                }else {
                    return false;
                }
            }else { 
                if(five>=3 && ten==0) {
                    five-=3;
                }else if(ten>=1 && five>=1) {
                    ten-=1; five-=1;
                }else {
                    return false;
                }
            }
        } 
	return true;
    }
}