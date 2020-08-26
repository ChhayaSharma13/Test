package com.urlshortner.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.urlshortner.demo.entity.Url;
@RepositoryRestResource(exported = false)
public interface UrlRepository extends JpaRepository<Url, Long>{
	
}
