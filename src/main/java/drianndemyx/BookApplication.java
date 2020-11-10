package drianndemyx;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import drianndemyx.entity.Book;
import drianndemyx.repository.BookRepository;

@SpringBootApplication
public class BookApplication {
	
	public static void main(String[] arg) {
		SpringApplication.run(BookApplication.class);	
	}
	
    @Bean
    public CommandLineRunner sampleData(BookRepository repository) {
        return (args) -> {
            repository.save(new Book("El imperio final", "Durante mil a�os han ca�do cenizas del cielo. Durante mil a�os nada ha florecido. Durante mil a�os los skaa han sido esclavizados y viven en la miseria, sumidos en un miedo inevitable. Durante mil a�os el Lord Legislador ha reinado con poder absoluto, dominando gracias al terror, a sus poderes y a su inmortalidad, ayudado por �obligadores� e �inquisidores�, junto a la poderosa magia de la alomancia.\r\n" + 
            		"\r\n" + 
            		"Pero los nobles a menudo han tenido trato sexual con j�venes skaa y, aunque la ley lo proh�be, algunos de sus bastardos han sobrevivido y heredado los poderes alom�nticos: son los �nacidos de la bruma� (mistborn).\r\n" + 
            		"\r\n" + 
            		"Ahora, Kelsier, el �superviviente�, el �nico que ha logrado huir de los Pozos de Hathsin, ha encontrado a Vin, una pobre chica skaa con mucha suerte... Tal vez los dos, con el mejor equipo criminal jam�s reunido, unidos a la rebeli�n que los skaa intentan desde hace mil a�os, logren cambiar el mundo y acabar con la atroz mano de hierro del Lord Legislador.", 9));
            repository.save(new Book("El Heroe de las eras", "Vin y el Rey Elend buscan en los �ltimos escondites de recursos del Lord Legislador y, enga�ado, el Rey libera del Pozo de la Ascensi�n algoque deber�a haber quedado oculto para siempre. Un enorme peligro acecha a la humanidad, y la verdadera pregunta es si conseguir�n detenerlo a tiempo.\r\n" + 
            		"\r\n" + 
            		"En El h�roe de las eras se comprende el porqu� de la niebla y las cenizas, las tenebrosas acciones del Lord Legislador y la naturaleza del Pozo de la Ascensi�n. Esta aventura lleva a la trilog�a a un cl�max dram�tico y sorprendente.", 9));
            repository.save(new Book("El Pozo de la ascension", "Tomar el poder tal vez result� f�cil, pero �qu� ocurre despu�s?, �c�mo se utiliza? La tarea de reconstruir el mundo, ahora que Kelsier no est�, ha quedado en manos de Vin. Y las brumas, desde que el Lord Legislador cay�, se han vuelto cada vez m�s impredecibles...\r\n" + 
            		"\r\n" + 
            		"A medida que el asedio se intensifica, la antigua leyenda del Pozo de la Ascensi�n ofrece un �nico rayo de esperanza.\r\n" + 
            		"\r\n" + 
            		"En ese mundo de aventura �pica, la estrategia pol�tica y religiosa debe lidiar con los siempre misteriosos poderes de la alomancia...", 8));
        };
    }
    
    @Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
