package com.qtpc.tech.thiccwiki.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class rules implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage("---------------------------");
        sender.sendMessage("Thicc SMP Rules (Vietnamese - Discord):");
        sender.sendMessage(ChatColor.AQUA + "https://thiccsmp.qtpc.tech/rules");
        sender.sendMessage("---------------------------");
        return true;
    }
}
