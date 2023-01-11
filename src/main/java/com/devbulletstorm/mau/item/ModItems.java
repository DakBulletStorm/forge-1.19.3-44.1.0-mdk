package com.devbulletstorm.mau.item;

import com.devbulletstorm.mau.Minecraft_Anime_Ultimate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Minecraft_Anime_Ultimate.MOD_ID);

    public static final RegistryObject<Item> SPEAR = ITEMS.register("spear",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
