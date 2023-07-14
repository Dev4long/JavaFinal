// package com.firstweb.demoproject;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;


// @RestController
// public class HelloController {
//     @RequestMapping("/")
//     public String index(){
//         return "My first Springboot ";
//     }
// }
package com.firstweb.demoproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;





@RestController
@Controller
@RequestMapping


public class HelloController {
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Find out what is your monthly mortgage payment");

        // Add a button to redirect to the /mortgage template
        String buttonHtml = "<a href=\"/mortgage\"><button type=\"button\">Go to Mortgage Calculator</button></a>";
        modelAndView.addObject("buttonHtml", buttonHtml);

        return modelAndView;
    }
    @GetMapping("/mortgage")
    public ModelAndView showMortgageForm() {
        return new ModelAndView("mortgage");
    }
   
}