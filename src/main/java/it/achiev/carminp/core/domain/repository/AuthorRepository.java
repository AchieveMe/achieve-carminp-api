package it.achiev.carminp.core.domain.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.achiev.carminp.core.domain.entity.Author;

/**
 * @author GAN
 * @since 0.1
 */
@RepositoryRestResource(path = "author")
public interface AuthorRepository extends PagingAndSortingRepository<Author, UUID> {
	
	Author findByNameAuthor(@Param("nameAuthor") String nameAuthor);

}