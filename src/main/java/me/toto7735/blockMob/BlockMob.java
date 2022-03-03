package me.toto7735.blockMob;

import me.toto7735.blockMob.listener.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockMob extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Enabled!");

        Bukkit.getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Disabled!");
    }

}
