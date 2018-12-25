package ch.software.nba.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.software.nba.entity.Blog;
import ch.software.nba.entity.Item;
import ch.software.nba.entity.Role;
import ch.software.nba.entity.User;
import ch.software.nba.repository.BlogRepository;
import ch.software.nba.repository.ItemRepository;
import ch.software.nba.repository.RoleRepository;
import ch.software.nba.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepositoy;
	
	@PostConstruct
	public void init() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER"); 
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN"); 
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogNaverTravel = new Blog();
		blogNaverTravel.setName("JejuBlog");
		blogNaverTravel.setUrl("https://rss.blog.naver.com/findjeju.xml");
		blogNaverTravel.setUser(userAdmin);
		blogRepository.save(blogNaverTravel);
		
		Item item1 = new Item();
		item1.setBlog(blogNaverTravel);
		item1.setTitle("first");
		item1.setLink("https://blog.naver.com/findjeju/221426162613");
		item1.setPublishedDate(new Date());
		itemRepositoy.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(blogNaverTravel);
		item2.setTitle("second");
		item2.setLink("https://blog.naver.com/findjeju/221426162613");
		item2.setPublishedDate(new Date());
		itemRepositoy.save(item2);
		
		
		

	}

}
