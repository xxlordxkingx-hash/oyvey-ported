package me.alpha432.oyvey.features.modules.player;

import me.alpha432.oyvey.features.modules.Module;

public class FastPlaceModule extends Module {
    public FastPlaceModule() {
        super("FastPlace", "Removes right-click delay", Category.PLAYER);
    }

    @Override
    public void onTick() {
        if (nullCheck()) return;

        mc.rightClickDelay = 0;
    }
}
