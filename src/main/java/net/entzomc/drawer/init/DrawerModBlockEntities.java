
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.entzomc.drawer.block.entity.WarpedDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedWarpedDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedSpruceDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedOakDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedMangroveDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedJungleDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedDarkOakDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedCrimsonDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedCherryDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedBirchDrawerBlockEntity;
import net.entzomc.drawer.block.entity.StrippedAcaciaDrawerBlockEntity;
import net.entzomc.drawer.block.entity.SpruceDrawerBlockEntity;
import net.entzomc.drawer.block.entity.OakDrawerBlockEntity;
import net.entzomc.drawer.block.entity.MangroveDrawerBlockEntity;
import net.entzomc.drawer.block.entity.JungleDrawerBlockEntity;
import net.entzomc.drawer.block.entity.DarkOakDrawerBlockEntity;
import net.entzomc.drawer.block.entity.CrimsonDrawerBlockEntity;
import net.entzomc.drawer.block.entity.CherryDrawerBlockEntity;
import net.entzomc.drawer.block.entity.BirchDrawerBlockEntity;
import net.entzomc.drawer.block.entity.AcaciaDrawerBlockEntity;
import net.entzomc.drawer.DrawerMod;

public class DrawerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DrawerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OAK_DRAWER = register("oak_drawer", DrawerModBlocks.OAK_DRAWER, OakDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPRUCE_DRAWER = register("spruce_drawer", DrawerModBlocks.SPRUCE_DRAWER, SpruceDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIRCH_DRAWER = register("birch_drawer", DrawerModBlocks.BIRCH_DRAWER, BirchDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUNGLE_DRAWER = register("jungle_drawer", DrawerModBlocks.JUNGLE_DRAWER, JungleDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ACACIA_DRAWER = register("acacia_drawer", DrawerModBlocks.ACACIA_DRAWER, AcaciaDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_OAK_DRAWER = register("dark_oak_drawer", DrawerModBlocks.DARK_OAK_DRAWER, DarkOakDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANGROVE_DRAWER = register("mangrove_drawer", DrawerModBlocks.MANGROVE_DRAWER, MangroveDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRIMSON_DRAWER = register("crimson_drawer", DrawerModBlocks.CRIMSON_DRAWER, CrimsonDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WARPED_DRAWER = register("warped_drawer", DrawerModBlocks.WARPED_DRAWER, WarpedDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHERRY_DRAWER = register("cherry_drawer", DrawerModBlocks.CHERRY_DRAWER, CherryDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_OAK_DRAWER = register("stripped_oak_drawer", DrawerModBlocks.STRIPPED_OAK_DRAWER, StrippedOakDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_SPRUCE_DRAWER = register("stripped_spruce_drawer", DrawerModBlocks.STRIPPED_SPRUCE_DRAWER, StrippedSpruceDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_BIRCH_DRAWER = register("stripped_birch_drawer", DrawerModBlocks.STRIPPED_BIRCH_DRAWER, StrippedBirchDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_JUNGLE_DRAWER = register("stripped_jungle_drawer", DrawerModBlocks.STRIPPED_JUNGLE_DRAWER, StrippedJungleDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_ACACIA_DRAWER = register("stripped_acacia_drawer", DrawerModBlocks.STRIPPED_ACACIA_DRAWER, StrippedAcaciaDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_DARK_OAK_DRAWER = register("stripped_dark_oak_drawer", DrawerModBlocks.STRIPPED_DARK_OAK_DRAWER, StrippedDarkOakDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_MANGROVE_DRAWER = register("stripped_mangrove_drawer", DrawerModBlocks.STRIPPED_MANGROVE_DRAWER, StrippedMangroveDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_CRIMSON_DRAWER = register("stripped_crimson_drawer", DrawerModBlocks.STRIPPED_CRIMSON_DRAWER, StrippedCrimsonDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_WARPED_DRAWER = register("stripped_warped_drawer", DrawerModBlocks.STRIPPED_WARPED_DRAWER, StrippedWarpedDrawerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRIPPED_CHERRY_DRAWER = register("stripped_cherry_drawer", DrawerModBlocks.STRIPPED_CHERRY_DRAWER, StrippedCherryDrawerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
