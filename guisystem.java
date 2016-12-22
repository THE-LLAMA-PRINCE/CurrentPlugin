package card.jitsu.llama;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.md_5.bungee.api.ChatColor;

public class guisystem implements CommandExecutor, Listener{
	
	public guisystem(MainClass plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@Override
	//Command WelcomeMsg
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {	
		if (cmd.getName().equalsIgnoreCase("cardjitsu") && sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage("&6A Card-Jitsu game has been opened");
			Inventory waiting = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Card-Jitsu waiting for players...");
			player.openInventory(waiting);
			
			ItemStack green1 = new ItemStack(Material.STAINED_GLASS_PANE);
			ItemMeta green1meta = green1.getItemMeta();
			green1meta.setDisplayName(ChatColor.GREEN + "");
			green1.setItemMeta(green1meta);
			
			waiting.setItem(0, green1);
			waiting.setItem(1, green1);
			waiting.setItem(2, green1);
			waiting.setItem(3, green1);
			waiting.setItem(4, green1);
			waiting.setItem(5, green1);
			waiting.setItem(6, green1);
			waiting.setItem(7, green1);
			waiting.setItem(8, green1);
			waiting.setItem(9, green1);
			waiting.setItem(10, green1);
			//1st player head
			
			//green
			waiting.setItem(12, green1);
			waiting.setItem(13, green1);
			waiting.setItem(14, green1);
			//2nd player head
			
			//green
			waiting.setItem(16, green1);
			waiting.setItem(17, green1);
			waiting.setItem(18, green1);
			waiting.setItem(19, green1);
			waiting.setItem(20, green1);
			waiting.setItem(21, green1);
			waiting.setItem(22, green1);
			waiting.setItem(23, green1);
			waiting.setItem(24, green1);
			waiting.setItem(25, green1);
			waiting.setItem(26, green1);
		}
		return true;
	}
}
