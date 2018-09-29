package me.Jelle30.BetterGameMode;

import me.Jelle30.BetterGameMode.Commands.BetterGameModeCommand;
import me.Jelle30.BetterGameMode.Commands.FlyCommand;
import me.Jelle30.BetterGameMode.Commands.GamemodeCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override

    public void onEnable()  {
        getCommand("gamemode").setExecutor(new GamemodeCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("bettergamemode").setExecutor(new BetterGameModeCommand());
        getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "BetterGameMode" + ChatColor.GRAY + "] Has been enabled!" );
        loadConfig();
    }

    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "BetterGameMode" + ChatColor.GRAY + "] Has been disabled!" );

    }
    public void loadConfig()    {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }





}
