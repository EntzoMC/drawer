
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class DrawerModSounds {
	public static SoundEvent DRAWER_OPEN = SoundEvent.createVariableRangeEvent(new ResourceLocation("drawer", "drawer_open"));
	public static SoundEvent DRAWER_CLOSE = SoundEvent.createVariableRangeEvent(new ResourceLocation("drawer", "drawer_close"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("drawer", "drawer_open"), DRAWER_OPEN);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("drawer", "drawer_close"), DRAWER_CLOSE);
	}
}
