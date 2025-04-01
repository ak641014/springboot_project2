package springboot.project3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@SpringBootApplication
public class Project3Application {

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}
	@GetMapping("/")
	public String homepage(){
		String str="Shreya.s.120998@gmail.com";
		str=str.toLowerCase();
		str=str.replaceAll("[^a-z]","");
		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++){
			if(hm.containsKey(str.charAt(i))){
				int count=hm.get(str.charAt(i));
				hm.put(str.charAt(i),++count);
			}else{
				hm.put(str.charAt(i),1);
			}
		}
		return hm.toString();
	}
}
