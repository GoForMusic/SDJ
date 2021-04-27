public class Note
{
  private String message;
  private boolean highPriority;

  public Note(String message)
  {
    this.message = message;
    this.highPriority = false;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    if(highPriority) return true;
    else return false;
  }

  public void setHighPriority()
  {
    this.highPriority = true;
  }

  public void setLowPriority()
  {
    this.highPriority = false;
  }

  public Note copy()
  {
    Note localNote = new Note(this.message);

    if(isHighPriority()) localNote.setHighPriority();
    else localNote.setLowPriority();

    return localNote;
  }

  public String toString()
  {
    return "Message: " + this.message + " | priority? ("+this.highPriority+")\n";
  }

}
