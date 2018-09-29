package me.Jelle30.BetterGameMode.Commands;

import me.Jelle30.BetterGameMode.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.ChatColor;

public class BetterGameModeCommand implements CommandExecutor {

    private Plugin plugin = Main.getPlugin(Main.class);

    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String s, String[] args) {
        Player player = (Player) commandSender;
        if (args.length == 0) {
            player.sendMessage(plugin.getConfig().getString("BetterGameModeNoSubcommand").replaceAll("&", "§").replaceAll("§§", "&").replaceAll("%player%", player.getName()));

        } else {
            if (args[0].equalsIgnoreCase("reload")) {
                if (player.hasPermission("Gamemode.reload"))    {
                    plugin.reloadConfig();
                    player.sendMessage(plugin.getConfig().getString("ConfigReloaded").replaceAll("&", "§").replaceAll("§§", "&").replaceAll("%player%", player.getName()));
                } else {
                    player.sendMessage(plugin.getConfig().getString("NoPermission").replaceAll("&", "§").replaceAll("§§", "&").replaceAll("%player%", player.getName()));
                }
                return false;
            } else  {
                player.sendMessage(plugin.getConfig().getString("BetterGameModeNoSubcommand").replaceAll("&", "§").replaceAll("§§", "&").replaceAll("%player%", player.getName()));
            }
        }
        return false;
    }
}
