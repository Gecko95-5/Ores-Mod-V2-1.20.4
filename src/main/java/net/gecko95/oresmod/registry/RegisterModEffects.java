package net.gecko95.oresmod.registry;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
// Done with the help:
// https://github.com/TriQue06/mythic-upgrades-1.20.x/tree/main/src/main (MIT License)
public class RegisterModEffects {
    public static void registerEffect(StatusEffect effect, String name){
        Registry.register(Registries.STATUS_EFFECT, new Identifier(OresMod.MOD_ID,name),effect);
    }
    public static void registerEffects(){
        registerEffect(ModEffects.FROSTBITE,"frostbite");
        registerEffect(ModEffects.HEAT_STROKE,"heat_stroke");
        registerEffect(ModEffects.FATAL_POISON,"fatal_poison");
        registerEffect(ModEffects.VOID_SICKNESS,"void_sickness");
        registerEffect(ModEffects.DECREASE_HEALTH,"decrease_health");
    }
}
