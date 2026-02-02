package me.benjables.views;

import jdk.nashorn.internal.ir.Block;
import me.benjables.MenuAPI.Menu;
import me.benjables.MenuAPI.MenuHandler;
import me.benjables.MenuAPI.MenuItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MinesweeperGUI {

    public static Menu generateInventory(Player player) {
        Menu menu = new Menu(player, "Minesweeper", 54);
        MenuHandler.register(menu);
        for (int i = 0; i<54; i++) {
            menu.setItem(i, new MenuItem(new ItemStack(Material.STONE), (event -> {
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage("Test");
            })));
        }
        return menu;
    }

}
/*function1 = function2
if function exist then = entity
set entity to minesweeper
        play game
                mines = yes
flags cover mines= yes
fun= yes
        play*/