package tech.nully.PluginInstaller;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;

public class Installer {

    public void InstallPlugin(InputStream in, String pluginName, CommandSender s) throws IOException {
        File f = new File(Main.getInstance().getDataFolder().getParent() + "/" + pluginName + ".jar");
        Files.copy(in, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public boolean IsValidLink(String url) throws IOException{
        URL u = new URL(url);
        HttpURLConnection huc =  (HttpURLConnection)  u.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        return huc.getResponseCode() == 200;
    }

    public static void InstallUpdater() throws IOException {
        File file = new File(Main.getInstance().getDataFolder().getParent() + "/EaglerPluginUpdater.jar");
        if (!(file.exists())) {
            URL plugin = URI.create("https://github.com/darverdevs/PluginInstaller/raw/Updater/out/artifacts/EaglerPluginUpdater_jar/EaglerPluginUpdater.jar")
                    .toURL();
            InputStream in = plugin.openStream();
            Files.copy(in, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
