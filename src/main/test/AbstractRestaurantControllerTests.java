import com.lxl.controller.RestaurantController;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/20 9:56
 * @version: V 1.0
 */
public class AbstractRestaurantControllerTests {

    Logger logger = Logger.getLogger(AbstractRestaurantControllerTests.class);

    protected  static  final String RESTAURANT = "1";
    @Autowired
    RestaurantController restaurantController;

    @Test
    public void testIndex(){
        logger.info("begin");
        String index = restaurantController.getIndex();
        logger.info("result="+index);
        logger.info("end");
    }
}
