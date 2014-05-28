package de.iron42.chatcore;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener{
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if (e.getPlayer().hasPermission("chat.color")) {
			e.setMessage(ChatColor.translateAlternateColorCodes('&', e.getMessage()));
			e.getPlayer().setDisplayName("§4" + e.getPlayer().getName());
			e.setFormat("%1$s§7» §f%2$s");
		} else if (e.getPlayer().hasPermission("chat.player")) {
			e.getPlayer().setDisplayName("§a" + e.getPlayer().getName());
			e.setFormat("%1$s§7» §f%2$s");
		} else if (e.getPlayer().hasPermission("chat.yt")) {
			e.getPlayer().setDisplayName("§5" + e.getPlayer().getName());
			e.setFormat("%1$s§7» §f%2$s");
		} else if (e.getPlayer().hasPermission("chat.premium")) {
			e.getPlayer().setDisplayName("§6" + e.getPlayer().getName());
			e.setFormat("%1$s§7» §f%2$s");
		}
	}
}
