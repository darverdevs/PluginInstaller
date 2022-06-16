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
                    return true;
                }
                if (PageArgIsInt) {
                    int PageArg = Integer.parseInt(args[0]);
                    switch (PageArg) {
                        case 1:
                            PluginList.SendPG1ToSender(sender);
                            break;
                        case 2:
                            PluginList.SendPG2ToSender(sender);
                            break;
                        case 3:
                            PluginList.SendPG3ToSender(sender);
                            break;
                    }
                }
            }
         }
        return false;
    }
}
