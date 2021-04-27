public class ParkingTicket
{
  private int fine;
  private PoliceOfficer policeOfficer;



  public ParkingTicket(int fine, PoliceOfficer policeOfficer)
  {
    this.fine = fine;
    this.policeOfficer = policeOfficer;
  }

  public String toString()
  {
    return "Fine:" + fine+"$";
  }

}
