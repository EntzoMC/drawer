
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import net.entzomc.drawer.world.inventory.WarpedDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedWarpedDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedSpruceDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedOakDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedMangroveDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedJungleDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedDarkOakDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedCrimsonDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedCherryDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedBirchDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.StrippedAcaciaDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.SpruceDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.OakDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.MangroveDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.JungleDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.DarkOakDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.CrimsonDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.CherryDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.BirchDrawerGuiMenu;
import net.entzomc.drawer.world.inventory.AcaciaDrawerGuiMenu;
import net.entzomc.drawer.DrawerMod;

public class DrawerModMenus {
	public static MenuType<OakDrawerGuiMenu> OAK_DRAWER_GUI;
	public static MenuType<SpruceDrawerGuiMenu> SPRUCE_DRAWER_GUI;
	public static MenuType<BirchDrawerGuiMenu> BIRCH_DRAWER_GUI;
	public static MenuType<JungleDrawerGuiMenu> JUNGLE_DRAWER_GUI;
	public static MenuType<AcaciaDrawerGuiMenu> ACACIA_DRAWER_GUI;
	public static MenuType<DarkOakDrawerGuiMenu> DARK_OAK_DRAWER_GUI;
	public static MenuType<MangroveDrawerGuiMenu> MANGROVE_DRAWER_GUI;
	public static MenuType<CrimsonDrawerGuiMenu> CRIMSON_DRAWER_GUI;
	public static MenuType<WarpedDrawerGuiMenu> WARPED_DRAWER_GUI;
	public static MenuType<StrippedOakDrawerGuiMenu> STRIPPED_OAK_DRAWER_GUI;
	public static MenuType<StrippedSpruceDrawerGuiMenu> STRIPPED_SPRUCE_DRAWER_GUI;
	public static MenuType<StrippedBirchDrawerGuiMenu> STRIPPED_BIRCH_DRAWER_GUI;
	public static MenuType<StrippedJungleDrawerGuiMenu> STRIPPED_JUNGLE_DRAWER_GUI;
	public static MenuType<StrippedAcaciaDrawerGuiMenu> STRIPPED_ACACIA_DRAWER_GUI;
	public static MenuType<StrippedDarkOakDrawerGuiMenu> STRIPPED_DARK_OAK_DRAWER_GUI;
	public static MenuType<StrippedMangroveDrawerGuiMenu> STRIPPED_MANGROVE_DRAWER_GUI;
	public static MenuType<StrippedCrimsonDrawerGuiMenu> STRIPPED_CRIMSON_DRAWER_GUI;
	public static MenuType<StrippedWarpedDrawerGuiMenu> STRIPPED_WARPED_DRAWER_GUI;
	public static MenuType<StrippedCherryDrawerGuiMenu> STRIPPED_CHERRY_DRAWER_GUI;
	public static MenuType<CherryDrawerGuiMenu> CHERRY_DRAWER_GUI;

	public static void load() {
		OAK_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "oak_drawer_gui"), new ExtendedScreenHandlerType<>(OakDrawerGuiMenu::new));
		OakDrawerGuiMenu.screenInit();
		SPRUCE_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "spruce_drawer_gui"), new ExtendedScreenHandlerType<>(SpruceDrawerGuiMenu::new));
		SpruceDrawerGuiMenu.screenInit();
		BIRCH_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "birch_drawer_gui"), new ExtendedScreenHandlerType<>(BirchDrawerGuiMenu::new));
		BirchDrawerGuiMenu.screenInit();
		JUNGLE_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "jungle_drawer_gui"), new ExtendedScreenHandlerType<>(JungleDrawerGuiMenu::new));
		JungleDrawerGuiMenu.screenInit();
		ACACIA_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "acacia_drawer_gui"), new ExtendedScreenHandlerType<>(AcaciaDrawerGuiMenu::new));
		AcaciaDrawerGuiMenu.screenInit();
		DARK_OAK_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "dark_oak_drawer_gui"), new ExtendedScreenHandlerType<>(DarkOakDrawerGuiMenu::new));
		DarkOakDrawerGuiMenu.screenInit();
		MANGROVE_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "mangrove_drawer_gui"), new ExtendedScreenHandlerType<>(MangroveDrawerGuiMenu::new));
		MangroveDrawerGuiMenu.screenInit();
		CRIMSON_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "crimson_drawer_gui"), new ExtendedScreenHandlerType<>(CrimsonDrawerGuiMenu::new));
		CrimsonDrawerGuiMenu.screenInit();
		WARPED_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "warped_drawer_gui"), new ExtendedScreenHandlerType<>(WarpedDrawerGuiMenu::new));
		WarpedDrawerGuiMenu.screenInit();
		STRIPPED_OAK_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_oak_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedOakDrawerGuiMenu::new));
		StrippedOakDrawerGuiMenu.screenInit();
		STRIPPED_SPRUCE_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_spruce_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedSpruceDrawerGuiMenu::new));
		StrippedSpruceDrawerGuiMenu.screenInit();
		STRIPPED_BIRCH_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_birch_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedBirchDrawerGuiMenu::new));
		StrippedBirchDrawerGuiMenu.screenInit();
		STRIPPED_JUNGLE_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_jungle_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedJungleDrawerGuiMenu::new));
		StrippedJungleDrawerGuiMenu.screenInit();
		STRIPPED_ACACIA_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_acacia_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedAcaciaDrawerGuiMenu::new));
		StrippedAcaciaDrawerGuiMenu.screenInit();
		STRIPPED_DARK_OAK_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_dark_oak_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedDarkOakDrawerGuiMenu::new));
		StrippedDarkOakDrawerGuiMenu.screenInit();
		STRIPPED_MANGROVE_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_mangrove_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedMangroveDrawerGuiMenu::new));
		StrippedMangroveDrawerGuiMenu.screenInit();
		STRIPPED_CRIMSON_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_crimson_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedCrimsonDrawerGuiMenu::new));
		StrippedCrimsonDrawerGuiMenu.screenInit();
		STRIPPED_WARPED_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_warped_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedWarpedDrawerGuiMenu::new));
		StrippedWarpedDrawerGuiMenu.screenInit();
		STRIPPED_CHERRY_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "stripped_cherry_drawer_gui"), new ExtendedScreenHandlerType<>(StrippedCherryDrawerGuiMenu::new));
		StrippedCherryDrawerGuiMenu.screenInit();
		CHERRY_DRAWER_GUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(DrawerMod.MODID, "cherry_drawer_gui"), new ExtendedScreenHandlerType<>(CherryDrawerGuiMenu::new));
		CherryDrawerGuiMenu.screenInit();
	}
}
