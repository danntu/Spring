package javatpoint.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloRequestController {
    @RequestMapping("/hellorequest")
    public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (password.equals("admin")) {
            String message = "Hello " + name;
            return new ModelAndView("hellorequestpage", "message", message);
        } else {
            return new ModelAndView("errorpage", "message", "Sorry username or password error");
        }
    }
}
