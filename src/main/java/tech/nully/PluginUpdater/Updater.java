package tech.nully.PluginUpdater;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static org.bukkit.Bukkit.getServer;

public class Updater {
    public static void UpdateInstaller() throws IOException {
        InputStream in = URI.create("https://github.com/darverdevs/PluginInstaller/raw/main/out/artifacts/PluginInstaller_jar/PluginInstaller.jar")
                .toURL().openStream();
        File f = new File(Main.getInstance().getDataFolder().getParent() + "/" + "PluginInstaller" + ".jar");
        f.delete();
        Files.copy(in, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
        getServer().getPluginManager().disablePlugin(tech.nully.PluginInstaller.Main.getInstance());
        getServer().getPluginManager().enablePlugin(tech.nully.PluginInstaller.Main.getInstance());
    }
}
