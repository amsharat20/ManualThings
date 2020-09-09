package springbootstart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class StartApplication implements CommandLineRunner {
	
    private static final Logger log = LoggerFactory.getLogger(StartApplication.class);
    
    @Autowired
    private BookRepository bookRepository;
	
	public static void main(String args[]){
		System.out.println("Hello world");
		SpringApplication.run(StartApplication.class, args);
	}

	public void run(String... args) throws Exception {
		bookRepository.save(new Book("JAVA"));
		bookRepository.save(new Book("Python"));
		bookRepository.save(new Book("Node"));
		
		System.out.println("Find all");
		bookRepository.findAll().forEach(x -> System.out.println(x));
		
		System.out.println("Find By Name");
		bookRepository.findByName("JAVA").forEach(x -> System.out.println(x));
		
		
		System.out.println("Find By ID");
		bookRepository.findById(1L).ifPresent(x -> System.out.println(x));
		
	}

}
