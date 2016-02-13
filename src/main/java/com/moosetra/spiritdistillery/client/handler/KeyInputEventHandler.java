package com.moosetra.spiritdistillery.client.handler;

import com.moosetra.spiritdistillery.client.settings.Keybindings;
import com.moosetra.spiritdistillery.reference.Key;
import com.moosetra.spiritdistillery.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
   private static Key getPressedKeyBinding()
   {
       if (Keybindings.smellandtaste.isPressed())
       {
           return Key.SMELLANDTASTE;
       }
      // else if (Keybindings.Other ones i make.isPressed())
      // {
      //     return Key.Other ones i make
      // }

       return Key.UNKNOWN;
   }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
   {
       LogHelper.info(getPressedKeyBinding());
   }
}
