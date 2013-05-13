package me.C0nsole.HAGG;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    
	List<String> peopleingame = new ArrayList<String>();
    
    @Override
    public void onDisable() {
        System.out.println("[HAGG] v1.0 has been disabled.");
    }
 
    @Override
    public void onEnable() {
        System.out.println("[HAGG] v1.0 has been enabled.");
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new HAGGListener(this), this);
        getCommand("hagg").setExecutor(new HAGGExecutor(this));
        getCommand("haggadmin").setExecutor(new HAGGExecutor(this));
    }
 
    public List<String> getList() {
        return peopleingame;
    }

}
