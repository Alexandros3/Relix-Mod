package net.snooper.relixmod;

import net.fabricmc.api.ModInitializer;
import net.snooper.relixmod.block.ModBlocks;
import net.snooper.relixmod.items.ModItems;
import net.snooper.relixmod.particle.ModParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RelixMod implements ModInitializer {
	public static final String MOD_ID = "relixmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModParticles.registerParticles();
	}
}
