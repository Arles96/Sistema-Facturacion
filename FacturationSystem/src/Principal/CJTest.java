package Principal;

import Entities.Provider;
import Models.Provider_Model;

/**
 *
 * @author CJ
 */
public class CJTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Provider pro = new Provider("12341", "Diego", "Col Cerro grande", "djosue@gmail.com", "22255571");
        Provider_Model pm = new Provider_Model();
        // pm.insert(pro);
        pm.delete("1234");
    }

}
