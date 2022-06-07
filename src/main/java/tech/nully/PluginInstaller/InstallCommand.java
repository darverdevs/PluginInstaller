package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Locale;

public class InstallCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender snder, Command cmd, String label, String[] args) {
        // Name checker
        if (cmd.getName().equalsIgnoreCase("installpl")) {
            snder.sendMessage("Check 1 passed");
            if (snder.isOp() || snder instanceof ConsoleCommandSender) {
                snder.sendMessage("Check 2 passed");
                Installer ins = new Installer();
                if (args.length != 1) return false;
                snder.sendMessage("Check 3 passed");
                String Install_Jar = args[0].toLowerCase();

                // Checks if the list of plugin links contains what the user wants to install
                if (Main.getJavaURLs().containsKey(Install_Jar)) {
                    snder.sendMessage("Check 4 passed");
                    // Creates an input stream based on the corresponding URL from the players first argument
                    try (InputStream in = URI.create(Main.getJavaURLs().get(Install_Jar)).toURL().openStream()) {
                        snder.sendMessage("Check 5 passed");
                        // Installs the plugin
                        ins.InstallPlugin(in, Install_Jar.toLowerCase(), snder);
                        snder.sendMessage("You have successfully installed the " + ChatColor.GREEN + Install_Jar.toUpperCase() + ChatColor.WHITE + " plugin!");
                        return true;
                    } catch (IOException e) {
                    }
                }
            }
        }
        return false;
    }
}
