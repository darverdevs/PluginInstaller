package tech.nully.PluginUpdater;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Updater {
    public void UpdateInstaller() throws IOException {
        InputStream in = URI.create("https://github.com/darverdevs/PluginInstaller/raw/main/out/artifacts/PluginInstaller_jar/PluginInstaller.jar")
                .toURL().openStream();
        File f = new File(Main.getInstance().getDataFolder().getParent() + "/" + "PluginInstaller" + ".jar");
        f.delete();
        Files.copy(in, f.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
