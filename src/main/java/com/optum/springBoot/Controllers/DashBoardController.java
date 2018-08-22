package com.optum.springBoot.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optum.springBoot.Domain.Providerdata;
import com.optum.springBoot.Domain.Students;
import com.optum.springBoot.Entity.Data;
import com.optum.springBoot.Repository.ProviderdataRepository;
import com.optum.springBoot.Repository.StudentsRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DashBoardController {
	
	@Autowired
    DataSource dataSource;
	
    @Autowired
    private StudentsRepository studentsRepository;
    
    @Autowired
    private ProviderdataRepository providerdataRepository;
	
    @RequestMapping("/check")
    public List<Students> check(){
    	List<Students> students = new ArrayList<>();
    	studentsRepository.findAll().forEach(students::add);
		return students;
    }
    
    @RequestMapping("/data")
    public List<Providerdata> data(){
    	List<Providerdata> providerdata = new ArrayList<>();
    	providerdataRepository.findAll().forEach(providerdata::add);
		return providerdata;
    }
    
	@RequestMapping("/hi")
	public List<Object[]> say() {
		List<Object[]> data = null ;
		return data;
	}
	
	@RequestMapping("/hello")
	public String hear(@RequestBody String details) {
		System.out.println(details);
		return "";
	}
	
	@RequestMapping("/edit")
	public void onEdit(@RequestBody Providerdata provider) {
		System.out.println("onEdit");
		providerdataRepository.save(provider);
	}
	
	
	@RequestMapping("/add")
	public void onAdd(@RequestBody Providerdata provider) {
		System.out.println("onAdd"); 
		providerdataRepository.save(provider);
		
	}
	
	@RequestMapping("/delete")
	public void onDelete(@RequestBody String providername) {
		System.out.println("onDelete"); 
		System.out.println(providername);
		providerdataRepository.deleteById(providername);
		/*return deleteUser;*/
	}
	@RequestMapping("/login")
	public String onLogin(@RequestBody ArrayList<String> user) {
		System.out.println("onLogin"); 
		System.out.println("Username : " +user.get(0));
		System.out.println("Password : " +user.get(1));
		String result;
		if ((user.get(0).equals("Admin") & (user.get(1).equals("admin")))) {
			result="true";
			System.out.println(result);
			return result;	
		}
		else {
			result = "false";
			System.out.println(result);
			return result;
		}
	} 
	
	/*@RequestMapping("/table")
	public List<Data> getData() {
		List<Data> data = new ArrayList<Data>();
		Data data1 = new Data();
		data1.setProvider("PBGS");
		data1.setCompliance("100");
		data1.setNonCompliance("101");
		Data data2 = new Data();
		data2.setProvider("ABC");
		data2.setCompliance("10");
		data2.setNonCompliance("11");
		Data data3 = new Data();
		data3.setProvider("DEF");
		data3.setCompliance("100");
		data3.setNonCompliance("101");
		Data data4 = new Data();
		data4.setProvider("GHI");
		data4.setCompliance("10");
		data4.setNonCompliance("101");
		data.add(data1);
		data.add(data2);
		data.add(data3);
		data.add(data4);
		return data;
	}*/

}