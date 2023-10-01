package portifolio.portifolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/portifolio")
public class DadosController{
    @GetMapping("/p")
    public ModelAndView exemploViewObj(){
        ModelAndView mv = new ModelAndView("message-view");
        mv.addObject("Nome","Joao Vitor Estevam");
        mv.addObject("Email","joaovestevamr@gmail.com");
        mv.addObject("DataNasc","Data de nascimento: 09/09/2003");
        mv.addObject("Github","Github: https://github.com/Estevam993");
        mv.addObject("Tel","(11) 96933-8683");
        mv.addObject("Linkedin","Linkedin: https://www.linkedin.com/in/joão-vitor-estevam-462224235/");

        return mv;        
    }
}