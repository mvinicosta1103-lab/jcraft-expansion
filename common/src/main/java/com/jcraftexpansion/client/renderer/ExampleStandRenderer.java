package com.jcraftexpansion.client.renderer;

import com.jcraftexpansion.common.register.StandTypeRegistry;
import com.jcraftexpansion.common.stand.ExampleStandEntity;
import net.arna.jcraft.client.renderer.entity.stands.StandEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ExampleStandRenderer extends StandEntityRenderer<ExampleStandEntity> {
    public ExampleStandRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, StandTypeRegistry.EXAMPLE_STAND.get());
    }
}
