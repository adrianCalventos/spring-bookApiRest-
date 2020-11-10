package drianndemyx.entity.dto;



public class BookDto {
	

	  private Long id;
	  private String name;
	  private String description;
	  private int rate;
	  
	  
//	public BookDto(Long id, String name, String description, int rate) {
//		this.id = id;
//		this.name = name;
//		this.description = description;
//		this.rate = rate;
//	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}
	  
	
	
	  

}
