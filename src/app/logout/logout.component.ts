import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';

@Component({
  selector: 'app-logout',
  template: ''
})
export class LogoutComponent implements OnInit {

  constructor(private authenticationService: AuthenticationService,
    private router: Router) { }

  ngOnInit() {

    this.authenticationService.logOut();
    sessionStorage.setItem('role', null);
    sessionStorage.setItem('userId', null);
    this.router.navigate(['login']);
  }

}