package bikeproject;

public class RoadBike extends Bike implements RoadParts {

  private int tyreWidth, postHeight;

  public RoadBike() {
    this("drop", "racing", "tread less", "razor", 19, 20, 22);
  }//end constructor

  public RoadBike(int postHeight) {
    this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
  }//end constructor

  public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
      int tyreWidth, int postHeight) {
    super(handleBars, frame, tyres, seatType, numGears);
    this.tyreWidth = tyreWidth;
    this.postHeight = postHeight;
  }//end constructor

  @Override
  public String toString() {
    return super.toString() + "This Roadbike has " + this.tyreWidth
        + " mm tyres and a post height of "
        + this.postHeight + ".";
  }//end method toString


  @Override
  public String getTyreWidth() {
    return String.valueOf(tyreWidth);
  }

  @Override
  public void setTyreWidth(String newValue) {

  }

  @Override
  public String getPostHeight() {
    return String.valueOf(postHeight);
  }

  @Override
  public void setPostHeight(String newValue) {

  }
}//end class RoadBike
