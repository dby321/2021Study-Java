package com.binyu.chapter02.exercise8;

/**
 * @BelongsProject: 2021Study-JavaSE
 * @BelongsPackage: com.binyu.chapter02.exercise8
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-22 18:38
 * @Description:
 */
@SuppressWarnings ( "All" )
public class NotStaticClassName {
    int i=50;
    public static void main(String[] args) {
        NotStaticClassName scn1=new NotStaticClassName ();
        NotStaticClassName scn2=new NotStaticClassName ();
        NotStaticClassName scn3=new NotStaticClassName ();
        System.out.println ("scn1="+scn1.i+" scn2="+scn2.i+" scn3="+scn3.i);
        scn1.i++;
        System.out.println ("scn1="+scn1.i+" scn2="+scn2.i+" scn3="+scn3.i);
        scn2.i++;
        System.out.println ("scn1="+scn1.i+" scn2="+scn2.i+" scn3="+scn3.i);
    }
}
