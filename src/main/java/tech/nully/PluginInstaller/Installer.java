package tech.nully.PluginInstaller;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;

public class Installer {
    private HashMap<String, String> JARURLs = new HashMap<>();

    public static HashMap<String, String> SetupInstaller() {
        Installer ins = new Installer();
        ins.JARURLs.put("dynmap", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/dynmap-1.9.1.jar");;
        ins.JARURLs.put("factions", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/Factions.jar");
        ins.JARURLs.put("permissionsex", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/PermissionSex.jar");
        ins.JARURLs.put("protocollib", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/ProtocolLib.jar");
        ins.JARURLs.put("vault", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/Vault.jar");
        ins.JARURLs.put("mcore", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/mcore.jar");
        return ins.JARURLs;
    }

    public void InstallPlugin(InputStream in, String pluginName, CommandSender s) throws IOException {
        File f = new File(Main.getInstance().getDataFolder().getParent() + "/" + pluginName + ".jar");
        s.sendMessage("Check 1x passed");
        Files.copy(in, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println(f.toPath().toString());
        s.sendMessage("Check 2x passed");
    }

    public boolean IsValidLink(String url) throws MalformedURLException, IOException{
        URL u = new URL(url);
        HttpURLConnection huc =  (HttpURLConnection)  u.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        return huc.getResponseCode() == 200;
    }
}
