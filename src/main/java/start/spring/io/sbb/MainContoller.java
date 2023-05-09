package start.spring.io.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainContoller {
    
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        // System.out.println("index");
        return "index";
    }
}
