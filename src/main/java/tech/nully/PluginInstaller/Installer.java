package tech.nully.PluginInstaller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;

public class Installer {
    public HashMap<String, String> JARURLs = new HashMap<>();

    public static void SetupInstaller() {
        Installer ins = new Installer();
        ins.JARURLs.put("dynmap", "https://github.com/darverdevs/PluginInstallerRepo/raw/main/dynmap-1.9.1.jar");
    }

    public void InstallPlugin(InputStream in) throws IOException {
        Files.copy(in, Main.getInstance().getDataFolder().toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
