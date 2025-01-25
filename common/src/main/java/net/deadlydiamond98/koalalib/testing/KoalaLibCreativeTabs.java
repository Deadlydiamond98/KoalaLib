package net.deadlydiamond98.koalalib.testing;

import net.deadlydiamond98.koalalib.KoalaLib;
import net.deadlydiamond98.koalalib.util.registry_tools.MultiModRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class KoalaLibCreativeTabs {
    public static final Supplier<CreativeModeTab> TEST_TAB = MultiModRegistries.registerCreativeTab(new ResourceLocation(KoalaLib.MOD_ID, "test_tab"),
            () -> Blocks.AMETHYST_BLOCK.asItem().getDefaultInstance(), "test.test.test");

    public static void register() {

    }
}
