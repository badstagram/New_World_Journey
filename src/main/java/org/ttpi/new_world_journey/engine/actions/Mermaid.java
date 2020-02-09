package org.ttpi.new_world_journey.engine.actions;

import net.dv8tion.jda.api.entities.MessageChannel;
import org.ttpi.new_world_journey.engine.ships.Ship;

public class Mermaid extends Action{
    private MessageChannel channel;
    private String discordId;
    private Ship ship;
    public Mermaid(String discordId, MessageChannel channel) {
        super(10, new int[] {1,2,3});
        channel = channel;
        discordId = discordId;
    }
    public Ship execute(Ship ship, int argument) {
        this.ship = ship;
        double percent = (Math.random()*100) + 1;
        if (argument == 0){
            return ship;
        }else if(argument == 1){
            if(percent >= 1 && percent <= 50){
                executeMoreMen();
            }else{
                executeMoreWomen();
            }
        }

        return ship;
    }

    public void executeMoreMen(){

    }
    public void executeMoreWomen(){

    }
}
