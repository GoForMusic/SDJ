public class ClockTEst
{
  public static void main(String[] args)
  {
    Clock clock = new Clock(14,03,07);


    System.out.println(clock);
    System.out.println(clock.timeInSecondsTo(new Clock(14,12,00)));
    System.out.println(clock.timeTo(new Clock(14,12,0)));
    System.out.println(clock.isBefore(new Clock(14,03,00)));

    clock.tic();

    System.out.println(clock);

    //24h format

    Clock clock2 = new Clock(23,2,5);
    clock2.setTimeFormat(12);
    System.out.println(clock2);



  }
}
