
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

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
	public static BlockEntityType<?> OAK_DRAWER;
	public static BlockEntityType<?> SPRUCE_DRAWER;
	public static BlockEntityType<?> BIRCH_DRAWER;
	public static BlockEntityType<?> JUNGLE_DRAWER;
	public static BlockEntityType<?> ACACIA_DRAWER;
	public static BlockEntityType<?> DARK_OAK_DRAWER;
	public static BlockEntityType<?> MANGROVE_DRAWER;
	public static BlockEntityType<?> CRIMSON_DRAWER;
	public static BlockEntityType<?> WARPED_DRAWER;
	public static BlockEntityType<?> CHERRY_DRAWER;
	public static BlockEntityType<?> STRIPPED_OAK_DRAWER;
	public static BlockEntityType<?> STRIPPED_SPRUCE_DRAWER;
	public static BlockEntityType<?> STRIPPED_BIRCH_DRAWER;
	public static BlockEntityType<?> STRIPPED_JUNGLE_DRAWER;
	public static BlockEntityType<?> STRIPPED_ACACIA_DRAWER;
	public static BlockEntityType<?> STRIPPED_DARK_OAK_DRAWER;
	public static BlockEntityType<?> STRIPPED_MANGROVE_DRAWER;
	public static BlockEntityType<?> STRIPPED_CRIMSON_DRAWER;
	public static BlockEntityType<?> STRIPPED_WARPED_DRAWER;
	public static BlockEntityType<?> STRIPPED_CHERRY_DRAWER;

	public static void load() {
		OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "oak_drawer"), FabricBlockEntityTypeBuilder.create(OakDrawerBlockEntity::new, DrawerModBlocks.OAK_DRAWER).build(null));
		SPRUCE_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "spruce_drawer"), FabricBlockEntityTypeBuilder.create(SpruceDrawerBlockEntity::new, DrawerModBlocks.SPRUCE_DRAWER).build(null));
		BIRCH_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "birch_drawer"), FabricBlockEntityTypeBuilder.create(BirchDrawerBlockEntity::new, DrawerModBlocks.BIRCH_DRAWER).build(null));
		JUNGLE_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "jungle_drawer"), FabricBlockEntityTypeBuilder.create(JungleDrawerBlockEntity::new, DrawerModBlocks.JUNGLE_DRAWER).build(null));
		ACACIA_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "acacia_drawer"), FabricBlockEntityTypeBuilder.create(AcaciaDrawerBlockEntity::new, DrawerModBlocks.ACACIA_DRAWER).build(null));
		DARK_OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "dark_oak_drawer"),
				FabricBlockEntityTypeBuilder.create(DarkOakDrawerBlockEntity::new, DrawerModBlocks.DARK_OAK_DRAWER).build(null));
		MANGROVE_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "mangrove_drawer"),
				FabricBlockEntityTypeBuilder.create(MangroveDrawerBlockEntity::new, DrawerModBlocks.MANGROVE_DRAWER).build(null));
		CRIMSON_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "crimson_drawer"), FabricBlockEntityTypeBuilder.create(CrimsonDrawerBlockEntity::new, DrawerModBlocks.CRIMSON_DRAWER).build(null));
		WARPED_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "warped_drawer"), FabricBlockEntityTypeBuilder.create(WarpedDrawerBlockEntity::new, DrawerModBlocks.WARPED_DRAWER).build(null));
		CHERRY_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "cherry_drawer"), FabricBlockEntityTypeBuilder.create(CherryDrawerBlockEntity::new, DrawerModBlocks.CHERRY_DRAWER).build(null));
		STRIPPED_OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_oak_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedOakDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_OAK_DRAWER).build(null));
		STRIPPED_SPRUCE_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_spruce_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedSpruceDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_SPRUCE_DRAWER).build(null));
		STRIPPED_BIRCH_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_birch_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedBirchDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_BIRCH_DRAWER).build(null));
		STRIPPED_JUNGLE_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_jungle_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedJungleDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_JUNGLE_DRAWER).build(null));
		STRIPPED_ACACIA_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_acacia_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedAcaciaDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_ACACIA_DRAWER).build(null));
		STRIPPED_DARK_OAK_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_dark_oak_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedDarkOakDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_DARK_OAK_DRAWER).build(null));
		STRIPPED_MANGROVE_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_mangrove_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedMangroveDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_MANGROVE_DRAWER).build(null));
		STRIPPED_CRIMSON_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_crimson_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedCrimsonDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_CRIMSON_DRAWER).build(null));
		STRIPPED_WARPED_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_warped_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedWarpedDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_WARPED_DRAWER).build(null));
		STRIPPED_CHERRY_DRAWER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DrawerMod.MODID, "stripped_cherry_drawer"),
				FabricBlockEntityTypeBuilder.create(StrippedCherryDrawerBlockEntity::new, DrawerModBlocks.STRIPPED_CHERRY_DRAWER).build(null));
	}
}
