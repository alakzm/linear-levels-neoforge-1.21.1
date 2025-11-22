package com.wasadog91.linearlevels.event;

import com.wasadog91.linearlevels.LinearLevels;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerXpEvent;

@EventBusSubscriber(modid = LinearLevels.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void gainXp(PlayerXpEvent.XpChange event) {
        int xpAmount = event.getAmount();
        Player player = event.getEntity();

        System.out.print("#################gained xp");

    }
}
