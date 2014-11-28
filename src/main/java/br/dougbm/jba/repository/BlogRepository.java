package br.dougbm.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dougbm.jba.entity.Blog;
import br.dougbm.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);

}
