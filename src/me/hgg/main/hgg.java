package me.hgg.main;

import me.hgg.cmds.haggadmin;


import org.bukkit.plugin.java.JavaPlugin;

public class hgg extends JavaPlugin{
	
	
	
	haggadmin haggadmin;
	hagg hagg;
    
	public void makeCnf(){
		 String pathx = "Lobby.X";
		 String pathy = "Lobby.Y";
		 String pathz = "Lobby.Z";
		getConfig().addDefault(pathx, 0);
	    getConfig().addDefault(pathy, 0);
		getConfig().addDefault(pathz, 0);
		getConfig().options().copyDefaults(true);    
		     saveConfig();
		
	}
	
	public void onEnable(){
		makeCnf();
		haggadmin = new haggadmin(this);
		this.getCommand("haggadmin").setExecutor(new haggadmin(this));
		this.getCommand("hagg").setExecutor(new hagg(this));
		reloadConfig();
	}

	
	public void onDisable(){
		
		// Save the Configs
	}
}
