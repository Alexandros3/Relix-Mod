package net.snooper.relixmod.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.snooper.relixmod.RelixMod;
import net.snooper.relixmod.particle.custom.AlexandriteParticle;

public class ModParticles {
    public static final DefaultParticleType ALEXANDRITE_PARTICLE = FabricParticleTypes.simple();
    public  static  final DefaultParticleType ALEXANDRITE_TURQ_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles(){
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(RelixMod.MOD_ID, "alexandrite_particle"),
                ALEXANDRITE_PARTICLE);

        Registry.register(Registry.PARTICLE_TYPE, new Identifier(RelixMod.MOD_ID, "alexandrite_particle_turq"),
                ALEXANDRITE_TURQ_PARTICLE);
    }
}
