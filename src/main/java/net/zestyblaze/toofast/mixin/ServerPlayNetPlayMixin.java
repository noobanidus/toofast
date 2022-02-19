package net.zestyblaze.toofast.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetPlayMixin {
    @ModifyConstant(method = "onPlayerMove", constant = @Constant(floatValue = 100.0F))
    private float toofast_PlayerMaxSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    @ModifyConstant(method = "onPlayerMove", constant = @Constant(floatValue = 300.0F))
    private float toofast_ElytraMaxSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    @ModifyConstant(method = "onVehicleMove", constant = @Constant(doubleValue = 100.0))
    private double toofast_VehicleMaxSpeed(double speed) {
        return Double.MAX_VALUE;
    }
}
