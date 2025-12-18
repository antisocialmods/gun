package com.myname.mymodid;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;

public class ClientEventHandler {
    private int placeholder;

    public ClientEventHandler() {
        placeholder = 1337;
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(InputEvent.KeyInputEvent event) {
        //debug
        //System.out.println("DolphinDive key event: " + event);

        for (KeyBinding key: Keybinds.keybinds) {
            if (key.isPressed()) {
                System.out.println(key);

                switch (key.getKeyDescription()) {
                    case "key.mymod.crouchslide":
                        System.out.println("this is crouch slide");
                        break;
                    case "key.mymod.reload":
                        System.out.println("this is reload");
                        break;
                    case "key.mymod.weaponmode":
                        System.out.println("this is weaponmode");
                        break;
                    case "key.mymod.dolphindive":
                        System.out.println("this is dolphindive");
                        break;
                    case "key.mymod.changesight":
                        System.out.println("this is change sight");
                        break;

                }
            }

        }

    }
}
