package day09;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day09
 * @Author: Dong Binyu
 * @CreateTime: 2021-02-17 16:51
 * @Description: 这是OverLoad的练习
 */
public class OverloadExer {
    public void mOL(int i) {
        System.out.println ( i * i );
    }

    public void mOL(int i, int j) {
        System.out.println ( i * j );
    }

    public void mOL(String s) {
        System.out.println ( s );
    }

    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double d1, double d2) {
        return (d1 > d2) ? d1 : d2;
    }

    public double max(double d1, double d2, double d3) {
        double max = (d1 > d2) ? d1 : d2;
        return (max > d3) ? max : d3;
    }

    public static void main(String[] args) {
        OverloadExer exer = new OverloadExer ();
        System.out.println ( exer.max ( 20, 30 ) );
        System.out.println ( exer.max ( 50.0, 35.0 ) );
        exer.mOL ( 30 );
        exer.mOL ( 30,50 );
    }
}
