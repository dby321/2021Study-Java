package day16.java2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day16.java2
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-25 17:28
 * @Description:
 */
public class MyException extends RuntimeException {
    static final long serialVersionUID = 1L;
    public MyException(){

    }
    public MyException(String msg){
        super (msg);
    }
}
