package com.hugo.TaskTracker.service;

import com.hugo.TaskTracker.model.User;
import com.hugo.TaskTracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//SERVICE CONTROLA AS AÇÕES QUE PODEM SER FEITAS SOBRE O MODEL, AÇÕES ESSAS QUE SÃO PROCESSADAS/GUIADAS PELO CONTROLLER
//CRIA AS REGRAS DE NEGÓCIO

@Service //Indica que é um service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Método de listar (GET)
    public List<User> showUsers(){
        return userRepository.findAll();
    }

    //Método de criar (POST)
    public User register(User user){
        return userRepository.save(user);
    }

    //Método de deletar (DELETE)
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
