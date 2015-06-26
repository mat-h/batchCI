package data;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import data.dto.AccessLogDto;

public interface AccessLog extends ElasticsearchRepository<AccessLogDto, Long> {
	List<AccessLogDto> findByUidLike(String uid);
}