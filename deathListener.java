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
					int zombiekillcount = configGetter.getConfig().getInt("Zombie Kills");
					configGetter.getConfig().set("Zombie Kills", zombiekillcount + 1);
					//sending the kill messages and broadcasts
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Zombie Kill Message").replace("<player>", killer.getName())));
					Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Zombie Kill Broadcast").replace("<player>", killer.getName())));
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
					int zombiekillcount = configGetter.getConfig().getInt("Zombie Kills");
					configGetter.getConfig().set("Zombie Kills", zombiekillcount + 1);
					//sending the kill messages and broadcasts
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Zombie Kill Message").replace("<player>", killer.getName())));
					Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', configGetter.getConfig().getString("Zombie Kill Broadcast").replace("<player>", killer.getName())));
				}
			}
		}
	}
}