package thebombzen.mods.enchantview.client;

import net.minecraft.client.gui.GuiScreen;
import thebombzen.mods.enchantview.Configuration;
import thebombzen.mods.enchantview.EnchantView;
import thebombzen.mods.thebombzenapi.client.ThebombzenAPIConfigScreen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ConfigScreen extends ThebombzenAPIConfigScreen {
	public ConfigScreen(EnchantView mod, GuiScreen parentScreen,
			Configuration config) {
		super(mod, parentScreen, config);
	}
}