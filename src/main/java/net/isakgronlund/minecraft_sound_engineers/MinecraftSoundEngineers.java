package net.isakgronlund.minecraft_sound_engineers;

import net.minecraft.block.Block;
import net.minecraft.world.item.BlockItem;
import org.intellij.lang.annotations.Identifier;

import java.rmi.registry.Registry;

public class MinecraftSoundEngineers implements ModInitialiser {
    public static final Block MY_BLOCK = new Block(Block.settings.of(Material.METAL))

    @Override
    public void onInitialise() {
        Registry.register(Registry.BLOCK, new Identifier("MinecraftSoundEngineers.MODID", "my_block"), MY_BLOCK)
        Registry.register(Registry.ITEM, new Identifier("MinecraftSoundEngineers.MODID", "my_block"), new BlockItem(MY_BLOCK, new Item.Settings)
    }
}

