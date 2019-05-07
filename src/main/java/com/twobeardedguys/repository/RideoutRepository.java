package com.twobeardedguys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twobeardedguys.entity.Rideout;

@Repository
public interface RideoutRepository extends JpaRepository<Rideout, Long>{

}