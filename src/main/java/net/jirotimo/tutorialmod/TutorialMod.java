package net.jirotimo.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.jirotimo.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//very important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "Tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}