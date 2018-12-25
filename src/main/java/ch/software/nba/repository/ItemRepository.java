package ch.software.nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.software.nba.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {

}