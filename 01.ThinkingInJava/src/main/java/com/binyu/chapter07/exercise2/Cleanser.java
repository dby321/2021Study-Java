package com.binyu.chapter07.exercise2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise2
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-30 19:20
 * @Description:
 */
class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append ( "dilute()" );
    }

    public void apply() {
        append ( "apply()" );
    }

    public void scrub() {
        append ( "scrub()" );
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser ();
        cleanser.dilute ();
        cleanser.scrub ();
        cleanser.apply ();
        System.out.println ( cleanser );
    }
}
