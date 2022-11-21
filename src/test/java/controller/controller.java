package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
        @GetMapping("Hey")
        @ResponseBody
    public String Hey(){
        return "Hey Spring!";
}

}
