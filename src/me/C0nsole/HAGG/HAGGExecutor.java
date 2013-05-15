package me.C0nsole.HAGG;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HAGGExecutor implements CommandExecutor {
	
	private main plugin;
	
	public HAGGExecutor(main plugin) {
		this.plugin = plugin;
		}
	
	@Override
	   public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String [] args){
		Player player = (Player) sender;
		if(commandlabel.equalsIgnoreCase("hagg")){
			if(player.hasPermission("hagg.user")){
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("join")){
						
					}
					else if(args[0].equalsIgnoreCase("leave")){
						
					}
					else if(args[0].equalsIgnoreCase("help")){
						
					}
					else if(args[0].equalsIgnoreCase("spec")){
						
					}
					else{
						player.sendMessage(ChatColor.RED + "Incorrect Syntax. Please do " + ChatColor.GREEN + "/hagg help");
					}
				}
			}
		}
		if(commandlabel.equalsIgnoreCase("haggadmin")){
			if(player.hasPermission("hagg.admin")){
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("createarena")){
						
					}
					else if(args[0].equalsIgnoreCase("delarena")){
						
					}
					else if(args[0].equalsIgnoreCase("setlobbyspawn")){
						
					}
					else if(args[0].equalsIgnoreCase("setplayerspawn")){
						
					}
					else if(args[0].equalsIgnoreCase("setgortumespawn")){
						
					}
					else if(args[0].equalsIgnoreCase("forcestart")){
						
					}
					else if(args[0].equalsIgnoreCase("forcestop")){
						
					}
				}
			}
		}
		return false;
	}
}

