
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class DrawerModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == DrawerModBlocks.OAK_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.SPRUCE_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.BIRCH_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.JUNGLE_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.ACACIA_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.DARK_OAK_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.MANGROVE_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.CRIMSON_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.WARPED_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.CHERRY_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_OAK_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_SPRUCE_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.BIRCH_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_JUNGLE_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_ACACIA_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_DARK_OAK_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_MANGROVE_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_CRIMSON_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_WARPED_DRAWER.get().asItem())
			event.setBurnTime(400);
		else if (itemstack.getItem() == DrawerModBlocks.STRIPPED_CHERRY_DRAWER.get().asItem())
			event.setBurnTime(400);
	}
}
