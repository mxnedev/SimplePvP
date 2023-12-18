package hu.mxnedev.zultexstudios;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class PvPCommand implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("pvp")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;

				// Adjunk hozzá vas páncélt
				player.getInventory().setArmorContents(new ItemStack[]{
						new ItemStack(Material.IRON_BOOTS),
						new ItemStack(Material.IRON_LEGGINGS),
						new ItemStack(Material.IRON_CHESTPLATE),
						new ItemStack(Material.IRON_HELMET)
				});

				// Adjunk hozzá egy élesített 1-es gyémántkardot
				ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
				diamondSword.addEnchantment(org.bukkit.enchantments.Enchantment.DAMAGE_ALL, 1);
				player.getInventory().addItem(diamondSword);

				// Adjunk hozzá egy teljes inv levest
				for (int i = 0; i < 36; i++) {
					ItemStack soup = new Potion(PotionType.INSTANT_HEAL, 1).toItemStack(1);
					player.getInventory().addItem(soup);
				}

				player.sendMessage("You have been equipped for PvP!");
			} else {
				sender.sendMessage("Only players can use this command!");
			}
		}

		return true;
	}
}
