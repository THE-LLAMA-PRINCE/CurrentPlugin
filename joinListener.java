package llama.mobstatz.llama;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinListener implements Listener{
	
	MainClass mclass;
	public joinListener(MainClass plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		mclass = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		File yml = new File("plugins/MobStatz/Players/" + player.getUniqueId() + ".yml");
		if (!yml.exists()) {
            try {
            	yml.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            mclass.getLogger().info(player.getName() + " Joined for the first time - generating MobStatz YML file");
			YamlConfiguration f = YamlConfiguration.loadConfiguration(yml);
			f.set("zombie kills", 0);
			f.set("creeper kills", 0);
			f.set("skeleton kills", 0);
			f.set("spider kills", 0);
			f.set("blaze kills", 0);
			f.set("slime kills", 0);
			f.set("cave_spider kills", 0);
			f.set("elder_guardian kills", 0);
			f.set("ender_dragon kills", 0);
			f.set("enderman kills", 0);
			f.set("endermite kills", 0);
			f.set("giant kills", 0);
			f.set("guardian kills", 0);
			f.set("husk kills", 0);
			f.set("magma_cube kills", 0);
			f.set("zombie_pigman kills", 0);
			f.set("polar_bear kills", 0);
			f.set("shulker kills", 0);
			f.set("silverfish kills", 0);
			f.set("witch kills", 0);
			f.set("wither kills", 0);
			f.set("wither_skeleton kills", 0);
			f.set("zombie_villager kills", 0);
			f.set("bat kills", 0);
			f.set("chicken kills", 0);
			f.set("cow kills", 0);
			f.set("donkey kills", 0);
			f.set("horse kills", 0);
			f.set("iron_golem kills", 0);
			f.set("llama kills", 0);
			f.set("mule kills", 0);
			f.set("mooshroom kills", 0);
			f.set("ocelot kills", 0);
			f.set("pig kills", 0);
			f.set("player kills", 0);
			f.set("rabbit kills", 0);
			f.set("sheep kills", 0);
			f.set("snowman kills", 0);
			f.set("stray kills", 0);
			f.set("vex kills", 0);
			f.set("villager kills", 0);
			f.set("vindicator kills", 0);
			f.set("wolf kills", 0);
	        try {
	            f.save(yml);
	        } catch (IOException e2) {
	            e2.printStackTrace();
	        }
		}
	}   
}