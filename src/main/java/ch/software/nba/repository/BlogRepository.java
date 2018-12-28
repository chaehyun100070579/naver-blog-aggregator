package ch.software.nba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.software.nba.entity.Blog;
import ch.software.nba.entity.User;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);

} 
