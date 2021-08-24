package com.github.joonsauce.Blocky;
import com.github.joonsauce.Blocky.init.ModItemGroups;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


@EventBusSubscriber(modid = "blocky", bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				setup(new Item(new Item.Properties().tab(ModItemGroups.MOD_ITEM_GROUP)), "test_item")
			);
	}
	
	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(								
				setup(new Block(AbstractBlock.Properties.of(Material.STONE).strength(3.0F, 3.0F)), "test_block")
			);
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation("blocky", name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
	
}