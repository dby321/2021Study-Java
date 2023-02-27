package com.binyu.chapter07.exercise11;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise11
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-31 12:48
 * @Description:
 */
public class SpaceShipControls {
    void up(int velocity){
        System.out.println ( "SpaceShipControls.up:"+velocity );
    }
    void down(int velocity){
        System.out.println ( "SpaceShipControls.down:"+velocity );
    }
    void left(int velocity){
        System.out.println ( "SpaceShipControls.left:" +velocity);
    }
    void right(int velocity){
        System.out.println ( "SpaceShipControls.right:" +velocity);
    }
    void forward(int velocity){
        System.out.println ( "SpaceShipControls.forward:" +velocity);
    }
    void back(int velocity){
        System.out.println ( "SpaceShipControls.back:" +velocity);
    }
    void turboBoost(int velocity){
        System.out.println ( "SpaceShipControls.turboBoost:" +velocity);
    }
}
