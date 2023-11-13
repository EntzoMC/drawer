
package net.entzomc.drawer.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.entzomc.drawer.init.DrawerModTabs;

public class ScrewItem extends Item {
	public ScrewItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(DrawerModTabs.TAB_DRAWER).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
