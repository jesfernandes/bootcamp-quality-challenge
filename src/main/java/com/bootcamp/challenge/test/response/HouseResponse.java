package com.bootcamp.challenge.test.response;

import com.bootcamp.challenge.test.model.House;
import com.bootcamp.challenge.test.model.Room;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HouseResponse extends House {

    private Integer totalArea;
    private Double price;
    private Room bigRoom;

    public HouseResponse(House house) {
        this.setPropName(house.getPropName());
        this.setPropDistrict(house.getPropDistrict());
        this.setRooms(house.getRooms());
    }
}
