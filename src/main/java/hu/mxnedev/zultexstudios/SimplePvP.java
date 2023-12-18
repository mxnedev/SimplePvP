package hu.mxnedev.zultexstudios;

import hu.mxnedev.zultexstudios.util.Formatting;
import org.bukkit.plugin.java.JavaPlugin;

public class SimplePvP extends JavaPlugin {


	@Override
	public void onEnable() {
		registerCommands();
		Formatting.log("&aSimplePvP is enabled!");
	}

	@Override
	public void onDisable() {
		Formatting.log("&cSimplePvP is disabled");
	}

	public void registerCommands() {
		getCommand("pvp").setExecutor(new PvPCommand());
	}
}
