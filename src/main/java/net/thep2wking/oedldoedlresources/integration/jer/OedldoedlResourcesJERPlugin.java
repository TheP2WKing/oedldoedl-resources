package net.thep2wking.oedldoedlresources.integration.jer;

import jeresources.api.drop.LootDrop;
import jeresources.api.restrictions.DimensionRestriction;
import jeresources.api.restrictions.Restriction;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;
import net.thep2wking.oedldoedlcore.api.integration.JERPlugin;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;

@JERPlugin
public class OedldoedlResourcesJERPlugin extends ModJERPluginBase {
	@Override
	public String getModId() {
		return OedldoedlResources.MODID;
	}

	@Override
	public void register() {
		if (ResourcesConfig.WORLD.OVERWORLD.BASE_ORE) {
			addOreGen(ModBlocks.BASE_ORE, ResourcesConfig.WORLD.OVERWORLD.BASE_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.BASE_ORE_CHANCE, 0, 128);
		}
		if (ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE) {
			addOreGen(ModBlocks.OEDLDOEDL_ORE, ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.OEDLDOEDL_ORE_CHANCE, 0, 10);
		}
		if (ResourcesConfig.WORLD.OVERWORLD.CATERIUM_ORE) {
			addOreGen(ModBlocks.CATERIUM_ORE, ResourcesConfig.WORLD.OVERWORLD.CATERIUM_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.CATERIUM_ORE_CHANCE, 8, 32);
		}
		if (ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE) {
			addOreGen(ModBlocks.RANDOMITE_ORE, ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.RANDOMITE_ORE_CHANCE, 0, 128);
		}
		if (ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE) {
			addOreGen(ModBlocks.URANIUM_POWDER_ORE, ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.URANIUM_POWDER_ORE_CHANCE, 12, 48,
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.URANIUM_POWDER, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE) {
			addOreGen(ModBlocks.ENDER_ORE, ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.ENDER_ORE_CHANCE, 10, 20,
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.ENDER_DUST, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE) {
			addOreGen(ModBlocks.GUNPOWDER_ORE, ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.GUNPOWDER_ORE_CHANCE, 40, 70,
					new LootDrop[] { new LootDrop(new ItemStack(Items.GUNPOWDER, 2, 0)) });
		}
		if (ResourcesConfig.WORLD.OVERWORLD.SALT_ORE) {
			addOreGen(ModBlocks.SALT_ORE, ResourcesConfig.WORLD.OVERWORLD.SALT_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.SALT_ORE_CHANCE, 0, 128,
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.SALT_DUST, 4, 0)) });
		}
		if (ResourcesConfig.WORLD.OVERWORLD.SULFUR_ORE) {
			addOreGen(ModBlocks.SULFUR_ORE, ResourcesConfig.WORLD.OVERWORLD.SULFUR_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.SULFUR_ORE_CHANCE, 0, 128,
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.SULFUR_DUST, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.OVERWORLD.NITER_ORE) {
			addOreGen(ModBlocks.NITER_ORE, ResourcesConfig.WORLD.OVERWORLD.NITER_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.NITER_ORE_CHANCE, 0, 128,
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.NITER_DUST, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE) {
			addOreGen(ModBlocks.COOKIE_ORE, ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE_VEIN_SIZE, ResourcesConfig.WORLD.OVERWORLD.COOKIE_ORE_CHANCE, 40, 128,
					new LootDrop[] { new LootDrop(new ItemStack(Items.COOKIE, 3, 0)) });
		}

		if (ResourcesConfig.WORLD.NETHER.GREMORIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_GREMORIUM_ORE, 7, 3, 0.0004f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.GREMORIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.HIMEJIMARIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_HIMEJIMARIUM_ORE, 14, 7, 0.0002f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.HIMEJIMARIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.TOUJOURIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_TOUJOURIUM_ORE, 17, 6, 0.0002f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.TOUJOURIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.ARGENTORIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_ARGENTORIUM_ORE, 8, 3, 0.0004f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.ARGENTORIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.QUARTARIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_QUARTARIUM_ORE, 8, 6, 0.0002f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.QUARTARIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.NAGATORIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_NAGATORIUM_ORE, 3, 2, 0.0003f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.NAGATORIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.SAKURAJIMARIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_SAKURAJIMARIUM_ORE, 7, 5, 0.0002f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.SAKURAJIMARIUM_SHARD, 1, 0)) });
		}
		if (ResourcesConfig.WORLD.NETHER.KITAGAWARIUM_ORE) {
			addSpikeOreGen(ModBlocks.NETHER_KITAGAWARIUM_ORE, 4, 1, 0.0006f, new Restriction(DimensionRestriction.NETHER),
					new LootDrop[] { new LootDrop(new ItemStack(ModItems.KITAGAWARIUM_SHARD, 1, 0)) });
		}

		if (ResourcesConfig.WORLD.END.ELEMENT_OD) {
			addSpikeOreGen(ModBlocks.END_ELEMENT_OD, 32, 32, 0.0001f, new Restriction(DimensionRestriction.END), new LootDrop[] {
				new LootDrop(new ItemStack(ModItems.TIMOFIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.FLOFINIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.LAARSIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.KLAARSIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.SHARANIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.MAKERIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.INDERIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.PUMARIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.CALLAXIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.SKORPIUM_FRAGMENT, 1, 0)),
				new LootDrop(new ItemStack(ModItems.STUPIDIUM_FRAGMENT, 1, 0))
			});
		}

		if (ResourcesConfig.WORLD.OVERWORLD.BACON_AGARIC_FLOWER) {
			addSpikeOreGen(ModBlocks.BACON_AGARIC, 70, 20, 0.0001f,
					new LootDrop[] { new LootDrop(new ItemStack(Items.PORKCHOP, 1, 0)) });
		}
	}
}