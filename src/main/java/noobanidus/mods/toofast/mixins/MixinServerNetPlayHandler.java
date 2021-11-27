package noobanidus.mods.toofast.mixins;

import net.minecraft.network.play.ServerPlayNetHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerPlayNetHandler.class)
public class MixinServerNetPlayHandler {
  @ModifyConstant(method = "handleMovePlayer", constant = @Constant(floatValue = 100.0F))
  private float toofast_PlayerMaxSpeed(float speed) {
    return Float.MAX_VALUE;
  }

  @ModifyConstant(method = "handleMovePlayer", constant = @Constant(floatValue = 300.0F))
  private float toofast_ElytraMaxSpeed(float speed) {
    return Float.MAX_VALUE;
  }

  @ModifyConstant(method = "handleMoveVehicle", constant = @Constant(doubleValue = 100.0))
  private double toofast_VehicleMaxSpeed(double speed) {
    return Double.MAX_VALUE;
  }
}
