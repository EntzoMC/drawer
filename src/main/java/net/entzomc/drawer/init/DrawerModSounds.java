
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.entzomc.drawer.DrawerMod;

public class DrawerModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DrawerMod.MODID);
	public static final RegistryObject<SoundEvent> DRAWER_OPEN = REGISTRY.register("drawer_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("drawer", "drawer_open")));
	public static final RegistryObject<SoundEvent> DRAWER_CLOSE = REGISTRY.register("drawer_close", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("drawer", "drawer_close")));
}
