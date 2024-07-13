package stone.dragoncookie.mixins;

import java.util.Collection;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.end.DragonFightManager;

@Mixin(DragonFightManager.class)
public abstract class DragonFightManagerMixin {
    @Redirect(method = "tick()V", at = @At(ordinal = 0, value = "INVOKE", target = "Ljava/util/Collection;isEmpty()Z", remap = false))
    public boolean onPlayerCheck(Collection<EntityPlayerMP> players) {
        return false;
    }
}
