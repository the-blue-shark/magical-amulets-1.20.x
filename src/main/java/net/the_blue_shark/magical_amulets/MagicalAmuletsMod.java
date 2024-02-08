package net.the_blue_shark.magical_amulets;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicalAmuletsMod implements ModInitializer {
	public static final String MOD_ID = "magical_amulets";
    public static final Logger LOGGER = LoggerFactory.getLogger("magical_amulets");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hey Woutertje!");
	}
}