package io.github.mod

import com.mojang.logging.LogUtils
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import org.slf4j.Logger

@Mod(ExampleMod.MODID)
class ExampleMod(modEventBus: IEventBus?, modContainer: ModContainer?) {
    companion object {
        const val MODID: String = "examplemod"
        private val LOGGER: Logger = LogUtils.getLogger()
    }
}
