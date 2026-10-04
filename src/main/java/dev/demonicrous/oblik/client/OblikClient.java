package dev.demonicrous.oblik.client;

import dev.demonicrous.oblik.Oblik;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

/** Client-only entry point; never loaded on a dedicated server. */
@Mod(value = Oblik.MOD_ID, dist = Dist.CLIENT)
public final class OblikClient {
    public OblikClient(IEventBus modEventBus) {
        modEventBus.addListener(this::onClientSetup);
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        Oblik.LOGGER.info("Oblik client initialization complete.");
    }
}
