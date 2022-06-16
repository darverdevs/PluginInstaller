package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Locale;

public class InstallCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender snder, Command cmd, String label, String[] args) {
        // Name checker
        if (cmd.getName().equalsIgnoreCase("install")) {
            if (snder.isOp() || snder instanceof ConsoleCommandSender) {
                Installer ins = new Installer();
                // handler for install argument
                if (args.length == 1) {
                    String Install_Jar = args[0].toLowerCase();

                    // Checks if the created URL is a valid one
                    try {
                        if (ins.IsValidLink("https://github.com/darverdevs/PluginInstallerRepo/raw/main/" + Install_Jar + ".jar")) {
                            //plugin URL
                            URL plugin = URI.create("https://github.com/darverdevs/PluginInstallerRepo/raw/main/" + Install_Jar + ".jar")
                                    .toURL();

                            // Creates the InputStream
                            try (InputStream in = plugin.openStream()) {

                                // Installs the plugin
                                ins.InstallPlugin(in, Install_Jar.substring(0, 1).toUpperCase() + Install_Jar.substring(1));
                                snder.sendMessage("You have successfully installed the " + ChatColor.GREEN + Install_Jar.toUpperCase() + ChatColor.WHITE + " plugin!");
                                return true;
                            } catch (IOException e) {}
                        } else if (Install_Jar.equalsIgnoreCase("recommended")) {
                            InputStream reco1 = URI.create("https://github.com/darverdevs/PluginInstallerRepo/raw/main/dupepatch.jar")
                                    .toURL().openStream();
                            InputStream reco2 = URI.create("https://github.com/darverdevs/PluginInstallerRepo/raw/main/essentials.jar")
                                    .toURL().openStream();
                            InputStream reco3 = URI.create("https://github.com/darverdevs/PluginInstallerRepo/raw/main/essentialsspawn.jar")
                                    .toURL().openStream();
                            ins.InstallPlugin(reco1, "DupePatch");
                            snder.sendMessage("You have successfully installed the " + ChatColor.GREEN + "DupePatch" + ChatColor.WHITE + " plugin!");
                            ins.InstallPlugin(reco1, "Essentials");
                            snder.sendMessage("You have successfully installed the " + ChatColor.GREEN + "Essentials" + ChatColor.WHITE + " plugin!");
                            ins.InstallPlugin(reco1, "EssentialsSpawn");
                            snder.sendMessage("You have successfully installed the " + ChatColor.GREEN + "EssentialsSpawn" + ChatColor.WHITE + " plugin!");
                            return true;
                        }
                    } catch (IOException e) {
                        snder.sendMessage("\"" + Install_Jar + "\"" + "is not a valid plugin from the database");
                    }
                }
            }
        }
        return false;
    }
}
