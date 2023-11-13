/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.entzomc.drawer.item.ScrewItem;
import net.entzomc.drawer.DrawerMod;

public class DrawerModItems {
	public static Item OAK_DRAWER;
	public static Item SPRUCE_DRAWER;
	public static Item BIRCH_DRAWER;
	public static Item JUNGLE_DRAWER;
	public static Item ACACIA_DRAWER;
	public static Item DARK_OAK_DRAWER;
	public static Item MANGROVE_DRAWER;
	public static Item CRIMSON_DRAWER;
	public static Item WARPED_DRAWER;
	public static Item CHERRY_DRAWER;
	public static Item STRIPPED_OAK_DRAWER;
	public static Item STRIPPED_SPRUCE_DRAWER;
	public static Item STRIPPED_BIRCH_DRAWER;
	public static Item STRIPPED_JUNGLE_DRAWER;
	public static Item STRIPPED_ACACIA_DRAWER;
	public static Item STRIPPED_DARK_OAK_DRAWER;
	public static Item STRIPPED_MANGROVE_DRAWER;
	public static Item STRIPPED_CRIMSON_DRAWER;
	public static Item STRIPPED_WARPED_DRAWER;
	public static Item STRIPPED_CHERRY_DRAWER;
	public static Item SCREW;

	public static void load() {
		OAK_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "oak_drawer"), new BlockItem(DrawerModBlocks.OAK_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(OAK_DRAWER));
		SPRUCE_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "spruce_drawer"), new BlockItem(DrawerModBlocks.SPRUCE_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(SPRUCE_DRAWER));
		BIRCH_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "birch_drawer"), new BlockItem(DrawerModBlocks.BIRCH_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(BIRCH_DRAWER));
		JUNGLE_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "jungle_drawer"), new BlockItem(DrawerModBlocks.JUNGLE_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(JUNGLE_DRAWER));
		ACACIA_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "acacia_drawer"), new BlockItem(DrawerModBlocks.ACACIA_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(ACACIA_DRAWER));
		DARK_OAK_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "dark_oak_drawer"), new BlockItem(DrawerModBlocks.DARK_OAK_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(DARK_OAK_DRAWER));
		MANGROVE_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "mangrove_drawer"), new BlockItem(DrawerModBlocks.MANGROVE_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(MANGROVE_DRAWER));
		CRIMSON_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "crimson_drawer"), new BlockItem(DrawerModBlocks.CRIMSON_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(CRIMSON_DRAWER));
		WARPED_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "warped_drawer"), new BlockItem(DrawerModBlocks.WARPED_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(WARPED_DRAWER));
		CHERRY_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "cherry_drawer"), new BlockItem(DrawerModBlocks.CHERRY_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(CHERRY_DRAWER));
		STRIPPED_OAK_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_oak_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_OAK_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_OAK_DRAWER));
		STRIPPED_SPRUCE_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_spruce_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_SPRUCE_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_SPRUCE_DRAWER));
		STRIPPED_BIRCH_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_birch_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_BIRCH_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_BIRCH_DRAWER));
		STRIPPED_JUNGLE_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_jungle_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_JUNGLE_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_JUNGLE_DRAWER));
		STRIPPED_ACACIA_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_acacia_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_ACACIA_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_ACACIA_DRAWER));
		STRIPPED_DARK_OAK_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_dark_oak_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_DARK_OAK_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_DARK_OAK_DRAWER));
		STRIPPED_MANGROVE_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_mangrove_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_MANGROVE_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_MANGROVE_DRAWER));
		STRIPPED_CRIMSON_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_crimson_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_CRIMSON_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_CRIMSON_DRAWER));
		STRIPPED_WARPED_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_warped_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_WARPED_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_WARPED_DRAWER));
		STRIPPED_CHERRY_DRAWER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "stripped_cherry_drawer"), new BlockItem(DrawerModBlocks.STRIPPED_CHERRY_DRAWER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(STRIPPED_CHERRY_DRAWER));
		SCREW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DrawerMod.MODID, "screw"), new ScrewItem());
	}

	public static void clientLoad() {
	}
}
