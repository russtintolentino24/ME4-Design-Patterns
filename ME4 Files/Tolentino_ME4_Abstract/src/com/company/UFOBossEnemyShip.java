package com.company;

public class UFOBossEnemyShip extends EnemyShip{


    EnemyShipFactory shipFactory;



    public UFOBossEnemyShip(EnemyShipFactory shipFactory){

        this.shipFactory = shipFactory;

    }



    void makeShip() {

        // TODO Auto-generated method stub

        System.out.println("Making enemy ship " + getName());



        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }

}