package me.twovb.smpcore;

import lombok.Getter;
import me.twovb.smpcore.commands.TestCommand;
import me.twovb.smpcore.listeners.TestEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SMPCore extends JavaPlugin {

    @Getter
    private static SMPCore instance;

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        registerCommands();
        registerEvents();
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new TestEvent(), this);
    }

    private void registerCommands() {
        getCommand("test").setExecutor(new TestCommand());
        getCommand("test").setTabCompleter(new TestCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
