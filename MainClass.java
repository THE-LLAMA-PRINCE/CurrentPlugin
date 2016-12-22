package card.jitsu.llama;

import org.bukkit.plugin.java.JavaPlugin;
import card.jitsu.llama.guisystem;

public class MainClass extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//CONSOLE LOGGER
		getLogger().info("Card-Jitsu Has Been Loaded Sucessfully!");
		//LISTENERS AND CLASSES
		new guisystem(this);
		//REGISTERING COMMANDS
		getCommand("CardJitsu").setExecutor(new guisystem(this));
	}
	
	@Override
	public void onDisable() {
		
	}

}
