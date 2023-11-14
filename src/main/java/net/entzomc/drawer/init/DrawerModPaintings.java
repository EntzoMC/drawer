
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.entzomc.drawer.DrawerMod;

public class DrawerModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DrawerMod.MODID);
	public static final RegistryObject<PaintingVariant> OAK_DRAWER_PAINTING = REGISTRY.register("oak_drawer_painting", () -> new PaintingVariant(32, 32));
}
