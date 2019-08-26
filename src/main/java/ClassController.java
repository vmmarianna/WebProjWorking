
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

    private List<ListOfClasses> classList = new ArrayList<>();
    private int id = 1;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView result() {
        ModelAndView modelView = new ModelAndView("/test-result");
        modelView.addObject("classList", classList);
        return modelView;
    }

    @RequestMapping(value = "/test-form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("test-form", "class", new ListOfClasses());
    }

    @RequestMapping(value = "/postForm", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("classController") ListOfClasses classController, ModelMap model) {
        classList.add(new ListOfClasses(id++, classController.getName(), classController.getDescription()));
        return "redirect:/class";
    }

}
