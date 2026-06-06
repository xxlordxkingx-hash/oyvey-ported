package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.modules.Module;

public class ReverseStepModule extends Module {
    public ReverseStepModule() {
        super("FastDownStairs", "Instantly Jumps Down The Stairs Fast:)", Category.MOVEMENT);
    }

    @Override
    public void onTick() {
        if (nullCheck()) return;
        if (mc.player.isInLava() || mc.player.isInWater() || !mc.player.onGround()) return;
        mc.player.push(0, -1, 0);
    }
}
