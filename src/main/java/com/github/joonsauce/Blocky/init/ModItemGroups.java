package com.github.joonsauce.Blocky.init;

import java.util.function.Supplier;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.registries.ObjectHolder;

public class ModItemGroups {
	
	public static class ModItemGroup extends ItemGroup{

		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		public ItemStack makeIcon() {
			return iconSupplier.get();
		}
		
	}
	
	@ObjectHolder("blocky")
	public static class ModItems {
		public final static Item TEST_ITEM = null;
		public final static Item TEST_BLOCK = null;
	}
	
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup("blocky", () -> new ItemStack(Items.LIGHT_BLUE_BANNER));
	
}
