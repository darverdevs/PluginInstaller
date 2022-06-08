package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class plistCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("plist")) {
            sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
            // TODO: Finish this list
            sender.sendMessage("1. Factions       8. AntiSwear");
            sender.sendMessage("2. ProtocolLib    9. ");
            sender.sendMessage("3. PermissionSex 10. ");
            sender.sendMessage("4. Vault         11. ");
            sender.sendMessage("5. CoreProtect   12. ");
            sender.sendMessage("6. DupePatch     13. ");
            sender.sendMessage("7. BitchFilter   14. ");
        }
        return false;
    }
}
