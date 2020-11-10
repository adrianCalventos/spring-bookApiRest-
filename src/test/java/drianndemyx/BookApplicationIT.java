package drianndemyx;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookApplicationIT {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getAllBooks() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/book")
			.accept(MediaType.APPLICATION_JSON))	
			.andExpect(status().isOk())
			.andReturn();
		
	}
	

    @Test
    public void getsSingleBook() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void returnsNotFoundForInvalidSingleBook() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/book/4")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andReturn();
    }

    @Test
    public void addsNewBook() throws Exception {
    	
        String newBook = "{\"name\":\"Mock Book\",\"description\":\"Description of Mock.\",\"rate\":2}";
        mockMvc.perform(MockMvcRequestBuilders.post("/book")
                .contentType(MediaType.APPLICATION_JSON)
                .content(newBook)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andReturn();
    }
	

}
