package tech.nully.PluginInstaller;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Plugin instance = null;
    public static Plugin getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin has been disabled!");
    }
}
