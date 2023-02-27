package day09;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 15:47
 * @Description:
 */
public class ArrayUtil {
    public int getMax(int [] arr){
        int maxValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    public int getMin(int[] arr){
        int minValue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(minValue>arr[i]){
                minValue=arr[i];
            }
        }
        return minValue;
    }
    public int getSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int getAvg(int[] arr){
        return getSum ( arr )/arr.length;
    }

    /**
     * description 反转int[]
     * param [arr]
     * return void
     * author Binyu
     * createTime 2021/2/17 16:39
     **/
    public void reverse(int[] arr){
        if(arr==null||arr.length==0) {return;}
        else {
            for(int i=0;i<arr.length/2;i++){
//                int temp=arr[i];
//                arr[i]=arr[arr.length-1-i];
//                arr[arr.length-1-i]=temp;
                swap(arr,i,arr.length-1-i);
            }
        }
    }
    /**
     * description 交换int[]数组中两个int值，其中i,j是索引
     * param [arr, i, j]
     * return void
     * author Binyu
     * createTime 2021/2/17 19:31
     **/
    public void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    /**
     * description 反转String[]
     * param [arr]
     * return java.lang.String[]
     * author Binyu
     * createTime 2021/2/17 16:39
     **/
    public String[] reverse(String[] arr){
        if(arr==null||arr.length==0) {return new String[]{};}
        else {
            for(int i=0;i<arr.length/2;i++){
                String temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
        }
        return arr;
    }
    /**
     * description 复制int[]
     * param [arr]
     * return int[]
     * author Binyu
     * createTime 2021/2/17 16:39
     **/
    public int[] copy(int[] arr){
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }
    /**
     * description 对int[]排序
     * param [arr]
     * return void
     * author Binyu
     * createTime 2021/2/17 16:40
     **/
    public void sort(int[] arr){
        if(arr==null||arr.length==0){return;}
        else{
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }
    /**
     * description 打印int[]
     * param [arr]
     * return void
     * author Binyu
     * createTime 2021/2/17 16:40
     **/
    public void print(int[] arr){
        System.out.print ("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print (arr[i]+",");
        }
        System.out.print (arr[arr.length-1]);
        System.out.println ("]");
    }
    /**
     * description 打印String[]
     * param [arr]
     * return void
     * author Binyu
     * createTime 2021/2/17 16:40
     **/
    public void print(String[] arr){
        System.out.print ("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print (arr[i]+",");
        }
        System.out.print (arr[arr.length-1]);
        System.out.println ("]");
    }
    /**
     * description 查找int[]中dest所在的索引，如找不到则返回-1
     * param [arr, dest]
     * return int
     * author Binyu
     * createTime 2021/2/17 16:41
     **/
    public int getIndex(int[] arr,int dest){
        for(int i=0;i<arr.length;i++){
            if(dest==arr[i]){
                return i;
            }
        }
        return -1;//返回一个负数，表示没有找到
    }
}
