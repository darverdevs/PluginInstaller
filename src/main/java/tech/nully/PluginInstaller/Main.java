package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import tech.nully.PluginInstaller.Commands.InstallCommand;
import tech.nully.PluginInstaller.Commands.plistCommand;

import java.io.IOException;

public class Main extends JavaPlugin {
    private static Plugin instance = null;
    public static Plugin getInstance() {
        return instance;
    }
    private static ConsoleCommandSender ConsoleSender;
    @Override
    public void onEnable() {
        ConsoleSender = getServer().getConsoleSender();
        instance = this;
        try {
            Installer.InstallUpdater();
        } catch (IOException e) {
            System.out.println("PluginUpdater: Error while installing EaglerPluginUpdater, please contact Bongo Cat#1100 on discord");
        }
        getCommand("install").setExecutor(new InstallCommand());
        getCommand("plist").setExecutor(new plistCommand());
        ConsoleSender.sendMessage("--------------------------------------------");
        ConsoleSender.sendMessage("--------------------------------------------");
        ConsoleSender.sendMessage(
                ChatColor.GREEN + "[EaglerPluginInstaller]" + ChatColor.AQUA + " EaglerPluginInstaller V1.1.3 is now Enabled! :D");
        ConsoleSender.sendMessage("To use PluginInstaller, run the command \"/install <pluginname>\" (\"install <pluginname>\" in console) to install a plugin");
        ConsoleSender.sendMessage("To get a list of installable plugins, use the command \"/plist\" or \"plist\" in console");
        ConsoleSender.sendMessage("You can request to add a new plugin to the database by going to https://github.com/darverdevs/PluginInstallerRepo/tree/main");
        ConsoleSender.sendMessage("and creating an issue or pull request of the plugin you want to add");
        ConsoleSender.sendMessage("--------------------------------------------");
        ConsoleSender.sendMessage("--------------------------------------------");
    }

    @Override
    public void onDisable() {
        ConsoleSender.sendMessage("--------------------------------------------");
        ConsoleSender.sendMessage("--------------------------------------------");
        ConsoleSender.sendMessage(
                ChatColor.GREEN + "[EaglerPluginInstaller]" + ChatColor.AQUA + " PluginInstaller V1.1.3 is now Disabled! D:");
        ConsoleSender.sendMessage("--------------------------------------------");
        ConsoleSender.sendMessage("--------------------------------------------");
    }
}
