package com.hugo.TaskTracker.model;


import jakarta.persistence.*;

@Entity //Indica que é um objeto/model
@Table(name= "Users") //Cria uma tabela no banco de dados para esse objeto
public class User {

    @Id //Indica que tem um ID para o banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera valor para o ID e da sequência conforme os objetos são criados
    private Long id;

    private String name;
    private String email;
    private String password;

    public User(){

    }

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
