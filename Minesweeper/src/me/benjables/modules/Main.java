package me.benjables.modules;

import me.benjables.Listeners.InventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static void main(String[] args) {

    }

    @Override
    public void onEnable() {
        System.out.println("Minesweeper is enabled");
        getCommand("minesweeper").setExecutor(new MinesweeperCommand());
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Minesweeper is disabled");
    }
}