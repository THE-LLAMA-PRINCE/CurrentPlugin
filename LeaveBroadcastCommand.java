package welcome.llama.welcome;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import net.md_5.bungee.api.ChatColor;

public class LeaveBroadcastCommand implements CommandExecutor, Listener {
	
	MainClass configGetter;
        public LeaveBroadcastCommand(MainClass plugin) {
                plugin.getServer().getPluginManager().registerEvents(this, plugin);
                configGetter = plugin;
        }

	@Override
	//Command LeaveBc
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {	
		if (cmd.getName().equalsIgnoreCase("swleavebc") && sender instanceof Player) {
		Player player = (Player) sender;
			if (player.hasPermission("serverwelcome.leavebccommand")) {
				String coloredLeaveBroadcast = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Player Leave Broadcast").replace("<player>", player.getName()));
				player.sendMessage(coloredLeaveBroadcast);
			}
			else {
				String ColoredDenyMessage = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Permission Denied Message").replace("<player>", player.getName()));
				player.sendMessage(ColoredDenyMessage);
			}
			return true;
		}
		return false;
	}
}