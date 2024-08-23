package mod.hullrecoverable;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.combat.ShipHullSpecAPI;
import com.fs.starfarer.api.combat.ShipHullSpecAPI.ShipTypeHints;


public class HullRecoverableModPlugin extends BaseModPlugin {

    public void onGameLoad(boolean newGame) {
        for(ShipHullSpecAPI shipHull: Global.getSettings().getAllShipHullSpecs()){
            if(shipHull.getHints().contains(ShipTypeHints.UNBOARDABLE)){
                if(!shipHull.getHints().contains(ShipTypeHints.STATION)){
                    shipHull.addTag("auto_rec");
                }
            }
        }
    }
}
