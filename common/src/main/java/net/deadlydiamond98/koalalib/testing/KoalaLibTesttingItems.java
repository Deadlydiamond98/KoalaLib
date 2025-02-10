package net.deadlydiamond98.koalalib.testing;

import net.deadlydiamond98.koalalib.testing.objs.TestttingItem;
import net.deadlydiamond98.koalalib.util.registry_tools.MultiModRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.deadlydiamond98.koalalib.KoalaLib;
import java.util.function.Supplier;

public class KoalaLibTesttingItems {

    public static final Supplier<Item> TEST = MultiModRegistries.registerItem(new ResourceLocation(KoalaLib.MOD_ID, "test"),
            () -> new TestttingItem(new Item.Properties()));

    public static void register() {
        KoalaLib.LOGGER.info("TEST");
    }
}
