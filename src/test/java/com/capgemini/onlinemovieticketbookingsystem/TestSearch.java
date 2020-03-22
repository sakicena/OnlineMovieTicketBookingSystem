package com.capgemini.onlinemovieticketbookingsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.capgemini.onlinemovieticketbookingsystem.dto.Screen;
import com.capgemini.onlinemovieticketbookingsystem.util.ScreenRepository;

class TestSearch {

	@Test
	void test() {
		Screen s= ScreenRepository.ScreenData.get(1001);
		assertEquals("MorningShow",s.searchShow("MorningShow").getShowName());
	}
	
	

}
