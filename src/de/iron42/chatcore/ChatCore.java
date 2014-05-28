package de.iron42.chatcore;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class ChatCore extends JavaPlugin{
	
	
	public void onDisable() {
		System.out.println("[ChatCore] disabled");
	}
	public void onEnable() {
		System.out.println("[ChatCore] enabled");
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ChatEvent(), this);
	}

}
