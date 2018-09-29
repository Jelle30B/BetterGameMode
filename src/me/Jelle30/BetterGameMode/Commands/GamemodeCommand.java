package me.Jelle30.BetterGameMode.Commands;

import me.Jelle30.BetterGameMode.GM;
import me.Jelle30.BetterGameMode.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class GamemodeCommand implements CommandExecutor {

    private Plugin plugin = Main.getPlugin(Main.class);
    private int count;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {


        //TODO: If player does /gamemode return a helper.

        Player p = (Player) commandSender;
            if(command.getName().equalsIgnoreCase("gamemode"))  {
                if(args.length == 1)    {

                            // CREATIVE

                    if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("c") || args[0].equalsIgnoreCase("creative"))   {
                            GM.changeGamemode(GM.CREATIVE, p);
                            return true;

                            // ADVENTURE

                    } else if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("adventure"))   {
                            GM.changeGamemode(GM.ADVENTURE, p);
                            return true;

                            // SPECTATOR

                    } else if(args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spec") || args[0].equalsIgnoreCase("spectator"))   {
                            GM.changeGamemode(GM.SPECTATOR, p);
                            return true;

                            // SURVIVAL

                    } else if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("s") || args[0].equalsIgnoreCase("survival"))   {
                            GM.changeGamemode(GM.SURVIVAL, p);
                            return true;
                    }
                } else  {
                    p.sendMessage(plugin.getConfig().getString("GamemodeUsage").replaceAll("&" , "§").replaceAll("§§", "&").replaceAll("%player%", p.getName()));
                }
            }
            return true;
        }
    }
