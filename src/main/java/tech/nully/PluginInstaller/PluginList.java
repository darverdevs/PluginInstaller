package tech.nully.PluginInstaller;

import org.bukkit.command.CommandSender;

import java.net.*;
import java.io.*;

public class PluginList {
    public static void SendPG1ToSender(CommandSender sender) {
        try {
            URL files = URI.create("https://raw.githubusercontent.com/darverdevs/PluginInstallerRepo/main/names.txt").toURL();
            URLConnection file = files.openConnection();
            BufferedReader best = new BufferedReader(new InputStreamReader(file.getInputStream()));
            while ((best.readLine() != null)) {
                sender.sendMessage(best.readLine());
            }
            best.close();
        }
        catch(IOException io) {
            System.out.println(io.getMessage());
        }
        /*sender.sendMessage("1. AntiSwear      8. AntiSwear");
        sender.sendMessage("2. BitchFilter    9. ProtocolLib");
        sender.sendMessage("3. CoreProtect   10. MCore");
        sender.sendMessage("4. CrackShot     11. ");
        sender.sendMessage("5. DupePatch     12. ");
        sender.sendMessage("6. DynMap        13. ");
        sender.sendMessage("7. BitchFilter   14. ");*/
        
    }
}

