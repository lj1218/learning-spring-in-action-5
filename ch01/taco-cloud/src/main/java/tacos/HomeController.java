package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lj1218.
 * Date: 2019/10/15
 */
@Controller  // The controller
public class HomeController {

    @GetMapping("/")  // Handles the requests for the root path /
    public String home() {
        return "home";  // Returns the view name
    }
}
