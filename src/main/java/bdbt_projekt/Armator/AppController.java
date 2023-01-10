package bdbt_projekt.Armator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Configuration
public class AppController implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index_pracownik").setViewName("index_pracownik");
        registry.addViewController("/index_bandera").setViewName("index_bandera");
        registry.addViewController("/new_form").setViewName("new_form");
        registry.addViewController("/edit_form").setViewName("edit_form");



        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");
    }

    @Controller
    public class DashboardController {

        @RequestMapping("/main")
        public String defaultAfterLogin(HttpServletRequest request) {
            if (request.isUserInRole("ADMIN")) {
                return "redirect:/index";
            } else if (request.isUserInRole("USER")) {
                return "redirect:/main_user";
            } else {
                return "redirect:/index";
            }
        }

        @RequestMapping(value = {"/main_admin"})
        public String showAdminPage(Model model) {
            return "admin/main_admin";
        }

        @RequestMapping(value = {"/main_user"})

        public String showUserPage(Model model) {
            return "user/main_user";
        }

        @Autowired
        private BanderyDAO dao;

        @RequestMapping("/index_bandera")
        public String viewHomePage(Model model) {
            /* Import java.util.List */
            List<Bandera> listBandera = dao.list();
            model.addAttribute("listBandera", listBandera);
            return "index_bandera";
        }

        @RequestMapping("/new")
        public String showNewForm(Model model) {
            Bandera bandera = new Bandera();
            model.addAttribute("bandera", bandera);
            return "new_form";
        }

        @RequestMapping(value = "/save", method = RequestMethod.POST)
        public String save(@ModelAttribute("bandera") Bandera bandera) {
            dao.save(bandera);
            return "redirect:/index_bandera";
        }
        @RequestMapping("/edit/{ID_bandery}")
        public ModelAndView showEditForm(@PathVariable(name = "ID_bandery")int ID_bandery){
            ModelAndView mav = new ModelAndView("edit_form");
            Bandera bandera = dao.get(ID_bandery);
            mav.addObject("bandera", bandera);
            return mav;
        }
        @RequestMapping(value = "/update", method = RequestMethod.POST)
        public String update(@ModelAttribute("bandera") Bandera bandera) {
            dao.update(bandera);
            return "redirect:/index_bandera";
        }
        @RequestMapping("/delete/{ID_bandery}")
        public String delete(@PathVariable(name = "ID_bandery")int ID_bandery){
            dao.delete(ID_bandery);
            return "redirect:/index_bandera";
        }



        /*    @Autowired
    private PracownicyDAO dao;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        /* Import java.util.List */
/*        List<Pracownik> listPracownik = dao.list();
        model.addAttribute("listPracownik", listPracownik);
        return "index_pracownik";
    } */
    }
}



