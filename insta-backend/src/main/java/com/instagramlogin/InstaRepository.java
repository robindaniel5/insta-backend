package com.instagramlogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstaRepository extends JpaRepository<Entity, Long> {
}
