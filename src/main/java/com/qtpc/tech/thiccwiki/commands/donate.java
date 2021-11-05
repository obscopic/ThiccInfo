package com.qtpc.tech.thiccwiki.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class donate implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage("---------------------------");
        sender.sendMessage("Donation methods:");
        sender.sendMessage(" ");
        sender.sendMessage(ChatColor.AQUA + "PayPal" + ChatColor.WHITE + " (Preferred): https://paypal.com/qtpctechhxd");
        sender.sendMessage(ChatColor.AQUA + "PlayerDuo" + ChatColor.WHITE + " (Vietnamese): https://playerduo.com/qtpctechhxd");
        sender.sendMessage(ChatColor.AQUA + "Bank" + ChatColor.WHITE + " (Vietnamese): 1120112358 - Trần Thị Thản - MB Bank");
        sender.sendMessage("---------------------------");
        return true;
    }
}
