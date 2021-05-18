package io.github.mtechtips.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class plugin extends JavaPlugin {
    @Override
    public void onEnable() {

        getLogger().info("onEnable is called!");
    }
    @Override
    public void onDisable() {

        getLogger().info("onDisable is called!");
    }
}