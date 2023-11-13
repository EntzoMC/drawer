
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.entzomc.drawer.init;

import net.entzomc.drawer.procedures.DrawerOnGuiClosedProcedure;
import net.entzomc.drawer.procedures.DrawerOnBlockRightClickedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class DrawerModProcedures {
	public static void load() {
		new DrawerOnBlockRightClickedProcedure();
		new DrawerOnGuiClosedProcedure();
	}
}
