package net.thep2wking.oedldoedlresources.config.categories;

import net.minecraftforge.common.config.Config;

public class World {
	@Config.Name("Enable Overworld World Gen")
	public boolean OVERWORLD_WORLD_GEN = true;

	@Config.Name("Enable Nether World Gen")
	public boolean NETHER_WORLD_GEN = true;

	@Config.Name("Enable End World Gen")
	public boolean END_WORLD_GEN = true;

	@Config.Name("overworld")
	public final Overworld OVERWORLD = new Overworld();

	@Config.Name("nether")
	public final Nether NETHER = new Nether();

	@Config.Name("end")
	public final End END = new End();

	public static class Overworld {
		@Config.Name("Base Ore")
		public boolean BASE_ORE = false;

		@Config.Name("Base Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int BASE_ORE_CHANCE = 7;

		@Config.Name("Base Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int BASE_ORE_VEIN_SIZE = 6;

		@Config.Name("Oedldoedl Ore")
		public boolean OEDLDOEDL_ORE = true;

		@Config.Name("Oedldoedl Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int OEDLDOEDL_ORE_CHANCE = 5;

		@Config.Name("Oedldoedl Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int OEDLDOEDL_ORE_VEIN_SIZE = 3;

		@Config.Name("Randomite Ore")
		public boolean RANDOMITE_ORE = true;

		@Config.Name("Randomite Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int RANDOMITE_ORE_CHANCE = 5;
		
		@Config.Name("Randomite Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int RANDOMITE_ORE_VEIN_SIZE = 5;

		@Config.Name("Uranium Powder Ore")
		public boolean URANIUM_POWDER_ORE = true;

		@Config.Name("Uranium Powder Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int URANIUM_POWDER_ORE_CHANCE = 1;
		
		@Config.Name("Uranium Powder Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int URANIUM_POWDER_ORE_VEIN_SIZE = 3;

		@Config.Name("Ender Ore")
		public boolean ENDER_ORE = true;

		@Config.Name("Ender Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int ENDER_ORE_CHANCE = 3;

		@Config.Name("Ender Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int ENDER_ORE_VEIN_SIZE = 4;

		@Config.Name("Gunpowder Ore")
		public boolean GUNPOWDER_ORE = true;

		@Config.Name("Gunpowder Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int GUNPOWDER_ORE_CHANCE = 8;

		@Config.Name("Gunpowder Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int GUNPOWDER_ORE_VEIN_SIZE = 7;

		@Config.Name("Salt Ore")
		public boolean SALT_ORE = true;

		@Config.Name("Salt Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int SALT_ORE_CHANCE = 12;

		@Config.Name("Salt Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int SALT_ORE_VEIN_SIZE = 14;

		@Config.Name("Cookie Ore")
		public boolean COOKIE_ORE = true;

		@Config.Name("Cookie Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int COOKIE_ORE_CHANCE = 11;

		@Config.Name("Cookie Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int COOKIE_ORE_VEIN_SIZE = 10;
	}

	public static class Nether {
		@Config.Name("Gremorium Ore")
		public boolean GREMORIUM_ORE = true;

		@Config.Name("Gremorium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int GREMORIUM_ORE_CHANCE = 3;

		@Config.Name("Gremorium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int GREMORIUM_ORE_VEIN_SIZE = 3;

		@Config.Name("Himejimarium Ore")
		public boolean HIMEJIMARIUM_ORE = true;

		@Config.Name("Himejimarium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int HIMEJIMARIUM_ORE_CHANCE = 3;

		@Config.Name("Himejimarium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int HIMEJIMARIUM_ORE_VEIN_SIZE = 3;

		@Config.Name("Toujourium Ore")
		public boolean TOUJOURIUM_ORE = true;

		@Config.Name("Toujourium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int TOUJOURIUM_ORE_CHANCE = 3;

		@Config.Name("Toujourium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int TOUJOURIUM_ORE_VEIN_SIZE = 3;

		@Config.Name("Argentorium Ore")
		public boolean ARGENTORIUM_ORE = true;

		@Config.Name("Argentorium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int ARGENTORIUM_ORE_CHANCE = 3;

		@Config.Name("Argentorium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int ARGENTORIUM_ORE_VEIN_SIZE = 3;

		@Config.Name("Quartarium Ore")
		public boolean QUARTARIUM_ORE = true;

		@Config.Name("Quartarium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int QUARTARIUM_ORE_CHANCE = 3;

		@Config.Name("Quartarium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int QUARTARIUM_ORE_VEIN_SIZE = 3;

		@Config.Name("Nagatorium Ore")
		public boolean NAGATORIUM_ORE = true;

		@Config.Name("Nagatorium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int NAGATORIUM_ORE_CHANCE = 3;

		@Config.Name("Nagatorium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int NAGATORIUM_ORE_VEIN_SIZE = 3;

		@Config.Name("Sakurajimarium Ore")
		public boolean SAKURAJIMARIUM_ORE = true;

		@Config.Name("Sakurajimarium Ore Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int SAKURAJIMARIUM_ORE_CHANCE = 3;

		@Config.Name("Sakurajimarium Ore Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int SAKURAJIMARIUM_ORE_VEIN_SIZE = 3;
	}

	public static class End {
		@Config.Name("Element OD")
		public boolean ELEMENT_OD = true;

		@Config.Name("Element OD Chance")
		@Config.RangeInt(min = 0, max = 100)
		public int ELEMENT_OD_CHANCE = 6;

		@Config.Name("Element OD Vein Size")
		@Config.RangeInt(min = 0, max = 100)
		public int ELEMENT_OD_ORE_VEIN_SIZE = 3;
	}
}