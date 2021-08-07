package com.funclicker.func.repositories;

import com.funclicker.func.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
