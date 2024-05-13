package io.github.mod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;

@net.neoforged.fml.common.Mod(Mod.MODID)
public class Mod {
    public static final String MODID = "mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mod(IEventBus modEventBus, ModContainer modContainer) {

    }
}
