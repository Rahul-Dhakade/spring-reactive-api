package com.rd.reactive.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.rd.reactive.reactive.model.Profile;
import reactor.core.publisher.Flux;

public interface ProfileRepository extends ReactiveMongoRepository<Profile, String> {
    Flux<Profile> findByEmail(String email);
}