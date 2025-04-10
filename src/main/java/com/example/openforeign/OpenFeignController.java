package com.example.openforeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RequestMapping("/service1")
@RestController
@Slf4j
public class OpenFeignController {

	@Autowired
	private OpenFeingClient openFeignService;  
    
    @PostMapping("/getTest")
    public ResponseEntity<Object> test() {
    	System.out.println("/service1/api/v1/getTestt..........");
        return new ResponseEntity<>(new Object(), HttpStatus.OK);
    }
    
    @PostMapping("/getPosts")
    public ResponseEntity<Object> getPosts() {
    	System.out.println("/service1/api/v1/getPosts call......");
        Object resultObj = openFeignService.getPosts();
        return new ResponseEntity<>(resultObj, HttpStatus.OK);
    }
    
    @PostMapping("/getPost/{id}")
    public ResponseEntity<Object> getPostById(@PathVariable("id") String id) {
    	System.out.println("/service1/api/v1/getPost/{id} call......");
        Object resultObj = openFeignService.getPostById(id);
        return new ResponseEntity<>(resultObj, HttpStatus.OK);
    }

   }