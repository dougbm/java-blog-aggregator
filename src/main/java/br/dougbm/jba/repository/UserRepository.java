package br.dougbm.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dougbm.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
