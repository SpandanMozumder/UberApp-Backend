package project.uber.uberApp.services.implementation;

import org.springframework.stereotype.Service;
import project.uber.uberApp.dto.DriverDto;
import project.uber.uberApp.dto.RideDto;
import project.uber.uberApp.dto.RiderDto;
import project.uber.uberApp.services.DriverService;

import java.util.List;

@Service
public class DriverServiceImplementation implements DriverService {

    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
