package me.twovb.plugintemplate;

import lombok.Getter;
import me.twovb.plugintemplate.commands.TestCommand;
import me.twovb.plugintemplate.listeners.TestEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTemplate extends JavaPlugin {

    @Getter
    private static PluginTemplate instance;

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
