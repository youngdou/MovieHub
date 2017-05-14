package actPlus.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by young on 16-11-2.
 */

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {


    @GetMapping
    public String IndexPage(@RequestParam(name="startPage", required=false, defaultValue="0" )int startPage,
                            Model model) {
        return "index";
    }

}
