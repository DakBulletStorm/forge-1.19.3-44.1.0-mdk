package com.devbulletstorm.mau.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAU_TAB = new CreativeModeTab("mautab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SPEAR.get());
        }
    };
}
