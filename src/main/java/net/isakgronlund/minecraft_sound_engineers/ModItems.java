package net.isakgronlund.minecraft_sound_engineers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    @ObjectHolder(ExampleMod.MODID + ":example_item")
    public static final Item EXAMPLE_ITEM = null;

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new Item(new Item.Properties().tab(CreativeModeTabs.TAB_MISC)).setRegistryName(ExampleMod.MODID, "example_item")
        );
    }
}
