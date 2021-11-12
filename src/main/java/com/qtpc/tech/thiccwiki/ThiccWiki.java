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
        this.getCommand("gachsmp").setExecutor(new gachsmp());
        this.getCommand("rule").setExecutor(new rules());
        this.getCommand("rules").setExecutor(new rules());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
