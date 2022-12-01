package com.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.Post;
import com.api.repositories.PostRepository;
import com.api.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> post = postRepository.findById(id);
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");	
		}
		return post.get();
	}
	
}
