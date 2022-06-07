package tech.nully.PluginInstaller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.org.ibex.nestedvm.util.Seekable;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InstallCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender snder, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("installpl")) {
            Installer ins = new Installer();
            String Install_Jar = cmd.getName();
            if (ins.JARURLs.containsKey(Install_Jar)) {
                try (InputStream in = URI.create(ins.JARURLs.get(Install_Jar)).toURL().openStream()) {
                    ins.InstallPlugin(in);
                } catch (IOException e) {
                }


            }
        }
        return false;
    }
}
