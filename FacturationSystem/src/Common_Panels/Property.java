package Common_Panels;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author CJ
 */
public class Property implements Serializable {

    /**
     * Paleta de colores MODERN.
     */
    public static final int MODERN[][] = {{19, 22, 41}, {49, 55, 69}, {215, 49, 23}, {184, 184, 184}, {237, 237, 237}};
    /**
     * Paleta de colores FIBER.
     */
    public static final int FIBER[][] = {{244, 83, 88}, {88, 89, 83}, {63, 168, 176}, {243, 242, 237}, {216, 106, 107}};
    /**
     * Paleta de colores SELFIE.
     */
    public static final int SELFIE[][] = {{88, 126, 140}, {242, 238, 172}, {242, 194, 136}, {242, 143, 121}, {217, 102, 102}};
    /**
     * Paleta de colores EAST.
     */
    public static final int EAST[][] = {{222, 50, 59}, {55, 63, 66}, {240, 242, 247}, {74, 217, 217}, {54, 177, 191}};
    private int mix[][];
    /**
     * Define si ya se ha establecido una configuración previa.
     */
    public static boolean logged;

    public Property(int mix[][]) {
        this.mix = mix;
    }

    public int[][] getMix() {
        return mix;
    }

    public void setMix(int[][] mix) {
        this.mix = mix;
    }

    @Override
    public String toString() {
        return "Property{" + Arrays.deepToString(mix) + '}';
    }

}
