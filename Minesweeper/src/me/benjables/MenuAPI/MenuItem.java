package me.benjables.MenuAPI;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuItem {

    private ItemStack item;
    private InventoryHandler handler;

    public MenuItem(ItemStack i, InventoryHandler e) {
        this.item = i;
        this.handler = e;
    }

    public ItemStack getItem() {
        return item;
    }

    public void click(InventoryClickEvent event) {
        if (handler != null) {
            handler.onClick(event);
        }
    }

}
