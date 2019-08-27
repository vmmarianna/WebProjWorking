package cl.server;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

//    @RequestMapping("/{userID}")
//    public String getProfile(@PathVariable("userID") String userId) {
//        return userId;
//    }
private List<Class> classList = new ArrayList<>();
    private int id = 1;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView result() {
        ModelAndView modelView = new ModelAndView("/test-result");
        modelView.addObject("classList", classList);
        return modelView;
    }

    @RequestMapping(value = "/test-form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("test-form", "aClass", new Class());
    }

    @RequestMapping(value = "/postForm", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("aClass") Class aClass, ModelMap model) {
        classList.add(new Class(id++, aClass.getname(), aClass.getdescription()));
        return "redirect:/class";
    }


}
