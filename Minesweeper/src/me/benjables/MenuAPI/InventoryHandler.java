package me.benjables.MenuAPI;

import org.bukkit.event.inventory.InventoryClickEvent;

@FunctionalInterface
public interface InventoryHandler {

    void onClick(InventoryClickEvent event);

}
