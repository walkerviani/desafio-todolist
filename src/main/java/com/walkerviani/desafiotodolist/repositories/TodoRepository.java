package com.walkerviani.desafiotodolist.repositories;


import com.walkerviani.desafiotodolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
