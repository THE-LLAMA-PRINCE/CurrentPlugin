package welcome.llama.welcome;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import welcome.llama.welcome.JoinBroadcastCommand;
import welcome.llama.welcome.JoinMessageCommand;
import welcome.llama.welcome.LeaveBroadcastCommand;
import welcome.llama.welcome.JoinListener;

public class MainClass extends JavaPlugin {
	
	//PERMISSIONS
	public Permission joinmsgcommand = new Permission("serverwelcome.joinmsgcommand");
	public Permission joinbccommand = new Permission("serverwelcome.joinbccommand");
	public Permission leavebccommand = new Permission("serverwelcome.leavebccommand");
	public Permission override = new Permission("serverwelcome.override");
	
	//ON PLUGIN ENABLE
	@Override
	public void onEnable() {
		//MAKES THE NEW LISTENER
		new JoinListener(this);
		new JoinPotionListener(this);
		new JoinMessageCommand(this);
		new JoinBroadcastCommand(this);
		new LeaveBroadcastCommand(this);
		//ADDS PERMISSIONS
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(joinmsgcommand);
		pm.addPermission(joinbccommand);
		pm.addPermission(leavebccommand);
		pm.addPermission(override);
		//WHAT THE CONSOLE SAYS WHEN YOU RUN THE PLUGIN
		getLogger().info("The plugin is up and running :D");
		//CONFIG FILE JUNK
		this.getConfig().addDefault("Server Welcome Version" , 1.0);
		this.getConfig().addDefault("Enable Server Welcome", true);
		this.getConfig().addDefault("Enable Player Join Message", true);
		this.getConfig().addDefault("Permission Denied Message", "&cYOU DO NOT HAVE PERMISSION TO USE THIS COMMAND!");
		this.getConfig().addDefault("Player Join Message", "&b<player>, Welcome! This is the default Join Message, change it!");
		this.getConfig().addDefault("Enable Player Join Broadcast", true);
		this.getConfig().addDefault("Player Join Broadcast", "&a<player>, Has joined! This is the default Join Broadcast, change it!");
		this.getConfig().addDefault("Enable Player Leave Broadcast", true);
		this.getConfig().addDefault("Player Leave Broadcast", "&6<player> Has left! This is the default Leave Broadcast, change it!");
		this.getConfig().addDefault("Absorption On Join", true);
		this.getConfig().addDefault("Absorption On Join.Strength", 10);
		this.getConfig().addDefault("Absorption On Join.Length", 1);
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		this.saveDefaultConfig();
		//GETTING COMMANDS FROM OTHER CLASSES
		getCommand("swjoinmsg").setExecutor(new JoinMessageCommand(this));
		getCommand("swjoinbc").setExecutor(new JoinBroadcastCommand(this));
		getCommand("swleavebc").setExecutor(new LeaveBroadcastCommand(this));
	}
	@Override
	public void onDisable() {
	}
}