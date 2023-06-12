package lt.code.academy.blogasnd.examples.servlet.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/myFirstController")
public class MyFirstController {

    @GetMapping
    public String firstController(){
        return "myFirstTemplate";
    }

    @GetMapping("/sayHi/{name}")
        public String sayHi(@PathVariable String name, @RequestParam(required = false) String gender){
        System.out.println("Perduotas vardas yra " + name);


        return "myFirstTemplate";
    }
}
