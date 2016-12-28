package llama.mobstatz.llama;

import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import net.md_5.bungee.api.ChatColor;

public class deathListener implements Listener {
	
	MainClass configGetter;
	public deathListener(MainClass plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		configGetter = plugin;
	}
	@EventHandler
	public void onZombieDeath(EntityDeathEvent e) {
		Entity deadEntity = e.getEntity();
		Entity killer = e.getEntity().getKiller();
		//(if killer is a player)
		if (configGetter.getConfig().getBoolean("Enable MobStatz", true)) {
			if (configGetter.getConfig().getBoolean("Zombies.Enabled", true)) {
				if (killer instanceof Player && deadEntity instanceof Zombie){
					Player player = (Player) killer;
					//adding ONE death to the kill count
					int zombiekillcount = configGetter.getConfig().getInt("Zombies.Zombie Kills");
					configGetter.getConfig().set("Zombies.Zombie Kills", zombiekillcount + 1);
					//sending the kill messages and broadcasts
					String Message = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Zombies.Zombie Kill Message").replace("<player>", player.getName()));
					String Broadcast = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Zombies.Zombie Kill Broadcast").replace("<player>", player.getName()));
					player.sendMessage(Message);
					Bukkit.broadcastMessage(Broadcast);
					if (configGetter.getConfig().getBoolean("Zombies.Command on Kill", true)) {
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), configGetter.getConfig().getString("Zombies.Command").replace("<player>", player.getName()));
					}
				}
			}
		}
	}
	@EventHandler
	public void onCreeperDeath(EntityDeathEvent e) {
		Entity deadEntity = e.getEntity();
		Entity killer = e.getEntity().getKiller();
		//(if killer is a player)
		if (configGetter.getConfig().getBoolean("Enable MobStatz", true)) {
			if (configGetter.getConfig().getBoolean("Creeper.Enabled", true)) {
				if (killer instanceof Player && deadEntity instanceof Creeper){
					Player player = (Player) killer;
					//adding ONE death to the kill count
					int creeperkillcount = configGetter.getConfig().getInt("Creeper.Creeper Kills");
					configGetter.getConfig().set("Creeper.Creeper Kills", creeperkillcount + 1);
					//sending the kill messages and broadcasts
					String Message = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Creeper.Creeper Kill Message").replace("<player>", player.getName()));
					String Broadcast = ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Creeper.Creeper Kill Broadcast").replace("<player>", player.getName()));
					player.sendMessage(Message);
					Bukkit.broadcastMessage(Broadcast);
				}
			}
		}
	}
}