
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

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
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DrawerMod.MODID);
	public static final RegistryObject<MenuType<OakDrawerGuiMenu>> OAK_DRAWER_GUI = REGISTRY.register("oak_drawer_gui", () -> IForgeMenuType.create(OakDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<SpruceDrawerGuiMenu>> SPRUCE_DRAWER_GUI = REGISTRY.register("spruce_drawer_gui", () -> IForgeMenuType.create(SpruceDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<BirchDrawerGuiMenu>> BIRCH_DRAWER_GUI = REGISTRY.register("birch_drawer_gui", () -> IForgeMenuType.create(BirchDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<JungleDrawerGuiMenu>> JUNGLE_DRAWER_GUI = REGISTRY.register("jungle_drawer_gui", () -> IForgeMenuType.create(JungleDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<AcaciaDrawerGuiMenu>> ACACIA_DRAWER_GUI = REGISTRY.register("acacia_drawer_gui", () -> IForgeMenuType.create(AcaciaDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<DarkOakDrawerGuiMenu>> DARK_OAK_DRAWER_GUI = REGISTRY.register("dark_oak_drawer_gui", () -> IForgeMenuType.create(DarkOakDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<MangroveDrawerGuiMenu>> MANGROVE_DRAWER_GUI = REGISTRY.register("mangrove_drawer_gui", () -> IForgeMenuType.create(MangroveDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<CrimsonDrawerGuiMenu>> CRIMSON_DRAWER_GUI = REGISTRY.register("crimson_drawer_gui", () -> IForgeMenuType.create(CrimsonDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<WarpedDrawerGuiMenu>> WARPED_DRAWER_GUI = REGISTRY.register("warped_drawer_gui", () -> IForgeMenuType.create(WarpedDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedOakDrawerGuiMenu>> STRIPPED_OAK_DRAWER_GUI = REGISTRY.register("stripped_oak_drawer_gui", () -> IForgeMenuType.create(StrippedOakDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedSpruceDrawerGuiMenu>> STRIPPED_SPRUCE_DRAWER_GUI = REGISTRY.register("stripped_spruce_drawer_gui", () -> IForgeMenuType.create(StrippedSpruceDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedBirchDrawerGuiMenu>> STRIPPED_BIRCH_DRAWER_GUI = REGISTRY.register("stripped_birch_drawer_gui", () -> IForgeMenuType.create(StrippedBirchDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedJungleDrawerGuiMenu>> STRIPPED_JUNGLE_DRAWER_GUI = REGISTRY.register("stripped_jungle_drawer_gui", () -> IForgeMenuType.create(StrippedJungleDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedAcaciaDrawerGuiMenu>> STRIPPED_ACACIA_DRAWER_GUI = REGISTRY.register("stripped_acacia_drawer_gui", () -> IForgeMenuType.create(StrippedAcaciaDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedDarkOakDrawerGuiMenu>> STRIPPED_DARK_OAK_DRAWER_GUI = REGISTRY.register("stripped_dark_oak_drawer_gui", () -> IForgeMenuType.create(StrippedDarkOakDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedMangroveDrawerGuiMenu>> STRIPPED_MANGROVE_DRAWER_GUI = REGISTRY.register("stripped_mangrove_drawer_gui", () -> IForgeMenuType.create(StrippedMangroveDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedCrimsonDrawerGuiMenu>> STRIPPED_CRIMSON_DRAWER_GUI = REGISTRY.register("stripped_crimson_drawer_gui", () -> IForgeMenuType.create(StrippedCrimsonDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedWarpedDrawerGuiMenu>> STRIPPED_WARPED_DRAWER_GUI = REGISTRY.register("stripped_warped_drawer_gui", () -> IForgeMenuType.create(StrippedWarpedDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<StrippedCherryDrawerGuiMenu>> STRIPPED_CHERRY_DRAWER_GUI = REGISTRY.register("stripped_cherry_drawer_gui", () -> IForgeMenuType.create(StrippedCherryDrawerGuiMenu::new));
	public static final RegistryObject<MenuType<CherryDrawerGuiMenu>> CHERRY_DRAWER_GUI = REGISTRY.register("cherry_drawer_gui", () -> IForgeMenuType.create(CherryDrawerGuiMenu::new));
}
