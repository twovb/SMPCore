package me.twovb.plugintemplate.listeners;

import me.twovb.plugintemplate.utils.CC;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class TestEvent implements Listener {
    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(CC.translate("&a&lHello &b&l" + player.getName()));
    }
}
