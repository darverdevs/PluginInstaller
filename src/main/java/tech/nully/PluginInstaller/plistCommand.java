package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class plistCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("plist") && sender.isOp() || sender instanceof ConsoleCommandSender) {
            if (args.length >= 1) {
                if (args[0] == null) {
                    sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
                    // TODO: Finish this list
                    PluginList.SendPG1ToSender(sender);
                    return true;
                }
                int listPage = 0;
                boolean PageArgIsInt = false;
                try {
                     listPage= Integer.parseInt(args[0]);
                     PageArgIsInt = true;
                } catch (NumberFormatException n) {
                    sender.sendMessage(ChatColor.RED + "That is not a valid page number!");
                    PageArgIsInt = false;
                    return false;
                }

                if (PageArgIsInt) {

                }
            }
         }
        return false;
    }
}
