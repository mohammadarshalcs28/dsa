class Solution {
    public int fib(int n) {
        int a =0,b =1 ,sum =0;
        if(n !=0){
        for(int i=0;i<=n-2;i++)
        {
            sum = a+b;
            a = b;
            b =sum;
        }
        return b;
        }
        return 0;
    }
}