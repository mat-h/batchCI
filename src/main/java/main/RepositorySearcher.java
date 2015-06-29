package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import data.AccessLog;
import data.dto.AccessLogDto;

@Component
public class RepositorySearcher implements Searcher<AccessLogDto> {

	@Autowired
	private AccessLog repo;
		
	public AccessLogDto search(String id) {
		List<AccessLogDto> rs = repo.findByUidLike("5");
		return rs.get(0);
	}
	
}
