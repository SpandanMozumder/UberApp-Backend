package project.uber.uberApp.strategies;

import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
