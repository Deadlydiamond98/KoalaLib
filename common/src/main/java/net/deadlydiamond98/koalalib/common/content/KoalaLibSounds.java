package net.deadlydiamond98.koalalib.common.content;

import net.deadlydiamond98.koalalib.KoalaLib;
import net.deadlydiamond98.koalalib.common.registration.MultiModRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

/**
 * This Class consists purely of sounds that I'll be reusing in my projects at least more than once, or sounds that I
 * feel are useful enough to warrant being here, such as the legacy console gui sounds.
 */

public class KoalaLibSounds {

    // LEGACY CONSOLE SOUNDS

    public static final Supplier<SoundEvent> CONSOLE_BACK = registerSoundEvent("back");
    public static final Supplier<SoundEvent> CONSOLE_CRAFT = registerSoundEvent("craft");
    public static final Supplier<SoundEvent> CONSOLE_CRAFT_FAIL = registerSoundEvent("craftfail");
    public static final Supplier<SoundEvent> CONSOLE_FOCUS = registerSoundEvent("focus");
    public static final Supplier<SoundEvent> CONSOLE_PRESS = registerSoundEvent("press");
    public static final Supplier<SoundEvent> CONSOLE_SCROLL = registerSoundEvent("scroll");

    // APRIL FOOLS

    public static final Supplier<SoundEvent> BAGEL = registerSoundEvent("bagel");

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        return MultiModRegistries.registerSound(new ResourceLocation(KoalaLib.MOD_ID, name),
                () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(KoalaLib.MOD_ID, name)));
    }

    public static void register() {}
}
