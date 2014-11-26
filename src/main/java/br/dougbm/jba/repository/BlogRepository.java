package br.dougbm.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dougbm.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
