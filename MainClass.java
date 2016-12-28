package llama.mobstatz.llama;

import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//Listeners
		new deathListener(this);
		new Commands(this);
		//Config stuffs
		this.getConfig().addDefault("Enable MobStatz", true);
		this.getConfig().addDefault("Enable Zombie Statz", true);
		this.getConfig().addDefault("Zombies.Zombie Kill Message", "&3You Killed A Zombie! Yay!");
		this.getConfig().addDefault("Zombies.Zombie Kill Broadcast", "<player> has killed a zombie!");
		this.getConfig().addDefault("Zombies.Zombie Kills", 0);
		this.getConfig().options().copyDefaults(true);
		this.saveDefaultConfig();
		//GETTING COMMANDS
		getCommand("mobkills").setExecutor(new Commands(this));
	}
	
	@Override
	public void onDisable() {
		
	}
}