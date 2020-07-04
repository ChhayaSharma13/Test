package com.urlshortner.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urlshortner.demo.entity.Url;

public interface UrlRepository extends JpaRepository<Url, Long>{
	
}
