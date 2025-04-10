package com.example.openforeign;

import java.util.HashMap;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "openFeignClient", url="https://jsonplaceholder.typicode.com")
public interface OpenFeingClient {
	@GetMapping("/posts")
    List getPosts();
	
	@GetMapping("/posts/{id}")
	HashMap getPostById(@PathVariable("id") String id);
}
