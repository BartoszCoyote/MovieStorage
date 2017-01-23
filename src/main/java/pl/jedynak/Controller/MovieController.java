package pl.jedynak.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.jedynak.Domain.Movie;
import pl.jedynak.Service.MovieService;

import javax.validation.Valid;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("movie", new Movie());
        return "form";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("movie", movieService.findOne(id));
        return "form";
    }

    @PostMapping("/save")
    public String save(@Valid Movie movie, BindingResult result, Model model, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "form";
        }
        movieService.save(movie);
        redirect.addFlashAttribute("success", "Saved movie successfully!");
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        movieService.delete(id);
        redirect.addFlashAttribute("success", "Deleted movie successfully!");
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(@RequestParam("q") String q, Model model) {
        if (q.equals("")) {
            return "redirect:/";
        }

        model.addAttribute("movies", movieService.search(q));
        return "list";
    }

}
