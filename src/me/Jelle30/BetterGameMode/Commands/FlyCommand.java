package me.Jelle30.BetterGameMode.Commands;

import me.Jelle30.BetterGameMode.GM;
import me.Jelle30.BetterGameMode.Main;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FlyCommand implements CommandExecutor {
    private Plugin plugin = Main.getPlugin(Main.class);
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        Player player = (Player) commandSender;

        // FLY COMMAND

        if (commandSender instanceof Player) {
            if(player.getGameMode() == GameMode.SPECTATOR && plugin.getConfig().getBoolean("ToggleFlightinSpectator") == false)  {
                player.sendMessage(plugin.getConfig().getString("NotAllowedToggleFlight").replaceAll("&", "§").replaceAll("§§", "&").replaceAll("%player%", player.getName()));
            } else {
                GM.changeGamemode(GM.FLY, player);
            }
        }
        return false;
    }
}
