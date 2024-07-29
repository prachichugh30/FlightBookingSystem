import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddScheduledFlightComponent } from './add-scheduled-flight/add-scheduled-flight.component';
import { AirportDetailsComponent } from './airport-details/airport-details.component';
import { AirportListComponent } from './airport-list/airport-list.component';
import { BookingConfirmedComponent } from './booking-confirmed/booking-confirmed.component';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { BookingListComponent } from './booking-list/booking-list.component';
import { CreateAirportComponent } from './create-airport/create-airport.component';
import { CreateFlightComponent } from './create-flight/create-flight.component';
import { CreateUsersComponent } from './create-users/create-users.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { CreateBookingComponent } from './create-booking/create-booking.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';
import { FlightListComponent } from './flight-list/flight-list.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { LogoutComponent } from './logout/logout.component';
import { ListUserComponent } from './list-user/list-user.component';
import { ModelComponent } from './model/model.component';
import { ModifyScheduledFlightComponent } from './modify-scheduled-flight/modify-scheduled-flight.component';
import { SerachScheduledFlightComponent } from './serach-scheduled-flight/serach-scheduled-flight.component';
import { SearchScheduledFlightComponent } from './search-scheduled-flight/search-scheduled-flight.component';
import { ShowScheduledFlightsComponent } from './show-scheduled-flights/show-scheduled-flights.component';
import { SignupComponent } from './signup/signup.component';
import { UpdateAirportComponent } from './update-airport/update-airport.component';
import { UpdateFlightComponent } from './update-flight/update-flight.component';
import { UpdateBookingComponent } from './update-booking/update-booking.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { WelcomeAdminComponent } from './welcome-admin/welcome-admin.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { ServicesComponent } from './services/services.component';

@NgModule({
  declarations: [
    AppComponent,
    AddScheduledFlightComponent,
    AirportDetailsComponent,
    AirportListComponent,
    BookingConfirmedComponent,
    BookingDetailsComponent,
    BookingListComponent,
    CreateAirportComponent,
    CreateFlightComponent,
    CreateUsersComponent,
    CreateUserComponent,
    CreateBookingComponent,
    FlightDetailsComponent,
    FlightListComponent,
    FooterComponent,
    HeaderComponent,
    LoginComponent,
    HomeComponent,
    LogoutComponent,
    ListUserComponent,
    ModelComponent,
    ModifyScheduledFlightComponent,
    SerachScheduledFlightComponent,
    SearchScheduledFlightComponent,
    ShowScheduledFlightsComponent,
    SignupComponent,
    UpdateAirportComponent,
    UpdateFlightComponent,
    UpdateBookingComponent,
    UpdateUserComponent,
    WelcomeAdminComponent,
    UserDetailsComponent,
    ServicesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
