package org.infernalstudios.archeryexp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcheryExpansion {

    public static final String MOD_ID = "archeryexp";
    public static final String MOD_NAME = "Archery Expansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {


        LOGGER.info("Finished Loading " + MOD_NAME);
    }
}