package dev.naimsulejmani.pts;

import io.github.wimdeblauwe.htmx.spring.boot.mvc.HtmxResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

@Controller
@RequestMapping("")
public class TodoController {

    private final Set<Todo> todos = new ConcurrentSkipListSet<>(Comparator.comparingInt(Todo::id));

    TodoController() {
        for (var t : "read a book, go to the gym, learn HATEOS".split(",")) {
            this.todos.add(Todos.todo(t.trim()));
        }
    }

    @GetMapping
    public String todos(Model model) {
        model.addAttribute("todos", this.todos);
        return "todos";
    }

    @DeleteMapping(produces = MediaType.TEXT_HTML_VALUE, path = {"/{todoId}"})
    @ResponseBody
    public String delete(@PathVariable int todoId) {
        this.todos.stream().filter(t -> t.id() == todoId).forEach(this.todos::remove);
        return "";
    }

    @PostMapping
    public String add(@RequestParam("new-todo") String newTodo, Model model) {
        this.todos.add(Todos.todo(newTodo));
        model.addAttribute("todos", this.todos);
        return "todos";
    }


}
