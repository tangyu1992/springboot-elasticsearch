package cn.com.sweetcandy.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import cn.com.sweetcandy.es.entity.User;

public interface UserEsRepository extends ElasticsearchRepository<User, Long>{

}
