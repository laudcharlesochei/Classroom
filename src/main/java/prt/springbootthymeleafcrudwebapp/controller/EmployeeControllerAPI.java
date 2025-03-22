package prt.springbootthymeleafcrudwebapp.controller;

import prt.springbootthymeleafcrudwebapp.model.Employee;
import prt.springbootthymeleafcrudwebapp.service.EmployeeService;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;




/**
 *
 * @author laudcharles
 */

@RestController
@RequestMapping("/api/v1")
public class EmployeeControllerAPI {
    
    private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
            this.employeeService = employeeService;
	}


        // list page
        @RequestMapping(value = "/employeelist", method=GET)
        public List<Employee> displayAllStudent(Model model) {
            return employeeService.getAllEmployees();
        }

}
