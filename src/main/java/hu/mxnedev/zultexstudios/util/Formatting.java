package hu.mxnedev.zultexstudios.util;


import org.bukkit.ChatColor;

public class Formatting {

	private static final char COLOR_CODE_CHARACTER = '&';

	public static String log(String message) {
		return ChatColor.translateAlternateColorCodes(COLOR_CODE_CHARACTER, message);
	}
}
