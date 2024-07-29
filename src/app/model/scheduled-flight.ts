import { Flight } from './flight.component';
import { Schedule } from './schedule';

export class ScheduledFlight {
    scheduleFlightId: number;
    flight: Flight;
    availableSeats: number;
    schedule: Schedule;
}