import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { CreateEmployeeComponent } from '../create-employee/create-employee.component';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

    id : number = 0;
    employee: Employee = new Employee();
    constructor(private employeeService: EmployeeService, private router: Router,
        private route: ActivatedRoute) { }

    ngOnInit(): void {
        this.employee = new Employee();
        this.id = this.route.snapshot.params[`id`];
        this.employeeService.getEmployeeById(this.id).subscribe(data => {
            console.log(data) 
            this.employee = data;
        }, error => console.log(error) ); 
    }

    gotoEmployeeList(){
        this.router.navigate(['/employees']);
    }

    onSubmit(){
        console.log(this.employee)
        this.employeeService.updateEmployee(this.id, this.employee).subscribe( data =>{
            console.log(data);
            this.gotoEmployeeList();   
        })
    }
  
}
