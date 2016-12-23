package welcome.llama.welcome;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import net.md_5.bungee.api.ChatColor;

public class JoinMessageCommand implements CommandExecutor, Listener {
	
	MainClass configGetter;
        public JoinMessageCommand(MainClass plugin) {
                plugin.getServer().getPluginManager().registerEvents(this, plugin);
                configGetter = plugin;
        }

	@Override
	//Command WelcomeMsg
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {	
		if (cmd.getName().equalsIgnoreCase("swjoinmsg") && sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("serverwelcome.joinmsgcommand")) {
				String coloredJoinMessage = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Player Join Message").replace("<player>", player.getName()));
				player.sendMessage(coloredJoinMessage);
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