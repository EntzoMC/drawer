
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.entzomc.drawer.block.WarpedDrawerBlock;
import net.entzomc.drawer.block.StrippedWarpedDrawerBlock;
import net.entzomc.drawer.block.StrippedSpruceDrawerBlock;
import net.entzomc.drawer.block.StrippedOakDrawerBlock;
import net.entzomc.drawer.block.StrippedMangroveDrawerBlock;
import net.entzomc.drawer.block.StrippedJungleDrawerBlock;
import net.entzomc.drawer.block.StrippedDarkOakDrawerBlock;
import net.entzomc.drawer.block.StrippedCrimsonDrawerBlock;
import net.entzomc.drawer.block.StrippedCherryDrawerBlock;
import net.entzomc.drawer.block.StrippedBirchDrawerBlock;
import net.entzomc.drawer.block.StrippedAcaciaDrawerBlock;
import net.entzomc.drawer.block.SpruceDrawerBlock;
import net.entzomc.drawer.block.OakDrawerBlock;
import net.entzomc.drawer.block.MangroveDrawerBlock;
import net.entzomc.drawer.block.JungleDrawerBlock;
import net.entzomc.drawer.block.DarkOakDrawerBlock;
import net.entzomc.drawer.block.CrimsonDrawerBlock;
import net.entzomc.drawer.block.CherryDrawerBlock;
import net.entzomc.drawer.block.BirchDrawerBlock;
import net.entzomc.drawer.block.AcaciaDrawerBlock;
import net.entzomc.drawer.DrawerMod;

public class DrawerModBlocks {
	public static Block OAK_DRAWER;
	public static Block SPRUCE_DRAWER;
	public static Block BIRCH_DRAWER;
	public static Block JUNGLE_DRAWER;
	public static Block ACACIA_DRAWER;
	public static Block DARK_OAK_DRAWER;
	public static Block MANGROVE_DRAWER;
	public static Block CRIMSON_DRAWER;
	public static Block WARPED_DRAWER;
	public static Block CHERRY_DRAWER;
	public static Block STRIPPED_OAK_DRAWER;
	public static Block STRIPPED_SPRUCE_DRAWER;
	public static Block STRIPPED_BIRCH_DRAWER;
	public static Block STRIPPED_JUNGLE_DRAWER;
	public static Block STRIPPED_ACACIA_DRAWER;
	public static Block STRIPPED_DARK_OAK_DRAWER;
	public static Block STRIPPED_MANGROVE_DRAWER;
	public static Block STRIPPED_CRIMSON_DRAWER;
	public static Block STRIPPED_WARPED_DRAWER;
	public static Block STRIPPED_CHERRY_DRAWER;

	public static void load() {
		OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "oak_drawer"), new OakDrawerBlock());
		SPRUCE_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "spruce_drawer"), new SpruceDrawerBlock());
		BIRCH_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "birch_drawer"), new BirchDrawerBlock());
		JUNGLE_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "jungle_drawer"), new JungleDrawerBlock());
		ACACIA_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "acacia_drawer"), new AcaciaDrawerBlock());
		DARK_OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "dark_oak_drawer"), new DarkOakDrawerBlock());
		MANGROVE_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "mangrove_drawer"), new MangroveDrawerBlock());
		CRIMSON_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "crimson_drawer"), new CrimsonDrawerBlock());
		WARPED_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "warped_drawer"), new WarpedDrawerBlock());
		CHERRY_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "cherry_drawer"), new CherryDrawerBlock());
		STRIPPED_OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_oak_drawer"), new StrippedOakDrawerBlock());
		STRIPPED_SPRUCE_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_spruce_drawer"), new StrippedSpruceDrawerBlock());
		STRIPPED_BIRCH_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_birch_drawer"), new StrippedBirchDrawerBlock());
		STRIPPED_JUNGLE_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_jungle_drawer"), new StrippedJungleDrawerBlock());
		STRIPPED_ACACIA_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_acacia_drawer"), new StrippedAcaciaDrawerBlock());
		STRIPPED_DARK_OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_dark_oak_drawer"), new StrippedDarkOakDrawerBlock());
		STRIPPED_MANGROVE_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_mangrove_drawer"), new StrippedMangroveDrawerBlock());
		STRIPPED_CRIMSON_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_crimson_drawer"), new StrippedCrimsonDrawerBlock());
		STRIPPED_WARPED_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_warped_drawer"), new StrippedWarpedDrawerBlock());
		STRIPPED_CHERRY_DRAWER = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DrawerMod.MODID, "stripped_cherry_drawer"), new StrippedCherryDrawerBlock());
	}

	public static void clientLoad() {
		OakDrawerBlock.clientInit();
		SpruceDrawerBlock.clientInit();
		BirchDrawerBlock.clientInit();
		JungleDrawerBlock.clientInit();
		AcaciaDrawerBlock.clientInit();
		DarkOakDrawerBlock.clientInit();
		MangroveDrawerBlock.clientInit();
		CrimsonDrawerBlock.clientInit();
		WarpedDrawerBlock.clientInit();
		CherryDrawerBlock.clientInit();
		StrippedOakDrawerBlock.clientInit();
		StrippedSpruceDrawerBlock.clientInit();
		StrippedBirchDrawerBlock.clientInit();
		StrippedJungleDrawerBlock.clientInit();
		StrippedAcaciaDrawerBlock.clientInit();
		StrippedDarkOakDrawerBlock.clientInit();
		StrippedMangroveDrawerBlock.clientInit();
		StrippedCrimsonDrawerBlock.clientInit();
		StrippedWarpedDrawerBlock.clientInit();
		StrippedCherryDrawerBlock.clientInit();
	}
}
