/** cette classe représente le microservice (controleur) ***/

package fr.insa.mas.studentManagementMS.controller;

import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType; 

import java.util.ArrayList;



import fr.insa.mas.studentManagementMS.model.Student;

@RestController 
public class StudentRessource {
	
	@GetMapping("/students") 
	public int studentNumber() {
		return 200; 
	}
	
	//cette méthode génére un objet etudiant à partir d'un id 
	@GetMapping(value="/students/{id}") 
	public Student infosStudent(@PathVariable int id) {
		
		Student student=new Student(id,"Rosa","Parks");
		return student; 
	}
    //le format par défaut utilisé par Spring est du JSON
	//comment faire du XML ? 
	
	//cette méthode génére un objet etudiant à partir d'un id 
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_XML_VALUE) 
	public Student xmlInfosStudent(@PathVariable int id) {		
		Student student=new Student(id,"Rosa","Parks");
		return student; 
	}
		
	//** extension du microservice pour afficher la liste des étudiants 
		@GetMapping(value="/studentList") 
		public ArrayList<Student> StudentList() {
			ArrayList<Student> arrayList = new ArrayList<Student>();  	
		    Student student1 =new Student(1,"Rosa","Parks");
		    Student student2 =new Student(2,"Marie","Mi");
		    arrayList.add(student1);
		    arrayList.add(student2);
			return arrayList; 
			
		}	
		
	//** extension du microservice pour la possibilité d'ajouter (POST) de nouveaux etudiants 
		@PostMapping(value="/studentList/add") 
		public void addStudent(@RequestBody Student stew) {		
			ArrayList<Student> arrayList = new ArrayList<Student>();  	
		    Student student1 =new Student(1,"Rosa","Parks");
		    Student student2 =new Student(2,"Marie","Mi");
		    arrayList.add(student1);
		    arrayList.add(student2);
		    System.out.println("Initial list :"+ arrayList);
		    arrayList.add(stew);
		    System.out.println("The student" + stew + "should be now on the list "+ arrayList);			 
		}
		
		//** extension du microservice pour la possibilité 
		//de mettre à jour les infos d'un étudiant existant 
		
		@PutMapping(value="/studentList/{index}") 
		public void updateInfosStudent(@RequestBody Student stew, @PathVariable int index) {		
			ArrayList<Student> arrayList = new ArrayList<Student>();  	
		    Student student1 =new Student(1,"Rosa","Parks");
		    Student student2 =new Student(2,"Marie","Mi");
		    arrayList.add(student1);
		    arrayList.add(student2);
		    System.out.println("Initial list :"+ arrayList.toString());
		    arrayList.set(index,stew);
		    System.out.println("The student indexed at" + index + "should be now updated "+ arrayList);			 
		}
		
		
		//faudra tester dans postman 
}
