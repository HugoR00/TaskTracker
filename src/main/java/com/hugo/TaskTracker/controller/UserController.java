package com.hugo.TaskTracker.controller;

import com.hugo.TaskTracker.model.User;
import com.hugo.TaskTracker.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Indica que é um controller
@RequestMapping("/users") //Mapeia rotas
public class UserController {

    //Injeção de dependência, dando ao controller ideia da existência do service
    private final UserService userService;

    //Inicialização do service para de fato injetar a dependência, pode também ser feito com a annotation @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //Annotation para indicar método GET (Capta informações)
    @GetMapping
    public List<User> showUsers(){return userService.showUsers();} //Retorna a função de mostrar os usuários lá do service

    //Annotation para indicar método POST (Criar informação)
    @PostMapping
    //@RequestBody pega os atributos do objeto user
    public User register(@RequestBody User user){return userService.register(user);}//Cria usuário no banco de dados


}
