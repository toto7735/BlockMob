package me.toto7735.blockMob.listener;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        boolean b = false;
        while (!b) b = spawn(event.getBlock().getLocation());
    }

    static boolean spawn(Location location) {
        try {
            location.getWorld().spawnEntity(location.getBlock().getLocation(), EntityType.values()[new Random().nextInt(EntityType.values().length)]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
