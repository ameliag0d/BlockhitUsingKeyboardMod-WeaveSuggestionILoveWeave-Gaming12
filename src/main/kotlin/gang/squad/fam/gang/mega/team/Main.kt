package gang.squad.fam.gang.mega.team

import net.minecraft.client.Minecraft
import net.minecraft.client.settings.KeyBinding
import net.weavemc.loader.api.ModInitializer
import net.weavemc.loader.api.event.EventBus
import net.weavemc.loader.api.event.KeyboardEvent
import net.weavemc.loader.api.event.StartGameEvent
import net.weavemc.loader.api.event.SubscribeEvent
import org.lwjgl.input.Keyboard

class Main: ModInitializer {
    private var key = KeyBinding("BlockHit", Keyboard.KEY_V, "Legit Lit Block Kit")

    override fun preInit() {
        EventBus.subscribe(StartGameEvent::class.java, this::registerNullyBooleans)
    }
    
    private fun registerNullyBooleans(event: StartGameEvent) {
        Minecraft.getMinecraft().gameSettings.keyBindings += key
    }
    
    @SubscribeEvent
    fun onKeyPress(e: KeyboardEvent) {
        if(Keyboard.getEventKey() == key.getKeyCode() && e.keyState) {
            KeyBinding.onTick(Minecraft.getMinecraft().gameSettings.keyBindUseItem.keyCode)
        }
    }
}