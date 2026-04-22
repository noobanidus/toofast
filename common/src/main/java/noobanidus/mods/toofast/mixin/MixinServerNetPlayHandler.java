package noobanidus.mods.toofast.mixin;

import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerGamePacketListenerImpl.class)
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