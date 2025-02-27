package com.example.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
