package me.Jelle30.BetterGameMode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public enum GM {

    CREATIVE,
    SURVIVAL,
    ADVENTURE,
    SPECTATOR,
    FLY;
    private Plugin plugin = Main.getPlugin(Main.class);


    public static void changeGamemode(GM gamemode, Player p) {
        Plugin plugin = Main.getPlugin(Main.class);
        switch (gamemode) {

            // CREATIVE

            case CREATIVE:
                if (p.hasPermission("Gamemode.CREATIVE")) {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage(plugin.getConfig().getString("GamemodeCreative").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                } else {
                    p.sendMessage(plugin.getConfig().getString("NoPermission").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                }
                break;

                // SURVIVAL

            case SURVIVAL:
                if (p.hasPermission("Gamemode.Survival")) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage(plugin.getConfig().getString("GamemodeSurvival").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));

                } else {
                    p.sendMessage(plugin.getConfig().getString("NoPermission").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                }
                break;

                // ADVENTURE

            case ADVENTURE:
                if (p.hasPermission("Gamemode.Adventure")) {
                    p.setGameMode(GameMode.ADVENTURE);
                    p.sendMessage(plugin.getConfig().getString("GamemodeAdventure").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                } else {
                    p.sendMessage(plugin.getConfig().getString("NoPermission").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                }
                break;

                // SPECTATOR

            case SPECTATOR:
                if (p.hasPermission("Gamemode.Spectator")) {
                    p.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage(plugin.getConfig().getString("GamemodeSpectator").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                } else {
                    p.sendMessage(plugin.getConfig().getString("NoPermission").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                }
                break;

                // FLY

            case FLY:
                if (p.hasPermission("Gamemode.Fly")) {
                    if (p.getAllowFlight() == true) {
                        p.setAllowFlight(false);
                        p.setFlying(false);
                        p.sendMessage(plugin.getConfig().getString("FlyDisable").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                    } else if (p.getAllowFlight() == false) {
                        p.setAllowFlight(true);
                        p.setFlying(true);
                        p.sendMessage(plugin.getConfig().getString("FlyEnable").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                    }
                } else {
                    p.sendMessage(plugin.getConfig().getString("NoPermission").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                }
                break;
        }
    }
}

