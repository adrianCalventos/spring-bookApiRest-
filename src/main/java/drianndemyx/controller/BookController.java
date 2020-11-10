package drianndemyx.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import drianndemyx.entity.Book;
import drianndemyx.entity.dto.BookDto;
import drianndemyx.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private ModelMapper modelMapper;

	
    @GetMapping(value = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookDto> getBooks() {
        return bookRepository.findAll().stream()
        		.map(this::convertToDto)
  	          .collect(Collectors.toList());
    }

    @GetMapping(value = "/book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BookDto getBook(@PathVariable long id){
        return bookRepository.findById(id).map(this::convertToDto).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid Book id %s", id)));
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/book")
    public Book createBook(@RequestBody BookDto bookdto) {
        return bookRepository.save(convertToEntity(bookdto));
    }
    
    private BookDto convertToDto(Book book) {
    	BookDto bookDto = modelMapper.map(book, BookDto.class);
	    return bookDto;
	}
    
    private Book convertToEntity(BookDto bookDto) {
        Book book = modelMapper.map(bookDto, Book.class);
        return book;
    }

}
