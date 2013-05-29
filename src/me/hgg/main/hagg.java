
package me.hgg.main;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hagg implements CommandExecutor {
	
	public hgg plugin;
	public hagg(hgg instance) {
		this.plugin = instance;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String commandLabel,
			String[] args) {
		
		Player p = (Player) cs;	
		
		double lobx = plugin.getConfig().getInt("Lobby.X");
		double loby = plugin.getConfig().getInt("Lobby.Y");

		double lobz = plugin.getConfig().getInt("Lobby.Z");
		
		World myworld = p.getWorld();
		
		if(args.length == 0){
			// Command here 
		}
		if(args.length > 0){
			
			if(args[0].equalsIgnoreCase("lobby")){
			 Location spawnlb = new Location(myworld, lobx, loby, lobz);
			p.teleport(spawnlb);
			p.sendMessage(ChatColor.GOLD+"[HAGG]You have been teleported to the lobby");
				
				
			}
		}
		
		return false;
	}

}
