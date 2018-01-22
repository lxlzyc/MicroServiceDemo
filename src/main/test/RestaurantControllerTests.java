import com.Application;
import com.lxl.controller.RestaurantController;
import com.lxl.dao.RestaurantRepository;
import com.lxl.model.Restaurant;
import com.lxl.service.RestaurantService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/20 9:53
 * @version: V 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)//新版本代替 @SpringApplicationConfiguration
public class RestaurantControllerTests extends AbstractRestaurantControllerTests{

    public static class TestRestaurantRepository implements RestaurantRepository<Restaurant,String>{

        @Override
        public void add(Restaurant entity) {

        }

        @Override
        public void remove(String id) {

        }

        @Override
        public void update(Restaurant entity) {

        }

        @Override
        public boolean cotainsName(String name) {
            return false;
        }

        @Override
        public boolean contains(String id) {
            return false;
        }

        @Override
        public Entity get(String id) {
            return null;
        }

        @Override
        public Collection<Restaurant> getAll() {
            return null;
        }
    }

    @Test
    public void testIndex(){
        logger.info("begin index");
        String index = restaurantController.getIndex();
        logger.info("result="+index);
        logger.info("end");
    }

}
