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

                // handler for install argument
                if (args.length == 1) {
                    snder.sendMessage("Check 3 passed");
                    String Install_Jar = args[0].toLowerCase();

                    // Checks if the list of plugin links contains what the user wants to install
                    if (ins.IsValidLink("https://github.com/darverdevs/PluginInstallerRepo/raw/main/" + Install_Jar + ".jar")) {
                        snder.sendMessage("Check 4 passed");
                        // Creates an input stream based on the corresponding URL from the players first argument
                        try (InputStream in = URI.create(Main.getJavaURLs().get(Install_Jar)).toURL().openStream()) {
                            snder.sendMessage("Check 5 passed");
                            // Installs the plugin
                            ins.InstallPlugin(in, Install_Jar.toLowerCase(), snder);
                            snder.sendMessage("You have successfully installed the " + ChatColor.GREEN + Install_Jar.toUpperCase() + ChatColor.WHITE + " plugin!");
                            return true;
                        } catch (IOException e) {}
                    }
                }


                if (args[0].equalsIgnoreCase("list")) {
                    snder.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
                    snder.sendMessage("1. Factions       8. ");
                    snder.sendMessage("2. ProtocolLib    9. ");
                    snder.sendMessage("3. PermissionSex 10. ");
                    snder.sendMessage("4. Vault         11. ");
                    snder.sendMessage("5. BitchFilter   12. ");
                    snder.sendMessage("6. BitchFilter   13. ");
                    snder.sendMessage("7. BitchFilter   14. ");
                }
            }
        }
        return false;
    }
}
