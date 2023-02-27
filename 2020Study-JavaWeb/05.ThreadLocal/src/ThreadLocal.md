# ThreadLocal
> 解决多线程的数据安全问题
> 可以给当前线程关联一个数据

> Synchronized是通过线程等待，牺牲时间来解决访问冲突
  ThreadLocal是通过每个线程单独一份存储空间，牺牲空间来解决冲突，并且相比于Synchronized，ThreadLocal具有线程隔离的效果，只有在线程内才能获取到对应的值，线程外则不能访问到想要的值。
  
