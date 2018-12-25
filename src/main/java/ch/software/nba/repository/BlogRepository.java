package ch.software.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.software.nba.entity.Blog;


public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
