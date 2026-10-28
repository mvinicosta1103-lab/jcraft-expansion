package com.jcraftexpansion.common.register;

import com.jcraftexpansion.JCraftExpansion;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.arna.jcraft.api.JRegistries;
import net.arna.jcraft.api.stand.StandType;

public interface StandTypeRegistry {
    DeferredRegister<StandType> REGISTRY = DeferredRegister.create(JCraftExpansion.MOD_ID, JRegistries.STAND_TYPE_REGISTRY_KEY);

    RegistrySupplier<StandType> EXAMPLE_STAND = REGISTRY.register(JCraftExpansion.id("example_stand"), () ->
            StandType.of(JCraftExpansion.id("example_stand"), EntityTypeRegistry.EXAMPLE_STAND));
}
