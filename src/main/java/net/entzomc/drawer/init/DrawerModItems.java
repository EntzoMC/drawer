
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.entzomc.drawer.item.ScrewItem;
import net.entzomc.drawer.DrawerMod;

public class DrawerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DrawerMod.MODID);
	public static final RegistryObject<Item> OAK_DRAWER = block(DrawerModBlocks.OAK_DRAWER);
	public static final RegistryObject<Item> SPRUCE_DRAWER = block(DrawerModBlocks.SPRUCE_DRAWER);
	public static final RegistryObject<Item> BIRCH_DRAWER = block(DrawerModBlocks.BIRCH_DRAWER);
	public static final RegistryObject<Item> JUNGLE_DRAWER = block(DrawerModBlocks.JUNGLE_DRAWER);
	public static final RegistryObject<Item> ACACIA_DRAWER = block(DrawerModBlocks.ACACIA_DRAWER);
	public static final RegistryObject<Item> DARK_OAK_DRAWER = block(DrawerModBlocks.DARK_OAK_DRAWER);
	public static final RegistryObject<Item> MANGROVE_DRAWER = block(DrawerModBlocks.MANGROVE_DRAWER);
	public static final RegistryObject<Item> CRIMSON_DRAWER = block(DrawerModBlocks.CRIMSON_DRAWER);
	public static final RegistryObject<Item> WARPED_DRAWER = block(DrawerModBlocks.WARPED_DRAWER);
	public static final RegistryObject<Item> CHERRY_DRAWER = block(DrawerModBlocks.CHERRY_DRAWER);
	public static final RegistryObject<Item> STRIPPED_OAK_DRAWER = block(DrawerModBlocks.STRIPPED_OAK_DRAWER);
	public static final RegistryObject<Item> STRIPPED_SPRUCE_DRAWER = block(DrawerModBlocks.STRIPPED_SPRUCE_DRAWER);
	public static final RegistryObject<Item> STRIPPED_BIRCH_DRAWER = block(DrawerModBlocks.STRIPPED_BIRCH_DRAWER);
	public static final RegistryObject<Item> STRIPPED_JUNGLE_DRAWER = block(DrawerModBlocks.STRIPPED_JUNGLE_DRAWER);
	public static final RegistryObject<Item> STRIPPED_ACACIA_DRAWER = block(DrawerModBlocks.STRIPPED_ACACIA_DRAWER);
	public static final RegistryObject<Item> STRIPPED_DARK_OAK_DRAWER = block(DrawerModBlocks.STRIPPED_DARK_OAK_DRAWER);
	public static final RegistryObject<Item> STRIPPED_MANGROVE_DRAWER = block(DrawerModBlocks.STRIPPED_MANGROVE_DRAWER);
	public static final RegistryObject<Item> STRIPPED_CRIMSON_DRAWER = block(DrawerModBlocks.STRIPPED_CRIMSON_DRAWER);
	public static final RegistryObject<Item> STRIPPED_WARPED_DRAWER = block(DrawerModBlocks.STRIPPED_WARPED_DRAWER);
	public static final RegistryObject<Item> STRIPPED_CHERRY_DRAWER = block(DrawerModBlocks.STRIPPED_CHERRY_DRAWER);
	public static final RegistryObject<Item> SCREW = REGISTRY.register("screw", () -> new ScrewItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
