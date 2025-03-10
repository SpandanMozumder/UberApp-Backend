package project.uber.uberApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.uber.uberApp.entities.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
