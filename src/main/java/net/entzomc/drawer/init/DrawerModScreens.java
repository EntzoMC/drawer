
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DrawerModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DrawerModMenus.OAK_DRAWER_GUI.get(), OakDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.SPRUCE_DRAWER_GUI.get(), SpruceDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.BIRCH_DRAWER_GUI.get(), BirchDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.JUNGLE_DRAWER_GUI.get(), JungleDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.ACACIA_DRAWER_GUI.get(), AcaciaDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.DARK_OAK_DRAWER_GUI.get(), DarkOakDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.MANGROVE_DRAWER_GUI.get(), MangroveDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.CRIMSON_DRAWER_GUI.get(), CrimsonDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.WARPED_DRAWER_GUI.get(), WarpedDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_OAK_DRAWER_GUI.get(), StrippedOakDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_SPRUCE_DRAWER_GUI.get(), StrippedSpruceDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_BIRCH_DRAWER_GUI.get(), StrippedBirchDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_JUNGLE_DRAWER_GUI.get(), StrippedJungleDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_ACACIA_DRAWER_GUI.get(), StrippedAcaciaDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_DARK_OAK_DRAWER_GUI.get(), StrippedDarkOakDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_MANGROVE_DRAWER_GUI.get(), StrippedMangroveDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_CRIMSON_DRAWER_GUI.get(), StrippedCrimsonDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_WARPED_DRAWER_GUI.get(), StrippedWarpedDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.STRIPPED_CHERRY_DRAWER_GUI.get(), StrippedCherryDrawerGuiScreen::new);
			MenuScreens.register(DrawerModMenus.CHERRY_DRAWER_GUI.get(), CherryDrawerGuiScreen::new);
		});
	}
}
