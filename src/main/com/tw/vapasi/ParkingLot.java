package com.tw.vapasi;

public class ParkingLot {

  //private List<Integer> emptySlots = new ArrayList<>();
  //private final String vehicleType ;

  private final int emptySlots;


  public ParkingLot(int emptySlots) {
    this.emptySlots = emptySlots;
  }

  void park(String vehicleType) throws Exception {
    if (isSlotAvailable(vehicleType)) {
      return;
    }
    throw new Exception("Not parked");
  }

  private boolean isSlotAvailable(String vehicleType) {
    //if(emptySlots)
    return true;
  }
}
