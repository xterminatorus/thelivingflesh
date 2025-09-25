package net.magik.flesh.modid;

import net.fabricmc.api.ModInitializer;

import net.magik.flesh.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheLivingFlesh implements ModInitializer {
	public static final String MOD_ID = "the-living-flesh";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();

	}
}