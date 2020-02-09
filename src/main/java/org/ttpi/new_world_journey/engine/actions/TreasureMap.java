package org.ttpi.new_world_journey.engine.actions;

import org.ttpi.new_world_journey.engine.ships.Ship;

public class TreasureMap extends Action {
    public TreasureMap() {
        super(30, new int[] {1,2});
    }
    public Ship execute(Ship ship, int argument) {
        double percent = (Math.random()*100) + 1;
        if (argument == 0){
            return ship;
        }else if(argument == 1){
            if(percent >= 1 && percent <= 33){
                executeShipWrecked();
            }else if(percent > 33 && percent <= 66){
                executeAngryNatives();
            }else{
                executeFindFood();
            }
        }

        return ship;
    }

    public void executeFindTreasureGetLost(){

    }
    public void executeFindTreasure(){

    }
    public void executeGetLost(){

    }
}
