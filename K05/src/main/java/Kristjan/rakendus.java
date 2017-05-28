package Kristjan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class rakendus{

	@RequestMapping("/Failiread")
	public String Failiread(double read, double tahed){
		double readFailis = read;
		double tahedFailis = tahed;
		double vastus = 0;
		vastus = readFailis*tahedFailis;
		return "Dokumendis on " + vastus + "tähte";
	}




	public static void main(String [] arg){
		SpringApplication.run(rakendus.class, arg);
	}
}







//scl enable rh-maven33 bash
//mvn package
//java -Dserver.port=4545 -jar target/app1.jar
//http://greeny.cs.tlu.ee:4545/tervita?eesnimi=Juku