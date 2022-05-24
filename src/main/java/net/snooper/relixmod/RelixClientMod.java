package net.snooper.relixmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import net.snooper.relixmod.block.ModBlocks;
import net.snooper.relixmod.particle.ModParticles;
import net.snooper.relixmod.particle.custom.AlexandriteParticle;
import net.snooper.relixmod.particle.custom.AlexandriteParticleTurq;


public class RelixClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier(RelixMod.MOD_ID, "particle/alexandrite"));
        }));

        ParticleFactoryRegistry.getInstance().register(ModParticles.ALEXANDRITE_PARTICLE, AlexandriteParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.ALEXANDRITE_TURQ_PARTICLE, AlexandriteParticleTurq.Factory::new);
    }
}