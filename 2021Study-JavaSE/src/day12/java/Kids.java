package day12.java;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: day12
 * @Author: Dong Binyu
 * @CreateTime: 2021-04-19 11:12
 * @Description: 这是一个JavaBean的例子
 */
public class Kids extends ManKind{
    private int yearsOld;
    public void printAge(){
        System.out.println ("I'm "+this.yearsOld+"years old.");
    }

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return this.yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
