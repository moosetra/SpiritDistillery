package com.moosetra.spiritdistillery.proxy;

import com.moosetra.spiritdistillery.client.settings.Keybindings;
import com.moosetra.spiritdistillery.reference.Names;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.smellandtaste);
    }
}
