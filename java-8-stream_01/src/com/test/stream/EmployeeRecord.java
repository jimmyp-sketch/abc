package com.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeRecord{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(1001,"mona", "SDET"));
		list.add(new Employee(1002, "Satish", "STE"));
		list.add(new Employee(1003, "Durgha", "SSE"));
		list.add(new Employee(1004, "sambit", "ARchitect"));
		
	//Stream<List<Employee>>str=	Stream.of(list);
		
	//System.out.println(str.toString());
		//Consumer---> public void accept(T );
		
		
		//list.stream().forEach(i->System.out.println(i.getEmpId()+ " "+ i.getEmpName()+ " "+ i.getDesignation()));
		
		
	//	list.stream().filter(e->e.getEmpName().startsWith("s")).map(e->e.getDesignation()+" "+e.getEmpId()+ e.getEmpName()).collect(Collectors.toList()).forEach(i->System.out.println(i));
		
		list.stream().map(e->e.getEmpId()).forEach(i->System.out.println(i));
		
	List<String> designation=	list.stream().map(e->e.getDesignation()).collect(Collectors.toList());
	
	System.out.println("The Desginnations");
	designation.stream().forEach(i->System.out.print(i+ " "));
	
List<Employee> val=	list.stream().filter(i->i.getDesignation().equals("DSE")).collect(Collectors.toList());
	/*
if(val.get(0).getDesignation()=="DSE") {
	System.out.println("hey");
}
else {
	System.out.println("bye");
}
*/
System.out.println();
Optional<Employee> emOptional=list.stream().filter(i->i.getDesignation().equals("SDE")).findFirst();

if(emOptional.isPresent()) {
	System.out.println("heloo");
}
else {
	System.out.println("bye");
}

System.out.println(emOptional);
	//	map(e->e.getEmpName().startsWith("S"))
		
		
		//EmployeeRecord erecord= new EmployeeRecord();
		
	//	Stream<Employee> lStream=list.stream();
		
		
		/*
		for (Employee employee : list) {
			erecord.accept(employee);
		}
		*/
		
	}

	/*
	@Override
	public String apply(Employee emp) {
		// TODO Auto-generated method stub
		Predicate<Employee> p1=  i->i.getEmpName().startsWith("S");
		if(p1.test(emp)) {
			return emp.getDesignation() + " "+ emp.getEmpId() + " "+ emp.getEmpName();
		}
		else {
			return "No matching data";
		}
	}
	
	*/

	/*
	
	public void accept(Employee t) {
		// TODO Auto-generated method stub
		System.out.println(t.getDesignation()+ " "+ t.getEmpId() + " "+ t.getEmpName());
	}
	
	*/

}
