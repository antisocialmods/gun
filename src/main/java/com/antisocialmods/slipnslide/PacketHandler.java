package com.antisocialmods.slipnslide;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.util.ResourceLocation;

public class PacketHandler {
    private static final String PROTOCOL_VERSION = "1";

    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
        new ResourceLocation("slipnslide", "movement"),
        () -> PROTOCOL_VERSION
    );

    public static void handle(MyMessage msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {

        });
    }
}
