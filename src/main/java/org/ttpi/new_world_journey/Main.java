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
package org.ttpi.new_world_journey;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.ttpi.new_world_journey.engine.Engine;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        Engine controller = new Engine("1", "mayflower");
        controller.nextTick();
        controller.getShip();
        controller.getCurrentMonth();
        controller.getTargetDistance();
        controller.getShipName();
        controller.getTicksThisMonth();
        controller.getMilesLeft();

        JDABuilder builder = new JDABuilder(args[0]);

        // Disable parts of the cache
        builder.setDisabledCacheFlags(EnumSet.of(CacheFlag.ACTIVITY, CacheFlag.VOICE_STATE));
        // Enable the bulk delete event
        builder.setBulkDeleteSplittingEnabled(false);

        try{
            builder.build();
        } catch(Exception e) {
            System.out.println("Build Error");
        }
    }
}
