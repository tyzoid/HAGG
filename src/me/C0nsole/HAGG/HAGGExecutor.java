package me.C0nsole.HAGG;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HAGGExecutor implements CommandExecutor {
	
	private main plugin;
	
	public HAGGExecutor(main plugin) {
		this.plugin = plugin;
		}
	
	@Override
	   public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String [] args){
		if(commandlabel.equalsIgnoreCase("hagg")){
			
		}
		if(commandlabel.equalsIgnoreCase("haggadmin")){
			
		}
		return false;
	}
}
