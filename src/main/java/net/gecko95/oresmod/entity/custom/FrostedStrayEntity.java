package net.gecko95.oresmod.entity.custom;

import net.gecko95.oresmod.effect.ModEffects;
import net.gecko95.oresmod.item.ModItems;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.StrayEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;

public class FrostedStrayEntity extends StrayEntity {
    public FrostedStrayEntity(EntityType<? extends StrayEntity> entityType, World world) {
        super(entityType, world);
    }
    public static DefaultAttributeContainer.Builder createFrostedStrayAttributes(){
        return StrayEntity.createAbstractSkeletonAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 25.0)
                .add(EntityAttributes.GENERIC_ARMOR,5.0)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,0.4)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.2);
    }
    @Override
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        if (effect.getEffectType() == ModEffects.FROSTBITE) {
            return false;
        }
        return super.canHaveStatusEffect(effect);
    }
    @Override
    protected PersistentProjectileEntity createArrowProjectile(ItemStack arrow, float damageModifier) {
        PersistentProjectileEntity persistentProjectileEntity = super.createArrowProjectile(arrow, damageModifier);
        if (persistentProjectileEntity instanceof ArrowEntity) {
            ((ArrowEntity)persistentProjectileEntity).addEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1200,3));
        }
        return persistentProjectileEntity;
    }
    @Override
    protected void initEquipment(Random random, LocalDifficulty localDifficulty) {
        this.equipStack(EquipmentSlot.HEAD, new ItemStack(ModItems.FROSITE_HELMET_VISOR));
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.BOW));
        this.equipStack(EquipmentSlot.OFFHAND, new ItemStack(Items.SHIELD));
    }
    @Override
    public void equipStack(EquipmentSlot slot, ItemStack stack) {
        super.equipStack(slot, stack);
        if (!this.getWorld().isClient) {
            this.updateAttackType();
        }
    }
    @Override
    protected void updateEnchantments(Random random, LocalDifficulty localDifficulty) {
    }
    @Override
    public void tickMovement() {
        super.tickMovement();
        if (!this.getWorld().isClient) {
            if (this.getWorld().getBiome(this.getBlockPos()).isIn(ModTags.Biomes.FROSITE_COLD)) {
                this.heal(1.0f);
            }
        }
    }
}
