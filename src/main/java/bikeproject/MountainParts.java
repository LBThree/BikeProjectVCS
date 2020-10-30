package bikeproject;

public interface MountainParts {

  // an interface is like a contract that forces any classes that implements this interface to
  // use the fields and methods described below

  public final String TERRAIN = "off_road";

  // methods to be implemented
  // remember getters return something, so they have the return type
  // setters set a value, so they need a parameter passed in

  public String getSuspension();

  public void setSuspension(String newValue);

  public String getType();

  public void setType(String newValue);

}
