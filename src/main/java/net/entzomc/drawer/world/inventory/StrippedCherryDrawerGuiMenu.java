
package net.entzomc.drawer.world.inventory;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.Container;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.entzomc.drawer.procedures.DrawerOnGuiClosedProcedure;
import net.entzomc.drawer.procedures.DrawerOnBlockRightClickedProcedure;
import net.entzomc.drawer.init.DrawerModMenus;

import java.util.HashMap;

public class StrippedCherryDrawerGuiMenu extends AbstractContainerMenu {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private BlockPos pos;
	private final Container inventory;
	private boolean bound = false;

	public StrippedCherryDrawerGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		this(id, inv, new SimpleContainer(27));
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
	}

	public StrippedCherryDrawerGuiMenu(int id, Inventory inv, Container container) {
		super(DrawerModMenus.STRIPPED_CHERRY_DRAWER_GUI, id);
		this.entity = inv.player;
		this.world = inv.player.level();
		this.inventory = container;
		this.addSlot(new Slot(inventory, 0, 8, 17) {
			private final int slot = 0;
		});
		this.addSlot(new Slot(inventory, 1, 26, 17) {
			private final int slot = 1;
		});
		this.addSlot(new Slot(inventory, 2, 44, 17) {
			private final int slot = 2;
		});
		this.addSlot(new Slot(inventory, 3, 62, 17) {
			private final int slot = 3;
		});
		this.addSlot(new Slot(inventory, 4, 80, 17) {
			private final int slot = 4;
		});
		this.addSlot(new Slot(inventory, 5, 98, 17) {
			private final int slot = 5;
		});
		this.addSlot(new Slot(inventory, 6, 116, 17) {
			private final int slot = 6;
		});
		this.addSlot(new Slot(inventory, 7, 134, 17) {
			private final int slot = 7;
		});
		this.addSlot(new Slot(inventory, 8, 152, 17) {
			private final int slot = 8;
		});
		this.addSlot(new Slot(inventory, 9, 8, 35) {
			private final int slot = 9;
		});
		this.addSlot(new Slot(inventory, 10, 26, 35) {
			private final int slot = 10;
		});
		this.addSlot(new Slot(inventory, 11, 44, 35) {
			private final int slot = 11;
		});
		this.addSlot(new Slot(inventory, 12, 62, 35) {
			private final int slot = 12;
		});
		this.addSlot(new Slot(inventory, 13, 80, 35) {
			private final int slot = 13;
		});
		this.addSlot(new Slot(inventory, 14, 98, 35) {
			private final int slot = 14;
		});
		this.addSlot(new Slot(inventory, 15, 116, 35) {
			private final int slot = 15;
		});
		this.addSlot(new Slot(inventory, 16, 134, 35) {
			private final int slot = 16;
		});
		this.addSlot(new Slot(inventory, 17, 152, 35) {
			private final int slot = 17;
		});
		this.addSlot(new Slot(inventory, 18, 8, 53) {
			private final int slot = 18;
		});
		this.addSlot(new Slot(inventory, 19, 26, 53) {
			private final int slot = 19;
		});
		this.addSlot(new Slot(inventory, 20, 44, 53) {
			private final int slot = 20;
		});
		this.addSlot(new Slot(inventory, 21, 62, 53) {
			private final int slot = 21;
		});
		this.addSlot(new Slot(inventory, 22, 80, 53) {
			private final int slot = 22;
		});
		this.addSlot(new Slot(inventory, 23, 98, 53) {
			private final int slot = 23;
		});
		this.addSlot(new Slot(inventory, 24, 116, 53) {
			private final int slot = 24;
		});
		this.addSlot(new Slot(inventory, 25, 134, 53) {
			private final int slot = 25;
		});
		this.addSlot(new Slot(inventory, 26, 152, 53) {
			private final int slot = 26;
		});
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));

		DrawerOnBlockRightClickedProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean stillValid(Player player) {
		return this.inventory.stillValid(player);
	}

	@Override
	public ItemStack quickMoveStack(Player player, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 27) {
				if (!this.moveItemStackTo(itemstack1, 27, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 27, false)) {
				if (index < 27 + 27) {
					if (!this.moveItemStackTo(itemstack1, 27 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 27, 27 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.isEmpty())
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(player, itemstack1);
		}
		return itemstack;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);

		DrawerOnGuiClosedProcedure.execute(world, x, y, z);
	}

	public static void screenInit() {
	}
}
