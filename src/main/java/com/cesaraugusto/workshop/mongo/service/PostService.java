package com.cesaraugusto.workshop.mongo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesaraugusto.workshop.mongo.domain.Post;
import com.cesaraugusto.workshop.mongo.domain.User;
import com.cesaraugusto.workshop.mongo.repository.PostRepository;
import com.cesaraugusto.workshop.mongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
