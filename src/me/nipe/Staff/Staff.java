package me.nipe.Staff;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

/**
 * Created by Mads og Thomas on 26/04/2016.
 */
public class Staff extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Staff plugin has been enabled");

    }

    @Override
    public void onDisable() {
        getLogger().info("Staff plugin has been disabled");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String comandLabel, String [] args) {
        if (cmd.getName().equalsIgnoreCase("staff") && sender instanceof Player) {

            Player currentPlayer = ((Player) sender);
            currentPlayer.sendMessage("Online players:\n");

            Collection<? extends Player> onlinePlayers = sender.getServer().getOnlinePlayers();
            for (Player onlinePlayer : onlinePlayers) {
                currentPlayer.sendMessage(onlinePlayer.getName()+" "+onlinePlayer.getDisplayName()+" "+onlinePlayer.getType().name());
            }
            return true;
        }
        return false;
    }
}
