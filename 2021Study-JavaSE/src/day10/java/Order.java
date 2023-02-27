package day10.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day10
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-14 16:26
 * @Description:
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate() {
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }

    void methodDefault() {
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }

    public void methodPublic() {
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }
}
