/*
 * Copyright 2020 Test Team Pls Ignore.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ttpi.new_world_journey.engine.actions;

import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import net.dv8tion.jda.api.entities.MessageChannel;
import org.ttpi.new_world_journey.engine.ships.Ship;

public class Kraken extends Action {
    private Ship ship;
    private EventWaiter waiter;
    private CommandEvent event;

    public Kraken(EventWaiter waiter, CommandEvent event) {
        super(10, new int[]{2,3});
        this.waiter = waiter;
        this.event = event;
    }

    @Override
    public Ship execute(Ship ship) {
        System.out.println("[EVENT] - Kraken");
        this.ship = ship;
//        switch (argument){
//            case 1:
//            case 2:
//            default:
//        }

        return ship;
    }
}
