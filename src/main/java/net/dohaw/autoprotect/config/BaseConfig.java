package net.dohaw.autoprotect.config;

import net.dohaw.corelib.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class BaseConfig extends Config {

    public BaseConfig(JavaPlugin plugin) {
        super(plugin, "config.yml");
    }

    public double getBlockRestoreInterval(){
        return config.getDouble("Restore Block Interval", 1);
    }

}
