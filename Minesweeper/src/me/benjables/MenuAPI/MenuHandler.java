package me.benjables.MenuAPI;

import org.bukkit.inventory.Inventory;

import java.util.HashMap;

public abstract class MenuHandler {

    public static HashMap<Inventory, Menu> logger = new HashMap<>();

    public static void register(Menu menu) {
        logger.put(menu.getInventory(), menu);
    }

    public static void unregister(Inventory inventory) {
        logger.remove(inventory);
    }

    public static Menu getMenu(Inventory inventory) {
        return logger.get(inventory);
    }

    public static boolean contains(Inventory inventory) { return logger.containsKey(inventory); }

}
