package dev.demonicrous.oblik;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(Oblik.MOD_ID)
public final class Oblik {
    public static final String MOD_ID = "oblik";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Oblik(IEventBus modEventBus) {
        modEventBus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Oblik common initialization complete.");
    }
}
