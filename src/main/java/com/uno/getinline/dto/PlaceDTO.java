package com.uno.getinline.dto;

import com.uno.getinline.constant.PlaceType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaceDTO {
    PlaceType placeType;
    String placeName;
    String address;
    String phoneNumber;
    Integer capacity;
    String memo;

//    public PlaceDTO( PlaceType placeType,
//                     String placeName,
//                     String address,
//                     String phoneNumber,
//                     Integer capacity,
//                     String memo) {
//        this.placeType = placeType;
//        this.placeName = placeName;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.capacity = capacity;
//        this.memo = memo;
//    }

    public static PlaceDTO of(
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo) {
        return new PlaceDTO(placeType, placeName, address, phoneNumber, capacity, memo);
    }
}
