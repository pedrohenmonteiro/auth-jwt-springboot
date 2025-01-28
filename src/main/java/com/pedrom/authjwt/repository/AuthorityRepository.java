package com.pedrom.authjwt.repository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.pedrom.authjwt.domain.Authority;

/**
 * Spring Data JPA repository for the Authority entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
