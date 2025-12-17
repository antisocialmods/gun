package com.myname.mymodid;
import org.lwjgl.input.Keyboard;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Keybinds {
    public static KeyBinding crouchSlideKey;
    public static KeyBinding reloadKey;
    public static KeyBinding weaponModeKey;
    public static KeyBinding dolphinDiveKey;
    public static KeyBinding changeSightKey;

    // use codechickenlib for network io and possibly obj rendering if taking it from hbm doesnt work out
    // remeber to use jni to link to libflextrace so we can profile ourselves

    public static void register() {
        // make new keybin
        reloadKey = new KeyBinding("key.mymod.reload", Keyboard.KEY_R, "movement controls");
        ClientRegistry.registerKeyBinding(reloadKey);

        weaponModeKey = new KeyBinding("key.mymod.weaponmode", Keyboard.KEY_V, "movement controls");
        ClientRegistry.registerKeyBinding(weaponModeKey);

        dolphinDiveKey = new KeyBinding("key.mymod.dolphindive", Keyboard.KEY_X, "movement controls");
        ClientRegistry.registerKeyBinding(dolphinDiveKey);

        crouchSlideKey = new KeyBinding("key.mymod.crouchslide", Keyboard.KEY_C, "movement controls");
        ClientRegistry.registerKeyBinding(crouchSlideKey);

        changeSightKey = new KeyBinding("key.mymod.changesight", Keyboard.KEY_T, "movement controls");
        ClientRegistry.registerKeyBinding(changeSightKey);

    }
}
