package day09;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 15:51
 * @Description:
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util=new ArrayUtil ();
        int[] arr=new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
        int max=util.getMax(arr);
        System.out.println ("最大值为:"+max);
        int min = util.getMin ( arr );
        System.out.println ("最小值为:"+min);
        int[] copy = util.copy ( arr );
        System.out.println ("拷贝数组:"+copy);
        int avg = util.getAvg ( arr );
        System.out.println ("平均值:"+avg);
        int index = util.getIndex ( arr, 54 );
        System.out.println ("54的索引值:"+index);
        util.print ( arr );
        util.sort ( arr );
        util.print ( arr );
        util.reverse ( arr );
        util.print ( arr );
        String[] strings=new String[]{"董滨雨","hahaha","houhouhou"};
        util.print ( strings );
        String[] reverse = util.reverse ( strings );
        util.print(reverse);

    }
}
