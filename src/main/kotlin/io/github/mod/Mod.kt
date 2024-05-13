package io.github.mod

import com.mojang.logging.LogUtils
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import org.slf4j.Logger

@net.neoforged.fml.common.Mod(Mod.MODID)
class Mod(modEventBus: IEventBus?, modContainer: ModContainer?) {
    companion object {
        const val MODID: String = "mod"
        private val LOGGER: Logger = LogUtils.getLogger()
    }
}
