package ch.software.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.software.nba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
