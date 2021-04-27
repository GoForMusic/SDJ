public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24=true;

  public Clock(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public Clock(int totalTimeInSeconds)
  {
    //set hour seconds/3600
    this.hour=totalTimeInSeconds/3600;

    //store the remainder
    int remainder = totalTimeInSeconds-this.hour*3600;
    //set time.minutes
    this.minute=remainder/60;
    //store the remainder
    remainder=remainder-this.minute*60;
    //set seconds
    this.second=remainder;
  }

  public void set(int hour, int minute, int second)
  {
    this.second = second;
    this.minute = minute;
    this.hour = hour;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public void tic()
  {
    this.second += 1;
    if (this.second >= 60)
    {
      this.second = 0;
      this.minute += 1;
      if (this.minute >= 60)
      {
        this.minute = 0;
        this.hour += 1;
      }
    }
  }

  public int convertToSeconds()
  {
    return this.hour * this.minute * this.second;
  }

  public boolean isBefore(Clock time)
  {
    if (this.second < time.second)
      return true;
    else if (this.minute < time.minute)
      return true;
    else if (this.hour < time.hour)
      return true;
    else
      return false;
  }

  public int timeInSecondsTo(Clock time)
  {
    int difH = this.hour - time.hour;
    int difM = this.minute - time.minute;
    int difS = this.second - time.second;

    difH = difH * 60 * 60;
    difM = difM * 60;

    int sum = difH+difM+difS;

    return (sum <0)?sum*-1:sum;
  }

  public Clock timeTo(Clock time)
  {
    //difference of seconds between this Clock and time Clock
    int difSeconds = timeInSecondsTo(time);
    //set hour seconds/3600
    time.hour=difSeconds/3600;

    //store the remainder
    int remainder = difSeconds-time.hour*3600;

    //set time.minutes
    time.minute=remainder/60;
    //convert minutes remains to seconds
    remainder=remainder-time.minute*60;
    //set seconds
    time.second=(remainder <0)?remainder*-1:remainder;

    return time;
  }

  private boolean isTimeFormat24()
  {
    if(this.timeFormat24) return true;
    else return false;
  }

  public void setTimeFormat(int hourFormat)
  {
    switch (hourFormat)
    {
      case 12:
        timeFormat24 = false;
        break;
      case 24:
        timeFormat24 = true;
        break;
      default:
        System.out.println("24/12 only");
        break;
    }
  }

  public String toString()
  {
    String hours=(this.hour<10)?("0"+this.hour):String.valueOf(this.hour);
    String minutes=(this.minute<10)?("0"+this.minute):String.valueOf(this.minute);
    String seconds=(this.second<10)?("0"+this.second):String.valueOf(this.second);

    if(isTimeFormat24())
    {
      return hours+":"+minutes+":"+seconds;
    }
    else{
      String timeLabel = null;
      if(this.hour>12&&this.hour<=23)
      {
        timeLabel = "PM";
        hours=(this.hour-12<10)?("0"+(this.hour-12)):String.valueOf(this.hour-12);
      }else
        {
          timeLabel = "AM";
        }

      return hours+":"+minutes+":"+seconds+" "+timeLabel;
    }
  }
}
