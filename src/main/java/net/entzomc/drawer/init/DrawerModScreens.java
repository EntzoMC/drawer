
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.entzomc.drawer.client.gui.WarpedDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedWarpedDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedSpruceDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedOakDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedMangroveDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedJungleDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedDarkOakDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedCrimsonDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedCherryDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedBirchDrawerGuiScreen;
import net.entzomc.drawer.client.gui.StrippedAcaciaDrawerGuiScreen;
import net.entzomc.drawer.client.gui.SpruceDrawerGuiScreen;
import net.entzomc.drawer.client.gui.OakDrawerGuiScreen;
import net.entzomc.drawer.client.gui.MangroveDrawerGuiScreen;
import net.entzomc.drawer.client.gui.JungleDrawerGuiScreen;
import net.entzomc.drawer.client.gui.DarkOakDrawerGuiScreen;
import net.entzomc.drawer.client.gui.CrimsonDrawerGuiScreen;
import net.entzomc.drawer.client.gui.CherryDrawerGuiScreen;
import net.entzomc.drawer.client.gui.BirchDrawerGuiScreen;
import net.entzomc.drawer.client.gui.AcaciaDrawerGuiScreen;

public class DrawerModScreens {
	public static void load() {
		MenuScreens.register(DrawerModMenus.OAK_DRAWER_GUI, OakDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.SPRUCE_DRAWER_GUI, SpruceDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.BIRCH_DRAWER_GUI, BirchDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.JUNGLE_DRAWER_GUI, JungleDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.ACACIA_DRAWER_GUI, AcaciaDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.DARK_OAK_DRAWER_GUI, DarkOakDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.MANGROVE_DRAWER_GUI, MangroveDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.CRIMSON_DRAWER_GUI, CrimsonDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.WARPED_DRAWER_GUI, WarpedDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_OAK_DRAWER_GUI, StrippedOakDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_SPRUCE_DRAWER_GUI, StrippedSpruceDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_BIRCH_DRAWER_GUI, StrippedBirchDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_JUNGLE_DRAWER_GUI, StrippedJungleDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_ACACIA_DRAWER_GUI, StrippedAcaciaDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_DARK_OAK_DRAWER_GUI, StrippedDarkOakDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_MANGROVE_DRAWER_GUI, StrippedMangroveDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_CRIMSON_DRAWER_GUI, StrippedCrimsonDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_WARPED_DRAWER_GUI, StrippedWarpedDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.STRIPPED_CHERRY_DRAWER_GUI, StrippedCherryDrawerGuiScreen::new);
		MenuScreens.register(DrawerModMenus.CHERRY_DRAWER_GUI, CherryDrawerGuiScreen::new);
	}
}
