package me.benjables.Listeners;

import me.benjables.MenuAPI.Menu;
import me.benjables.MenuAPI.MenuHandler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public class InventoryListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inventory = event.getInventory();

        Menu menu = MenuHandler.getMenu(inventory);
        event.getWhoClicked().sendMessage(menu.getTitle());
        if (menu == null) return;
        menu.handleClick(event);
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        Inventory inventory = event.getInventory();
        if (MenuHandler.contains(inventory)) {
            MenuHandler.unregister(inventory);
        }
    }

}
