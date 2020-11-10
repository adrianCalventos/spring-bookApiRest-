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
            repository.save(new Book("El imperio final", "Durante mil años han caído cenizas del cielo. Durante mil años nada ha florecido. Durante mil años los skaa han sido esclavizados y viven en la miseria, sumidos en un miedo inevitable. Durante mil años el Lord Legislador ha reinado con poder absoluto, dominando gracias al terror, a sus poderes y a su inmortalidad, ayudado por «obligadores» e «inquisidores», junto a la poderosa magia de la alomancia.\r\n" + 
            		"\r\n" + 
            		"Pero los nobles a menudo han tenido trato sexual con jóvenes skaa y, aunque la ley lo prohíbe, algunos de sus bastardos han sobrevivido y heredado los poderes alománticos: son los «nacidos de la bruma» (mistborn).\r\n" + 
            		"\r\n" + 
            		"Ahora, Kelsier, el «superviviente», el único que ha logrado huir de los Pozos de Hathsin, ha encontrado a Vin, una pobre chica skaa con mucha suerte... Tal vez los dos, con el mejor equipo criminal jamás reunido, unidos a la rebelión que los skaa intentan desde hace mil años, logren cambiar el mundo y acabar con la atroz mano de hierro del Lord Legislador.", 9));
            repository.save(new Book("El Heroe de las eras", "Vin y el Rey Elend buscan en los últimos escondites de recursos del Lord Legislador y, engañado, el Rey libera del Pozo de la Ascensión algoque debería haber quedado oculto para siempre. Un enorme peligro acecha a la humanidad, y la verdadera pregunta es si conseguirán detenerlo a tiempo.\r\n" + 
            		"\r\n" + 
            		"En El héroe de las eras se comprende el porqué de la niebla y las cenizas, las tenebrosas acciones del Lord Legislador y la naturaleza del Pozo de la Ascensión. Esta aventura lleva a la trilogía a un clímax dramático y sorprendente.", 9));
            repository.save(new Book("El Pozo de la ascension", "Tomar el poder tal vez resultó fácil, pero ¿qué ocurre después?, ¿cómo se utiliza? La tarea de reconstruir el mundo, ahora que Kelsier no está, ha quedado en manos de Vin. Y las brumas, desde que el Lord Legislador cayó, se han vuelto cada vez más impredecibles...\r\n" + 
            		"\r\n" + 
            		"A medida que el asedio se intensifica, la antigua leyenda del Pozo de la Ascensión ofrece un único rayo de esperanza.\r\n" + 
            		"\r\n" + 
            		"En ese mundo de aventura épica, la estrategia política y religiosa debe lidiar con los siempre misteriosos poderes de la alomancia...", 8));
        };
    }
    
    @Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}

}
