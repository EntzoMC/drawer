
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.entzomc.drawer.DrawerMod;

public class DrawerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrawerMod.MODID);
	public static final RegistryObject<CreativeModeTab> DRAWER = REGISTRY.register("drawer",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.drawer.drawer")).icon(() -> new ItemStack(DrawerModBlocks.OAK_DRAWER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DrawerModBlocks.OAK_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.SPRUCE_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.BIRCH_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.JUNGLE_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.ACACIA_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.DARK_OAK_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.MANGROVE_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.CRIMSON_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.WARPED_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.CHERRY_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_OAK_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_SPRUCE_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_BIRCH_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_JUNGLE_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_ACACIA_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_DARK_OAK_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_MANGROVE_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_CRIMSON_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_WARPED_DRAWER.get().asItem());
				tabData.accept(DrawerModBlocks.STRIPPED_CHERRY_DRAWER.get().asItem());
				tabData.accept(DrawerModItems.SCREW.get());
			})

					.build());
}
