
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.entzomc.drawer.DrawerMod;

public class DrawerModTabs {
	public static ResourceKey<CreativeModeTab> TAB_DRAWER = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DrawerMod.MODID, "drawer"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DRAWER, FabricItemGroup.builder().title(Component.translatable("item_group." + DrawerMod.MODID + ".drawer")).icon(() -> new ItemStack(DrawerModBlocks.OAK_DRAWER)).build());
	}
}
