package llama.mobstatz.llama;

import java.io.File;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor, Listener {
	
	MainClass configGetter;
	public Commands(MainClass plugin) {
		plugin.getServer().getPluginManager().registerEvents((Listener) this, plugin);
		configGetter = plugin;
	}
		
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
    	if (cmd.getName().equalsIgnoreCase("mobkills") && sender instanceof Player) {
    		if(args.length == 0)
            {
    			Player player = (Player) sender;
    			File uuidfile = new File(configGetter.getDataFolder() + "/MobStatz/Players/"+player.getUniqueId() +".yml");
    			YamlConfiguration f = YamlConfiguration.loadConfiguration(uuidfile);
				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] your mob kills Page 1 ===============");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("zombie kills") + ChatColor.GREEN + " Zombies " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("skeleton kills") + ChatColor.GREEN + " Skeletons " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("creeper kills") + ChatColor.GREEN + " Creepers " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("spider kills") + ChatColor.GREEN + " Spiders " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("blaze kills") + ChatColor.GREEN + " Blazes " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("slime kills") + ChatColor.GREEN + " Slimes " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("cave_spider kills") + ChatColor.GREEN + " Cave Spiders " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("elder_guardian kills") + ChatColor.GREEN + " Elder Guardians " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("ender_dragon kills") + ChatColor.GREEN + " Ender Dragons" + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage("" + ChatColor.GOLD + f.getInt("endermen kills") + ChatColor.GREEN + " Endermen " + ChatColor.GOLD + "have been killed by you!");
				player.sendMessage(ChatColor.GOLD + "============== Do \"/mobkills 2\" for the next page ==============");
            }
            else if(args.length == 1)
            {
            	Player player = (Player) sender;
            	File uuidfile = new File(configGetter.getDataFolder() + "/MobStatz/Players/"+player.getUniqueId()+".yml");
    			YamlConfiguration f = YamlConfiguration.loadConfiguration(uuidfile);
                if(args[0].equalsIgnoreCase("1")) { //for /mobkills 1 = /mobkills
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] your mob kills Page 1 ===============");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("zombie kills") + ChatColor.GREEN + " Zombies " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("skeleton kills") + ChatColor.GREEN + " Skeletons " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("creeper kills") + ChatColor.GREEN + " Creepers " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("spider kills") + ChatColor.GREEN + " Spiders " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("blaze kills") + ChatColor.GREEN + " Blazes " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("slime kills") + ChatColor.GREEN + " Slimes " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("cave_spider kills") + ChatColor.GREEN + " Cave Spiders " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("elder_guardian kills") + ChatColor.GREEN + " Elder Guardians " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("ender_dragon kills") + ChatColor.GREEN + " Ender Dragon s" + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("enderman kills") + ChatColor.GREEN + " Endermen " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage(ChatColor.GOLD + "============== Do \"/mobkills 2\" for the next page ==============");
                }
                else if(args[0].equalsIgnoreCase("2")) { // for /MobKills 2
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] your mob kills Page 2 ===============");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("endermite kills") + ChatColor.GREEN + " Endermites " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("giant kills") + ChatColor.GREEN + " Giants " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("guardian kills") + ChatColor.GREEN + " Guardians " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("husk kills") + ChatColor.GREEN + " Husks " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("magma_cube kills") + ChatColor.GREEN + " Magma Cubes " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("zombie_pigman kills") + ChatColor.GREEN + " Zombie Pigmen " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("polar_bear kills") + ChatColor.GREEN + " Polar Bears " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("shulker kills") + ChatColor.GREEN + " Shulkers " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("silverfish kills") + ChatColor.GREEN + " Silverfish " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("witche kills") + ChatColor.GREEN + " Witches " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage(ChatColor.GOLD + "============== Do \"/mobkills 3\" for the next page ==============");
                }
                else if(args[0].equalsIgnoreCase("3")) { // for /MobKills 3
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] your mob kills Page 3 ===============");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("wither kills") + ChatColor.GREEN + " Withers " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("wither_skeleton kills") + ChatColor.GREEN + " Wither Skeletons " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("zombie_villager kills") + ChatColor.GREEN + " Zombie Villagers " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("bat kills") + ChatColor.GREEN + " Bats " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("chicken kills") + ChatColor.GREEN + " Chickens " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("cow kills") + ChatColor.GREEN + " Cows " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("donkey kills") + ChatColor.GREEN + " Donkies " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("horse kills") + ChatColor.GREEN + " Horses " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("iron_golem kills") + ChatColor.GREEN + " Iron Golems " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("llama kills") + ChatColor.GREEN + " Llamas " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage(ChatColor.GOLD + "============== Do \"/mobkills 4\" for the next page =============="); 
                }
                else if(args[0].equalsIgnoreCase("4")) { // for /MobKills 4
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] your mob kills Page 4 ===============");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("mule kills") + ChatColor.GREEN + " Mules " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("mooshroom kills") + ChatColor.GREEN + " Mooshrooms " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("ocelot kills") + ChatColor.GREEN + " Ocelots " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("pig kills") + ChatColor.GREEN + " Pigs " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("player kills") + ChatColor.GREEN + " Players " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("rabbit kills") + ChatColor.GREEN + " Rabbits " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("sheep kills") + ChatColor.GREEN + " Sheep " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("snowmen kills") + ChatColor.GREEN + " Snowmen " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("stray kills") + ChatColor.GREEN + " Strays " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("vex kills") + ChatColor.GREEN + " Vexs " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage(ChatColor.GOLD + "============== Do \"/mobkills 5\" for the next page ==============");
                }
                else if(args[0].equalsIgnoreCase("5")) { //for /mobkills 5
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] your mob kills Page 4 ===============");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("villager kills") + ChatColor.GREEN + " Villagers " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("vindicator kills") + ChatColor.GREEN + " Vindicators " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + f.getInt("wolf kills") + ChatColor.GREEN + " Wolfs " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage(ChatColor.GOLD + "========================= Last Page :) =========================");
                }
                return true;
            }
        }
    	if (cmd.getName().equalsIgnoreCase("globalmobkills") && sender instanceof Player) {
        	if(args.length == 0)
            {
        		Player player = (Player) sender;
				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] total mob kills Page 1 ===============");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Zombies.Zombie Kills") + ChatColor.GREEN + " Zombies " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Skeleton.Skeleton Kills") + ChatColor.GREEN + " Skeletons " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Creeper.Creeper Kills") + ChatColor.GREEN + " Creepers " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Spider.Spider Kills") + ChatColor.GREEN + " Spiders " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Blaze.Blaze Kills") + ChatColor.GREEN + " Blazes " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Slime.Slime Kills") + ChatColor.GREEN + " Slimes " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Cave_Spider.Cave_Spider Kills") + ChatColor.GREEN + " Cave Spiders " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Elder_Guardian.Elder_Guardian Kills") + ChatColor.GREEN + " Elder Guardians " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Ender_Dragon.Ender_Dragon Kills") + ChatColor.GREEN + " Ender Dragons" + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Enderman.Enderman Kills") + ChatColor.GREEN + " Endermen " + ChatColor.GOLD + "have been killed by everyone!");
				player.sendMessage(ChatColor.GOLD + "============== Do \"/mobkills 2\" for the next page ==============");
            }
            else if(args.length == 1)
            {
            	Player player = (Player) sender;
                if(args[0].equalsIgnoreCase("1")) { //for /mobkills 1 = /mobkills
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] total mob kills Page 1 ===============");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Zombies.Zombie Kills") + ChatColor.GREEN + " Zombies " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Skeleton.Skeleton Kills") + ChatColor.GREEN + " Skeletons " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Creeper.Creeper Kills") + ChatColor.GREEN + " Creepers " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Spider.Spider Kills") + ChatColor.GREEN + " Spiders " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Blaze.Blaze Kills") + ChatColor.GREEN + " Blazes " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Slime.Slime Kills") + ChatColor.GREEN + " Slimes " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Cave_Spider.Cave_Spider Kills") + ChatColor.GREEN + " Cave Spiders " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Elder_Guardian.Elder_Guardian Kills") + ChatColor.GREEN + " Elder Guardians " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Ender_Dragon.Ender_Dragon Kills") + ChatColor.GREEN + " Ender Dragon s" + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Enderman.Enderman Kills") + ChatColor.GREEN + " Endermen " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage(ChatColor.GOLD + "=============== Do \"/mobkills 2\" for the next page ==============");
                }
                else if(args[0].equalsIgnoreCase("2")) { // for /MobKills 2
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] total mob kills Page 2 ===============");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Endermite.Endermite Kills") + ChatColor.GREEN + " Endermites " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Giant.Giant Kills") + ChatColor.GREEN + " Giants " + ChatColor.GOLD + "have been killed by you!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Guardian.Guardian Kills") + ChatColor.GREEN + " Guardians " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Husk.Husk Kills") + ChatColor.GREEN + " Husks " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Magma_Cube.Magma_Cube Kills") + ChatColor.GREEN + " Magma Cubes " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Zombie_Pigman.Zombie_Pigman Kills") + ChatColor.GREEN + " Zombie Pigmen " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Polar_Bear.Polar_Bear Kills") + ChatColor.GREEN + " Polar Bears " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Shulker.Shulker Kills") + ChatColor.GREEN + " Shulkers " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Silverfish.Silverfish Kills") + ChatColor.GREEN + " Silverfish " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Witch.Witch Kills") + ChatColor.GREEN + " Witches " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage(ChatColor.GOLD + "=============== Do \"/mobkills 3\" for the next page ==============");
                }
                else if(args[0].equalsIgnoreCase("3")) { // for /MobKills 3
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] total mob kills Page 3 ===============");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Wither.Wither Kills") + ChatColor.GREEN + " Withers " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Wither_Skeleton.Wither_Skeleton Kills") + ChatColor.GREEN + " Wither Skeletons " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Zombie_Villager.Zombie_Villager Kills") + ChatColor.GREEN + " Zombie Villagers " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Bat.Bat Kills") + ChatColor.GREEN + " Bats " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Chicken.Chicken Kills") + ChatColor.GREEN + " Chickens " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Cow.Cow Kills") + ChatColor.GREEN + " Cows " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Donkey.Donkey Kills") + ChatColor.GREEN + " Donkies " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Horse.Horse Kills") + ChatColor.GREEN + " Horses " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Iron_Golem.Iron_Golem Kills") + ChatColor.GREEN + " Iron Golems " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Llama.Llama Kills") + ChatColor.GREEN + " Llamas " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage(ChatColor.GOLD + "=============== Do \"/mobkills 4\" for the next page =============="); 
                }
                else if(args[0].equalsIgnoreCase("4")) { // for /MobKills 4
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] total mob kills Page 4 ===============");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Mule.Mule Kills") + ChatColor.GREEN + " Mules " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Mooshroom.Mooshroom Kills") + ChatColor.GREEN + " Mooshrooms " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Ocelot.Ocelot Kills") + ChatColor.GREEN + " Ocelots " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Pig.Pig Kills") + ChatColor.GREEN + " Pigs " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Player.Player Kills") + ChatColor.GREEN + " Players " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Rabbit.Rabbit Kills") + ChatColor.GREEN + " Rabbits " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Sheep.Sheep Kills") + ChatColor.GREEN + " Sheep " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Snowman.Snowman Kills") + ChatColor.GREEN + " Snowmen " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Stray.Stray Kills") + ChatColor.GREEN + " Strays " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Vex.Vex Kills") + ChatColor.GREEN + " Vexs " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage(ChatColor.GOLD + "=============== Do \"/mobkills 5\" for the next page ==============");
                }
                else if(args[0].equalsIgnoreCase("5")) { //for /mobkills 5
    				player.sendMessage(ChatColor.GOLD + "=============== [MobStatz] total mob kills Page 4 ===============");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Villager.Villager Kills") + ChatColor.GREEN + " Villagers " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Vindicator.Vindicator Kills") + ChatColor.GREEN + " Vindicators " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage("" + ChatColor.GOLD + configGetter.getConfig().getInt("Wolf.Wolf Kills") + ChatColor.GREEN + " Wolfs " + ChatColor.GOLD + "have been killed by everyone!");
    				player.sendMessage(ChatColor.GOLD + "========================== Last Page :) =========================");
                }
                return true;
            }
        }
        return false;
    }
}