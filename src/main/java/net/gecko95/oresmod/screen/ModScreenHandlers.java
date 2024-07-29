package net.gecko95.oresmod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.gecko95.oresmod.OresMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<CarvingScreenHandler> CARVING_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(OresMod.MOD_ID, "carving"),
                    new ExtendedScreenHandlerType<>(CarvingScreenHandler::new));

    public static void registerScreenHandlers(){
        OresMod.LOGGER.info("Registering Screen Handlers for " + OresMod.MOD_ID);
    }
}
