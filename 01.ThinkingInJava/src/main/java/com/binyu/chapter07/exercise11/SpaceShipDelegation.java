package com.binyu.chapter07.exercise11;

/**
 * @BelongsProject: 2021Study-Java
 * @BelongsPackage: com.binyu.chapter07.exercise11
 * @Author: Dong Binyu
 * @CreateTime: 2021-01-31 12:50
 * @Description: 只复原了书上的代理方式
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls spaceShipControls=new SpaceShipControls ();
    public SpaceShipDelegation(String name){
        this.name=name;
    }
    void up(int velocity){
        spaceShipControls.back ( velocity );

    }
    void down(int velocity){
        spaceShipControls.down ( velocity );
    }
    void left(int velocity){
        spaceShipControls.left ( velocity );
    }
    void right(int velocity){
        spaceShipControls.right ( velocity );
    }
    void forward(int velocity){
        spaceShipControls.forward ( velocity );
    }
    void back(int velocity){
        spaceShipControls.back ( velocity );
    }
    void turboBoost(int velocity){
        spaceShipControls.turboBoost ( velocity );
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation=new SpaceShipDelegation (  "NASA Protector");
        spaceShipDelegation.forward ( 100 );
    }
}
