package com.demo9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.demo9
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 12:26
 * @Description:
 */
class NumThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println ( i );
                sum += i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread ();
        FutureTask<Integer> futureTask = new FutureTask<> ( numThread );
        Thread thread=new Thread ( futureTask );
        thread.start ();

//         get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
        Integer sum = null;
        try {
            sum = futureTask.get ();
            System.out.println ("总和为"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        } catch (ExecutionException e) {
            e.printStackTrace ();
        }

    }
}
