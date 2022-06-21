package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class PluginList {
    private static String[] AlphaPluginList = new String[]{"AdminFun", "AntiSwear", "AuthMe", "AyunCord", "BattleArena", "BitchFilter", "BloodMoon",
            "ChestMaster", "Citizens", "ClearLag", "CommandNPC", "ComZombies", "CoreProtect", "CrackShot", "CraftBook", "DupePatch", "DynMap", "Essentials",
            "EssentialsAntiBuild", "EssentialsChat", "EssentialsProtect", "EssentialsSpawn", "Factions", "FakePlayersOnline", "LortinsRPGMobs", "MagicSpellBook",
            "MagicSpells", "MarriageMaster", "MCMMO", "MCMMORankUp", "MCore", "MobArena", "MonsterApocalypse", "MonsterMadness", "Multiverse", "Music", "MyRPG",
            "MyWarp", "OreGenerator", "PermissionSex", "ProtocolLib", "PVPSticks", "RealisticBackpacks", "RPGTrades", "RuneCraft", "ServerMiniMap", "Shop",
            "SignShop", "SilkSpawners", "SimpleClans", "Slaves", "SlimeFun", "StackableItems", "Stats", "TheArcher", "Timber", "ToolStats", "UberEnchant", "UCars",
            "Vampire", "Vault", "VEnchant", "Wizards", "WorldEdit", "WorldGuard"};
    public static void SendPG1ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
        int SecondCollumn = 8;

        for (int i = 1; i < 8; i++) {
            int Spaces = 21-AlphaPluginList[i-1].length();
            List<String> spaces = new ArrayList<>();
            for (int forInt = 0; forInt < Spaces; forInt++) {
                spaces.add(" ");
            }
            sender.sendMessage(i+". "+ AlphaPluginList[i-1] + "" + Utils.ListToString(spaces) + "" +SecondCollumn + ". " + AlphaPluginList[SecondCollumn-1]);
            SecondCollumn++;
        }
        sender.sendMessage("             Page 1 of 6");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG2ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 22;
        for (int i = 15; i < 22; i++) {
            String Col1;
            String Col2;

            //  Null checkers for elements in the Array
            try {
                Col1 = AlphaPluginList[i-1];
            } catch (ArrayIndexOutOfBoundsException y) {
                Col1 = "N/A";
            }
            try {
                Col2 = AlphaPluginList[SecondCollumn-1];
            } catch (ArrayIndexOutOfBoundsException a) {
                Col2 = "N/A";
            }
            // _________________________________________

            int Spaces = 21-AlphaPluginList[i-1].length();
            List<String> spaces = new ArrayList<>();
            for (int forInt = 0; forInt < Spaces; forInt++) {
                spaces.add(" ");
            }
            sender.sendMessage(i+". "+ Col1 + "" + Utils.ListToString(spaces) + "" + SecondCollumn + ". " + Col2);
            SecondCollumn++;
        }

        sender.sendMessage("             Page 2 of 6");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG3ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 36;
        for (int i = 29; i < 36; i++) {
            String Col31;
            String Col32;

            //  Null checkers for elements in the Array
            try {
                Col31 = AlphaPluginList[i-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col31 = "N/A";
            }
            try {
                Col32 = AlphaPluginList[SecondCollumn-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col32 = "N/A";
            }
            // _________________________________________

            int Spaces = 21-Col31.length();
            List<String> spaces = new ArrayList<>();
            for (int forInt = 0; forInt < Spaces; forInt++) {
                spaces.add(" ");
            }
            sender.sendMessage(i+". "+ Col31 + "" + Utils.ListToString(spaces) + "" + SecondCollumn + ". " + Col32);
            SecondCollumn++;
        }

        sender.sendMessage("             Page 3 of 6");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG4ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 50;
        for (int i = 43; i < 50; i++) {
            String Col41;
            String Col42;

            //  Null checkers for elements in the Array
            try {
                Col41 = AlphaPluginList[i-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col41 = "N/A";
            }
            try {
                Col42 = AlphaPluginList[SecondCollumn-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col42 = "N/A";
            }
            // _________________________________________

            int Spaces = 21-Col41.length();
            List<String> spaces = new ArrayList<>();
            for (int forInt = 0; forInt < Spaces; forInt++) {
                spaces.add(" ");
            }
            sender.sendMessage(i+". "+ Col41 + "" + Utils.ListToString(spaces) + "" + SecondCollumn + ". " + Col42);
            SecondCollumn++;
        }

        sender.sendMessage("             Page 4 of 6");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG5ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 64;
        for (int i = 57; i < 64; i++) {
            String Col41;
            String Col42;

            //  Null checkers for elements in the Array
            try {
                Col41 = AlphaPluginList[i-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col41 = "N/A";
            }
            try {
                Col42 = AlphaPluginList[SecondCollumn-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col42 = "N/A";
            }
            // _________________________________________

            int Spaces = 21-Col41.length();
            List<String> spaces = new ArrayList<>();
            for (int forInt = 0; forInt < Spaces; forInt++) {
                spaces.add(" ");
            }
            sender.sendMessage(i+". "+ Col41 + "" + Utils.ListToString(spaces) + "" + SecondCollumn + ". " + Col42);
            SecondCollumn++;
        }

        sender.sendMessage("             Page 5 of 6");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG6ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 78;
        for (int i = 71; i < 78; i++) {
            String Col41;
            String Col42;

            //  Null checkers for elements in the Array
            try {
                Col41 = AlphaPluginList[i-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col41 = "N/A";
            }
            try {
                Col42 = AlphaPluginList[SecondCollumn-1];
            } catch (ArrayIndexOutOfBoundsException e) {
                Col42 = "N/A";
            }
            // _________________________________________

            int Spaces = 21-Col41.length();
            List<String> spaces = new ArrayList<>();
            for (int forInt = 0; forInt < Spaces; forInt++) {
                spaces.add(" ");
            }
            sender.sendMessage(i+". "+ Col41 + "" + Utils.ListToString(spaces) + "" + SecondCollumn + ". " + Col42);
            SecondCollumn++;
        }

        sender.sendMessage("             Page 6 of 6");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }
}

