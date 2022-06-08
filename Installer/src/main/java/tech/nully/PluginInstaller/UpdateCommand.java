package tech.nully.PluginInstaller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.io.IOException;

public class UpdateCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("update")) {
            if (Sender.isOp() || Sender instanceof ConsoleCommandSender) {
                try {
                    Installer.UpdatePlugin();
                } catch (IOException e) {}
                Sender.sendMessage("The latest download of the plugin has been installed, please reload the server or reload the plugin to have the changes take effect");
                return true;
            }
        }
        return false;
    }
}
