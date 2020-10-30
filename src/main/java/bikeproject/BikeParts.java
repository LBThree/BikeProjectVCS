package bikeproject;

public interface BikeParts {

  // an interface is like a contract that forces any classes that implements this interface to
  // use the fields and methods described below

  // constant declaration
  // remember a constant's name must be all caps
  public final String MAKE = "Oracle Bikes";

  // methods to be implemented
  // remember getters return something, so they have the return type
  // setters set a value, so they need a parameter passed in

  public String getHandleBars();

  public void setHandleBars(String newValue);

  public String getTyres();

  public void setTyres(String newValue);

  public String getSeatType();

  public void setSeatType(String newValue);

} // end interface BikeParts
