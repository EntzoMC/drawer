/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.entzomc.drawer;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import net.entzomc.drawer.init.DrawerModTabs;
import net.entzomc.drawer.init.DrawerModSounds;
import net.entzomc.drawer.init.DrawerModProcedures;
import net.entzomc.drawer.init.DrawerModPaintings;
import net.entzomc.drawer.init.DrawerModMenus;
import net.entzomc.drawer.init.DrawerModItems;
import net.entzomc.drawer.init.DrawerModBlocks;
import net.entzomc.drawer.init.DrawerModBlockEntities;

public class DrawerMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "drawer";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing DrawerMod");

		DrawerModTabs.load();

		DrawerModBlocks.load();
		DrawerModItems.load();
		DrawerModBlockEntities.load();

		DrawerModPaintings.load();
		DrawerModProcedures.load();

		DrawerModMenus.load();

		DrawerModSounds.load();

	}
}
