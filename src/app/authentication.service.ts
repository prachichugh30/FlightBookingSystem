
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../model/user.component';




@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private httpClient: HttpClient) { }

  authenticate(username, password) {

    return this.httpClient.post<any>('http://localhost:9092/authenticate',
    {username, password}).subscribe(
      userData => {
        sessionStorage.setItem('username', username);
        let tokenStr = 'Bearer' +userData.token;
        sessionStorage.setItem('token', tokenStr);
        return userData;
      }
    );
  }

  // Checks whether the user is logged in
  isUserLoggedIn():boolean {
    let user = sessionStorage.getItem('username')
    return !(user === null)
  }

 
  logOut() {
    sessionStorage.removeItem('username');
  }

  // Retrives role of user(customer/admin)
  getRole(username:String) {
    return this.httpClient.get('http://localhost:9092/getRole?username='+ username);
  }

  // Adds a new User
  signUp(user: User) {
    return this.httpClient.post('http://localhost:9092/signup', user);
  }


}
