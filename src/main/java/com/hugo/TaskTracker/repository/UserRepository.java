package com.hugo.TaskTracker.repository;

import com.hugo.TaskTracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//PERSISTE OS DADOS, INDICANDO QUANTAS REQUISIÇÕES FORAM FEITAS SOBRE O MODEL

@Repository
public interface UserRepository extends JpaRepository<User,Long>{ //Indicando ao repository qual o model e o tipo do identificador (ID)

}

