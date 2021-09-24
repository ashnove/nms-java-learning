import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

    employees: Employee[] = [];
    constructor() { }

    ngOnInit(): void {

        this.employees = [
            {
                id: 1,
                firstname: "Ashutosh",
                lastname: "Shaw",
                emailId: "ashu@gmail.com"
            },
            {
                id: 2,
                firstname: "Michael",
                lastname: "Scott",
                emailId: "scarn@gmail.com"
            }
        ]

    }

}
