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
	public void onPlayerPotionJoinAbsorption(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Absorption On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.absorption")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.ABSORPTION, configGetter.getConfig().getInt("Absorption On Join.Strength"), configGetter.getConfig().getInt("Absorption On Join.Length"))));
				}
			}
		}
	}
	//BLINDNESS EFFECT
	@EventHandler
	public void onPlayerPotionJoinBlindness(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Blindness On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.blindness")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.BLINDNESS, (configGetter.getConfig().getInt("Blindness On Join.Strength")), (configGetter.getConfig().getInt("Blindness On Join.Length")))));
				}
			}
		}
	}
	//CONFUSION EFFECT
	@EventHandler
	public void onPlayerPotionJoinConfusion(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Confusion On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.confusion")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.CONFUSION, (configGetter.getConfig().getInt("Confusion On Join.Strength")), (configGetter.getConfig().getInt("Confusion On Join.Length")))));
				}
			}
		}
	}
	//DAMAGE_RESISTANCE EFFECT
	@EventHandler
	public void onPlayerPotionJoinDamageResistance(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Damage Resistance On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.damageresistance")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, (configGetter.getConfig().getInt("Damage Resistance On Join.Strength")), (configGetter.getConfig().getInt("Damage Resistance On Join.Length")))));
				}
			}
		}
	}
	//FAST_DIGGING EFFECT
	@EventHandler
	public void onPlayerPotionJoinFastDigging(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Fast Digging On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.fastdigging")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.FAST_DIGGING, (configGetter.getConfig().getInt("Fast Digging On Join.Strength")), (configGetter.getConfig().getInt("Fast Digging On Join.Length")))));
				}
			}
		}
	}
	//FIRE_RESISTANCE EFFECT
	@EventHandler
	public void onPlayerPotionJoinFireResistance(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Fire Resistance On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.fireresistance")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.FIRE_RESISTANCE, (configGetter.getConfig().getInt("Fire Resistance On Join.Strength")), (configGetter.getConfig().getInt("Fire Resistance On Join.Length")))));
				}
			}
		}
	}
	//GLOWING EFFECT
	@EventHandler
	public void onPlayerPotionJoinGlowing(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Glowing On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.glowing")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.GLOWING, (configGetter.getConfig().getInt("Glowing On Join.Strength")), (configGetter.getConfig().getInt("Glowing On Join.Length")))));
				}
			}
		}
	}
	//HARM EFFECT
	@EventHandler
	public void onPlayerPotionJoinHarm(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Harm On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.harm")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.HARM, (configGetter.getConfig().getInt("Harm On Join.Strength")), (configGetter.getConfig().getInt("Harm On Join.Length")))));
				}
			}
		}
	}
	//HEAL EFFECT
	@EventHandler
	public void onPlayerPotionJoinHeal(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Heal On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.heal")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.HEAL, (configGetter.getConfig().getInt("Heal On Join.Strength")), (configGetter.getConfig().getInt("Heal On Join.Length")))));
				}
			}
		}
	}
	//HEALTH_BOOST EFFECT
	@EventHandler
	public void onPlayerPotionJoinHealthBoost(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Health Boost On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.healthboost")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.HEALTH_BOOST, (configGetter.getConfig().getInt("Health Boost On Join.Strength")), (configGetter.getConfig().getInt("Health Boost On Join.Length")))));
				}
			}
		}
	}
	//HUNGER EFFECT
	@EventHandler
	public void onPlayerPotionJoinHunger(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Hunger On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.hunger")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.HUNGER, (configGetter.getConfig().getInt("Hunger On Join.Strength")), (configGetter.getConfig().getInt("Hunger On Join.Length")))));
				}
			}
		}
	}
	//INCREASE_DAMAGE EFFECT
	@EventHandler
	public void onPlayerPotionJoinIncreaseDamage(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Increase Damage On Join.Enable", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.increasedamage")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.INCREASE_DAMAGE, (configGetter.getConfig().getInt("Increase Damage On Join.Strength")), (configGetter.getConfig().getInt("Increase Damage On Join.Length")))));
				}
			}
		}
	}
	//INVISIBILITY
	@EventHandler
	public void onPlayerPotionJoinInvisibility(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Invisibility On Join.Enable", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.invisibility")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.INVISIBILITY, (configGetter.getConfig().getInt("Invisibility On Join.Strength")), (configGetter.getConfig().getInt("Invisibility On Join.Length")))));
				}
			}
		}
	}
	//JUMP
	@EventHandler
	public void onPlayerPotionJoinJump(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Jump Effect On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.jump")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.JUMP, (configGetter.getConfig().getInt("Jump Enable On Join.Strength")), (configGetter.getConfig().getInt("Jump Enable On Join.Length")))));
				}
			}
		}
	}
	//LEVITATION
	@EventHandler
	public void onPlayerPotionJoinLevitation(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Levitation On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.levitation")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.LEVITATION, (configGetter.getConfig().getInt("Levitation On Join.Strength")), (configGetter.getConfig().getInt("Leviation On Join.Length")))));
				}
			}
		}
	}
	//LUCK
	@EventHandler
	public void onPlayerPotionJoinLuck(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Luck On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.luck")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.LUCK, (configGetter.getConfig().getInt("Luck On Join.Strength")), (configGetter.getConfig().getInt("Luck On Join.Length")))));
				}
			}
		}
	}
	//NIGHT_VISION
	@EventHandler
	public void onPlayerPotionJoinNightVision(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Night Vision On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.nightvision")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.NIGHT_VISION, (configGetter.getConfig().getInt("Night Vision On Join.Strength")), (configGetter.getConfig().getInt("Night Vision On Join.Length")))));
				}
			}
		}
	}
	//POISON
	@EventHandler
	public void onPlayerPotionJoinPoison(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Poison On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.poison")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.POISON, (configGetter.getConfig().getInt("Poison On Join.Strength")), (configGetter.getConfig().getInt("Poison On Join.Length")))));
				}
			}
		}
	}
	//REGENERATION
	@EventHandler
	public void onPlayerPotionJoinRegeneration(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Regeneration On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.regeneration")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.REGENERATION, (configGetter.getConfig().getInt("Regeneration On Join.Strength")), (configGetter.getConfig().getInt("Regeneration On Join.Length")))));
				}
			}
		}
	}
	//SATURATION
	@EventHandler
	public void onPlayerPotionJoinSaturation(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Saturation On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.saturation")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.SATURATION, (configGetter.getConfig().getInt("Saturation On Join.Strength")), (configGetter.getConfig().getInt("Saturation On Join.Length")))));
				}
			}
		}
	}
	//SLOW
	@EventHandler
	public void onPlayerPotionJoinSlow(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Slow On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.slow")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.SLOW, (configGetter.getConfig().getInt("Slow On Join.Strength")), (configGetter.getConfig().getInt("Slow On Join.Length")))));
				}
			}
		}
	}
	//SLOW_DIGGING
	@EventHandler
	public void onPlayerPotionJoinSlowDigging(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Slow Digging On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.slowdigging")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.SLOW_DIGGING, (configGetter.getConfig().getInt("Slow Digging On Join.Strength")), (configGetter.getConfig().getInt("Slow Digging On Join.Length")))));
				}
			}
		}
	}
	//SPEED
	@EventHandler
	public void onPlayerPotionJoinSpeed(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Speed On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.speed")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.SPEED, (configGetter.getConfig().getInt("Speed On Join.Strength")), (configGetter.getConfig().getInt("Speed On Join.Length")))));
				}
			}
		}
	}
	//UNLUCK
	@EventHandler
	public void onPlayerPotionJoinUnLuck(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("UnLuck On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.unluck")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.UNLUCK, (configGetter.getConfig().getInt("UnLuck On Join.Strength")), (configGetter.getConfig().getInt("UnLuck On Join.Length")))));
				}
			}
		}
	}
	//WATER_BREATHING
	@EventHandler
	public void onPlayerPotionJoinWaterBreathing(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Water Breathing On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.waterbreathing")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.WATER_BREATHING, (configGetter.getConfig().getInt("Water Breathing On Join.Strength")), (configGetter.getConfig().getInt("Water Breathing On Join.Length")))));
				}
			}
		}
	}
	//WEAKNESS
	@EventHandler
	public void onPlayerPotionJoinWeakness(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Weakness On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.weakness")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.WEAKNESS, (configGetter.getConfig().getInt("Weakness On Join.Strength")), (configGetter.getConfig().getInt("Weakness On Join.Length")))));
				}
			}
		}
	}
	//WITHER
	@EventHandler
	public void onPlayerPotionJoinWither(PlayerJoinEvent e) {
		if (configGetter.getConfig().getBoolean("Wither On Join.Enabled", true)) {
			Player player = e.getPlayer();
			if (player.hasPermission("serverwelcome.wither")) {
				if (!player.hasPermission("serverwelcome.override")) {
					player.addPotionEffect((new PotionEffect(PotionEffectType.WITHER, (configGetter.getConfig().getInt("Wither On Join.Strength")), (configGetter.getConfig().getInt("Wither On Join.Length")))));
				}
			}
		}
	}
}
