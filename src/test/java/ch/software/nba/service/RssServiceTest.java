package ch.software.nba.service;

import static org.junit.Assert.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ch.software.nba.entity.Item;
import ch.software.nba.exception.RssException;

public class RssServiceTest {
	
	private RssService rssService;

	@Before
	public void setUp() throws Exception {
		rssService = new RssService();
	}

	@Test
	public void testGetItemsFile() throws RssException {
		List<Item> items = rssService.getItems(new File("test-rss/JejuBlog.xml"));
		assertEquals(50, items.size());
		Item firstItem = items.get(0);
		assertEquals("제이스탬프 어플로 간편하고 쉽게 옐로우카페 할인받기!", firstItem.getTitle());
		assertEquals("29 12 2018 10:50:00", new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstItem.getPublishedDate()));
	}

}
