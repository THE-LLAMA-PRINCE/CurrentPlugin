package welcome.llama.welcome;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JoinPotionListener implements Listener{

//config getter stuff
MainClass configGetter;
	public JoinPotionListener(MainClass plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		configGetter = plugin;
	}
	//ABSORPTION EFFECT
	@EventHandler
	public void onPlayerPotionJoin(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Absorption On Join", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.absorption")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.ABSORPTION, (configGetter.getConfig().getInt("Absorption On Join.Strength")), (configGetter.getConfig().getInt("Absorption On Join.Length")))));
				}
			}
		}
	}
	//BLINDNESS EFFECT
	//CONFUSION EFFECT
	//DAMAGE_RESISTANCE EFFECT
	//FAST_DIGGING EFFECT
	//FIRE_RESISTANCE EFFECT
	//GLOWING EFFECT
	//HARM EFFECT
	//HEAL EFFECT
	//HEALTH_BOOST EFFECT
	//HUNGER EFFECT
	//INCREASE_DAMAGE EFFECT
	//INVISIBILITY
	//JUMP
	//LEVITATION
	//LUCK
	//NIGHT_VISION
	//POISON
	//REGENERATION
	//SATURATION
	//SLOW
	//SLOW_DIGGING
	//SPEED
	//UNLUCK
	//WATER_BREATHING
	//WEAKNESS
	//WITHER
}
