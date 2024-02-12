package net.the_blue_shark.magical_amulets;

import net.fabricmc.api.ModInitializer;

import net.the_blue_shark.magical_amulets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicalAmuletsMod implements ModInitializer {
	public static final String MOD_ID = "magical_amulets";
    public static final Logger LOGGER = LoggerFactory.getLogger("magical_amulets");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("Hey Woutertje!");
	}
}