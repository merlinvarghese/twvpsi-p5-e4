package com.tw.vapasi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

  @Test
  void expectNormalFlowWhenParked(){
//    List<Integer> emptySlots = new ArrayList<>();
//    emptySlots.add(1);
//    emptySlots.add(2);
//
   String vehicleTobeParked = "car";

    ParkingLot parkingLot = new ParkingLot(5);
    try{
      parkingLot.park(vehicleTobeParked);
    }
    catch(Exception e){
      fail("Should not throw exception");
    }
  }
}
