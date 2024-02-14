
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

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
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DrawerMod.MODID);
	public static final RegistryObject<Block> OAK_DRAWER = REGISTRY.register("oak_drawer", () -> new OakDrawerBlock());
	public static final RegistryObject<Block> SPRUCE_DRAWER = REGISTRY.register("spruce_drawer", () -> new SpruceDrawerBlock());
	public static final RegistryObject<Block> BIRCH_DRAWER = REGISTRY.register("birch_drawer", () -> new BirchDrawerBlock());
	public static final RegistryObject<Block> JUNGLE_DRAWER = REGISTRY.register("jungle_drawer", () -> new JungleDrawerBlock());
	public static final RegistryObject<Block> ACACIA_DRAWER = REGISTRY.register("acacia_drawer", () -> new AcaciaDrawerBlock());
	public static final RegistryObject<Block> DARK_OAK_DRAWER = REGISTRY.register("dark_oak_drawer", () -> new DarkOakDrawerBlock());
	public static final RegistryObject<Block> MANGROVE_DRAWER = REGISTRY.register("mangrove_drawer", () -> new MangroveDrawerBlock());
	public static final RegistryObject<Block> CRIMSON_DRAWER = REGISTRY.register("crimson_drawer", () -> new CrimsonDrawerBlock());
	public static final RegistryObject<Block> WARPED_DRAWER = REGISTRY.register("warped_drawer", () -> new WarpedDrawerBlock());
	public static final RegistryObject<Block> CHERRY_DRAWER = REGISTRY.register("cherry_drawer", () -> new CherryDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_OAK_DRAWER = REGISTRY.register("stripped_oak_drawer", () -> new StrippedOakDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_SPRUCE_DRAWER = REGISTRY.register("stripped_spruce_drawer", () -> new StrippedSpruceDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_BIRCH_DRAWER = REGISTRY.register("stripped_birch_drawer", () -> new StrippedBirchDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_JUNGLE_DRAWER = REGISTRY.register("stripped_jungle_drawer", () -> new StrippedJungleDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_ACACIA_DRAWER = REGISTRY.register("stripped_acacia_drawer", () -> new StrippedAcaciaDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_DARK_OAK_DRAWER = REGISTRY.register("stripped_dark_oak_drawer", () -> new StrippedDarkOakDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_MANGROVE_DRAWER = REGISTRY.register("stripped_mangrove_drawer", () -> new StrippedMangroveDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_CRIMSON_DRAWER = REGISTRY.register("stripped_crimson_drawer", () -> new StrippedCrimsonDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_WARPED_DRAWER = REGISTRY.register("stripped_warped_drawer", () -> new StrippedWarpedDrawerBlock());
	public static final RegistryObject<Block> STRIPPED_CHERRY_DRAWER = REGISTRY.register("stripped_cherry_drawer", () -> new StrippedCherryDrawerBlock());
}
