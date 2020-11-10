package drianndemyx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import drianndemyx.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findAll();
	
	List<Book> findByName(String name);

}
