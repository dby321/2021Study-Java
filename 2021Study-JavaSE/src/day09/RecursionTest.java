package day09;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 20:37
 * @Description:
 */
public class RecursionTest {
    public static void main(String[] args){
        RecursionTest recursionTest=new RecursionTest ();
        int sum = recursionTest.getSum ( 10 );
        System.out.println (sum);//55
        int sum1 = recursionTest.getSum ( 100 );
        System.out.println (sum1);
        int f = recursionTest.f ( 10 );
        System.out.println (f);//10497
        int fibonacci = recursionTest.Fibonacci ( 10 );
        System.out.println (fibonacci);
    }

    /**
     * description
     * param [n]
     * return int
     * author Binyu
     * createTime 2021/2/17 20:49
     **/
    public int getSum(int n){
        if(n==1){
            return 1;
        }else{
            return n+getSum ( n-1 );
        }
    }
    /**
     * description f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n) Exception in thread "main" java.lang.StackOverflowError
     * param [n]
     * return int
     * author Binyu
     * createTime 2021/2/17 20:55
     **/
    public int f(int n){
        if(n==0)return 1;
        else if(n==1)return 4;
        else {
//
            return 2*f(n-1)+f(n-2);
        }
    }
    /**
     * description f(1)=1,f(2)=1,f(n)=f(n-1)+f(n-2)
     * param [n]
     * return int
     * author Binyu
     * createTime 2021/4/12 10:49
     **/
    public int Fibonacci(int n){
        if(n==1) {
            return 1;
        } else if(n==2) {
            return 1;
        } else {
            return Fibonacci ( n-1 )+Fibonacci ( n-2 );
        }
    }
    // 汉诺塔问题 快排 都是递归问题
}
