package tech.nully.PluginUpdater;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {
    private static Plugin instance = null;
    public static Plugin getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
        try {
            Updater.UpdateInstaller();
        } catch (IOException e) {
            System.out.println("PluginUpdater: Error while updating PluginInstaller, please contact Bongo Cat#1100 on discord");
        }
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[EaglerPluginUpdater]" + ChatColor.AQUA + " EaglerPluginInstaller V1.0.8 is now Enabled! :D");
        getServer().getConsoleSender().sendMessage("You do not need to do anything, this plugin will automatically update your PluginInstaller on startup");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[EaglerPluginUpdater]" + ChatColor.AQUA + " EaglerPluginUpdater V1.0.8 is now Disabled! D:");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }
}
