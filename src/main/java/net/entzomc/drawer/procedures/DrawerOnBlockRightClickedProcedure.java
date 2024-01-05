package net.entzomc.drawer.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.BlockPos;

import net.entzomc.drawer.init.DrawerModSounds;

public class DrawerOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), DrawerModSounds.DRAWER_OPEN, SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, DrawerModSounds.DRAWER_OPEN, SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
