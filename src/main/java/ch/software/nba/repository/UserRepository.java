package ch.software.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.software.nba.entity.User;

public interface UserRepository extends JpaRepository <User, Integer> {

}
