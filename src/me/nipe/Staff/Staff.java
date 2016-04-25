package me.nipe.Staff;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Mads og Thomas on 25/04/2016.
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
            Player player = (Player) sender;
            player.sendMessage("Owner mmmaaddss\n" +
                    "Co-Owner thomasaagaard\n" +
                    "Head-Admin Avkiller\n" +
                    "Admin + Tekniker ItsSuperPlaysMC\n" +
                    "Admin + Bygger JuniorP1");
            return true;
        }
        return false;
    }
}
