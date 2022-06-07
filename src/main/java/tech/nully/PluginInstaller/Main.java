package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class Main extends JavaPlugin {
    private static Plugin instance = null;
    public static Plugin getInstance() {
        return instance;
    }
    private static HashMap<String, String> javaURLs = null;
    public static HashMap<String, String> getJavaURLs() {
        return javaURLs;
    }
    @Override
    public void onEnable() {
        instance = this;
        getCommand("installpl").setExecutor(new InstallCommand());
        javaURLs = Installer.SetupInstaller();
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[PluginInstaller]" + ChatColor.AQUA + " PluginInstaller V1.0.0 is now Enabled! :D");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[PluginInstaller]" + ChatColor.AQUA + " PluginInstaller V1.0.0 is now Disabled! D:");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }
}
