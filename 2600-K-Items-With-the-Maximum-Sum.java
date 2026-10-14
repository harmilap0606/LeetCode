class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        
        if(numOnes>=k) return k;

        if((numOnes+numZeros) >= k) return numOnes;

        int req = k-(numOnes+numZeros);
        return numOnes-req;

    }
}