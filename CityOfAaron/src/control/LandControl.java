package control;

import Exceptions.GameControlException;
import Exceptions.LandControlException;

/**
 *
 * @author Jeremy
 */
public class LandControl {

    public static int getCurrentLandPrice() {
        int low = 17;
        int high = 27;

        int priceOfLand = 0;

        try {
            priceOfLand = GameControl.getRandomNumber(low, high);
        } catch (GameControlException gce) {
            System.out.println(gce.getMessage());
        }
        return priceOfLand;
    }

    public static int getBushelsForLand(int acres, int bushelsPerAcre)
            throws LandControlException {
        if (acres < 0) {
            throw new LandControlException("Number of acres cannot be less than 0.");
        }

        if (bushelsPerAcre < 0) {
            throw new LandControlException("Bushels per acre cannot be less than 0.");
        }

        int totalBushelsForLand = acres * bushelsPerAcre;
        return totalBushelsForLand;
    }
}
