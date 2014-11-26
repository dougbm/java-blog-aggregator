package br.dougbm.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dougbm.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
