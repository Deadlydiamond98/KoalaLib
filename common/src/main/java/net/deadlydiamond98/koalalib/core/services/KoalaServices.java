package net.deadlydiamond98.koalalib.core.services;

import net.deadlydiamond98.koalalib.KoalaLib;

import java.util.ServiceLoader;

public class KoalaServices {

    public static final KoalaPlatformHelper PLATFORM = load(KoalaPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        KoalaLib.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}