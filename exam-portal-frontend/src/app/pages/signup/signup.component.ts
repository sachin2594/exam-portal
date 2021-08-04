import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService: UserService, private snack: MatSnackBar) { }

  ngOnInit(): void {
  }

  public user = {
    userName: "",
    password: "",
    firstName: "",
    lastName: "",
    email: "",
    phone: ""
  }

  formSubmit(){
    if(this.user.userName == '' || this.user.userName == null){
      this.snack.open('username is required!!','',{
        duration: 3000,
        // verticalPosition: "top",
        // horizontalPosition: "right"
      })
      return;
    }
    this.userService.addUser(this.user).subscribe(
      (data) =>{
        this.snack.open('Success!!','',{
          duration: 3000
        })
      },
      (error) =>{
        this.snack.open('Something Went Wrong!!','',{
          duration: 3000
        })
      }
    )
  }




}
