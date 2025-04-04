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
	@GetMapping("/occurance")
	public String occurance(){
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
	@GetMapping("/isprime")
	public int isprime(){
		return Project3Application.prime(5);
	}
	public static int prime(int x) {
		int count = 0;
		int num = 2;
		while (true) {
			boolean flag = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				if (count == x) {
					return num;
				}
			}
			num++;
		}
	}
}
