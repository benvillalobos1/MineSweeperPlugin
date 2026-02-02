package me.benjables.MenuAPI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

    private Inventory inventory;
    private Player player;
    private String title;
    private int size;
    private HashMap<Integer, MenuItem> items;

    public Menu(Player p, String t, int s) {
        this.player = p;
        this.title = t;
        this.size = s;
        this.items = new HashMap<>();
        inventory = Bukkit.createInventory(player, size, title);
    }

    public void setItem(int slot, MenuItem item) {
        items.put(slot, item);
        inventory.setItem(slot, item.getItem());
    }

    public void handleClick(InventoryClickEvent event) {
        int slot = event.getRawSlot();

        if (items.containsKey(slot)) {
            event.setCancelled(true);
            items.get(slot).click(event);
        }
    }

    public Player getPlayer() { return this.player; }
    public String getTitle() { return this.title; }
    public int getSize() { return this.size; }
    public Inventory getInventory() { return this.inventory; }

}
