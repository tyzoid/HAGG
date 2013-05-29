package me.hgg.cmds;

import me.hgg.main.hgg;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class haggadmin implements CommandExecutor{

	
	
	public hgg plugin;
	public haggadmin(hgg instance) {
		this.plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String commandLabel,
			String[] args) {
		
		
		
		Player p = (Player) cs;
		if(args.length == 0){
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "createarena <name>");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "delarena <arena>");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "setlobby");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "setplayerspawn <arena>");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "setgortumespawn <arena>");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "start [arena]");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "stop [arena]");
			
			
			
		}
		
			
			
			// UNNCECESARRY
			/*p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "createarena <name>");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "createarena <name>");
			p.sendMessage(ChatColor.RED+"/haggadmin " + ChatColor.GOLD+ "createarena <name>");
			*/
		
		
		
		if(args.length > 0){
			if(args[0].equalsIgnoreCase("setlobby")){
				 p.sendMessage("DebugMsgSetLoBBY");
			 
			
				
					Location loc = p.getLocation();
					int x = loc.getBlockX();
					int y = loc.getBlockY();
					int z = loc.getBlockZ();
							
					
					plugin.getConfig().set("Lobby.X", x); // Nul Pointer exeption
					plugin.getConfig().set("Lobby.Y", y);
					plugin.getConfig().set("Lobby.Z", z);
					plugin.getConfig().set("Lobby" + ".World", p.getLocation().getWorld());
					
					plugin.saveConfig();
			 }
		}
		
		
		
		
		
		return true;
	}

}
/*

[5:54:46 AM] Gary S  ||  C0nsole: haggadmin createarena <arena>
[5:54:53 AM] Gary S  ||  C0nsole: haggadmin delarena <arena>
[5:54:59 AM] Gary S  ||  C0nsole: haggadmin setlobby
[5:55:07 AM] Gary S  ||  C0nsole: haggadmin setplayerspawn <arena>
[5:55:18 AM] Gary S  ||  C0nsole: haggadmin setgortumespawn <arena>
[5:55:25 AM] Gary S  ||  C0nsole: haggadmin start [arena]
[5:55:31 AM] Gary S  ||  C0nsole: haggadmin stop [arena]
[5:55:36 AM] Gary S  ||  C0nsole: [] = optional
[5:55:41 AM] Gary S  ||  C0nsole: <>=required
*/