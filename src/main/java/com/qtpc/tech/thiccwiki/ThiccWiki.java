package com.qtpc.tech.thiccwiki;

import com.qtpc.tech.thiccwiki.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class ThiccWiki extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("wiki").setExecutor(new wiki());
        this.getCommand("discord").setExecutor(new discord());
        this.getCommand("ip").setExecutor(new ip());
        this.getCommand("enderman").setExecutor(new endermanchvn());
        this.getCommand("donate").setExecutor(new donate());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
