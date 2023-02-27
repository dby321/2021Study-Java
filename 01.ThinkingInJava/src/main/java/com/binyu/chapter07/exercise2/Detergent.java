package com.binyu.chapter07.exercise2;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise2
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-30 19:29
 * @Description:
 */
public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append ( "Detergent.scrub" );
        super.scrub ();
    }

    public void foam() {
        append ( "foam()" );
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent ();
        detergent.dilute ();
        detergent.apply ();
        detergent.scrub ();
        detergent.foam ();
        System.out.println (detergent);
        System.out.println ("Testing base class:");
        Cleanser.main ( args );

    }
}
