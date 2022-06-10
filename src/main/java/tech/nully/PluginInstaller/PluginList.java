package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.net.*;
import java.io.*;
import java.util.List;

public class PluginList {
    private static String[] AlphaPluginList = new String[]{"AntiSwear", "BitchFilter", "CoreProtect", "CrackShot", "DupePatch", "DynMap", "Essentials",
    "EssenttialsAntiBuild", "EssentialsChat", "EssentialsProtect", "EssentialsSpawn", "Factions", "MCore", "MyWarp",};
    public static void SendPG1ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
        int SecondCollumn = 8;
        for (int i = 1; i < 8; i++) {
            sender.sendMessage(i+". "+ AlphaPluginList[i-1] + "" +SecondCollumn + ". " + AlphaPluginList[SecondCollumn-1]);
            SecondCollumn++;
        }
        sender.sendMessage("       Page 1 of 12");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG2ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
        int SecondCollumn = 22;
        for (int i = 15; i < 22; i++) {
            String Col1 = "";
            String Col2 = "";
            if (AlphaPluginList[i-1] != null) {
                Col1 = AlphaPluginList[i-1];
            }
            if (AlphaPluginList[SecondCollumn-1] != null) {
                Col2 = AlphaPluginList[SecondCollumn-1];
            }
            sender.sendMessage(i+". "+ Col1 + "" + SecondCollumn + ". " + Col2);
            SecondCollumn++;
        }

        sender.sendMessage("       Page 2 of 12");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }
}

