package me.benjables.modules;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import me.benjables.views.MinesweeperGUI;

public class MinesweeperCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            Inventory inv = MinesweeperGUI.generateInventory(player).getInventory();
            player.openInventory(inv);
            player.sendMessage(ChatColor.GREEN + "Minesweeper Opened");
        }
        return true;
    }
}
