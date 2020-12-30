package com.squaaadtech.malifence.mixin;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import com.squaaadtech.malifence.Malifence;

@Mixin(AbstractBlock.class)

// i really have no fuckin idea how or if this works


public class BedrockModifier {
    float effectiveHardness = 50F;
    boolean useEffectiveModifier = false;
    ImmutableSet<Identifier> bedrockBreakerIDs = ImmutableSet.of(new Identifier(Malifence.MOD_ID, "diamidian_pickaxe"));

    @Inject(at = @At(value = "INVOKE_ASSIGN", shift = At.Shift.AFTER),
            method = "calcBlockBreakingDelta(" +
                    "Lnet/minecraft/block/BlockState;" +
                    "Lnet/minecraft/entity/player/PlayerEntity;" +
                    "Lnet/minecraft/world/BlockView;" +
                    "Lnet/minecraft/util/math/BlockPos;)F",
            cancellable = true, // This is an early-return Mixin.
            locals = LocalCapture.CAPTURE_FAILSOFT
    )
    public void allowBedrockBreaking(BlockState state, PlayerEntity player, BlockView world, BlockPos pos, CallbackInfoReturnable<Float> info, float hardness) {
        ItemStack stackInHand = player.getStackInHand(Hand.MAIN_HAND);

        if (hardness == -1.0F && bedrockBreakerIDs.contains(Registry.ITEM.getId(stackInHand.getItem()))) {
            // Pretend hardness is the value in the config (50F by default, like obsidian),
            // and calculate the effective tool multiplier, same as Mojang code.

            // Note that by default this just means that everything that can break bedrock will break it at 30% regular
            // speed, since only the Bedrock Pickaxe overrides the effective tool code.

            // We don't override player.getBlockBreakingSpeed, that's also handled by the pickaxe item itself,
            // plus it's affected by potion effects and enchantments.

            info.setReturnValue(player.getBlockBreakingSpeed(state) / effectiveHardness / ((player.isUsingEffectiveTool(state) || !useEffectiveModifier) ? 30 : 100));
        }
    }
}