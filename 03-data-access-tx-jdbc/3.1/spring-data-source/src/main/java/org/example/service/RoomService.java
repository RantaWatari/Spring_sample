package org.example.service;

import org.example.model.Room;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {
    public Room getRoom(String roomId);
}
