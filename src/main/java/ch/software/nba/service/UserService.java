package ch.software.nba.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ch.software.nba.entity.Blog;
import ch.software.nba.entity.Item;
import ch.software.nba.entity.User;
import ch.software.nba.repository.BlogRepository;
import ch.software.nba.repository.ItemRepository;
import ch.software.nba.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findOne(int id) {
		
		return userRepository.findOne(id);
	}
	
	@Transactional
	public User findOneWithBlogs(int id) {
		User user = findOne(id);
		List<Blog> blogs = blogRepository.findByUser(user);
		for (Blog blog : blogs) {
			List<Item> items =  itemRepository.findByBlog(blog);
			blog.setItems(items);
		}
		user.setBlogs(blogs);
		return user;
	}

}
