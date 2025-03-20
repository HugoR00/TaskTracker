package com.hugo.TaskTracker.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //Indica que é um objeto/model
@Table(name= "tb_users") //Cria uma tabela no banco de dados para esse objeto
@NoArgsConstructor //Cria construtor sem argumentos
@AllArgsConstructor //Construtor com argumentos
@Data //Cria getters e setters
public class User {

    @Id //Indica que tem um ID para o banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera valor para o ID e da sequência conforme os objetos são criados
    private Long id;

    private String name;
    private String email;
    private String password;

    @OneToMany (mappedBy = "user") //Um user - várias tasks
    private List<Task> taskList;

}
