package com.devbulletstorm.mau.item;

import com.devbulletstorm.mau.Minecraft_Anime_Ultimate;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Minecraft_Anime_Ultimate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MINECRAFT_ANIME_ULTIMATE_TAB;

    @SubscribeEvent
    public static void  registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MINECRAFT_ANIME_ULTIMATE_TAB = event.registerCreativeModeTab(new ResourceLocation(Minecraft_Anime_Ultimate.MOD_ID, "minecraft_anime_ultimate_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SPEAR.get()))
                        .title(Component.translatable("creativemodetab.minecraft_anime_ultimate_tab")));
    }
}
