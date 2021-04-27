public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    this.activeMemoryItem = "";
    this.passiveMemoryItemOne="";
    this.passiveMemoryItemTwo="";
  }

  public int getIQ()
  {
    if(activeMemoryItem.length() > 20 && passiveMemoryItemTwo.length() > 10 && passiveMemoryItemOne.length() > 10) return 130;
      else if(activeMemoryItem.length() > 10 && passiveMemoryItemTwo.length() > 20 && passiveMemoryItemOne.length() > 10) return 130;
        else if(activeMemoryItem.length() > 10 && passiveMemoryItemTwo.length() > 10 && passiveMemoryItemOne.length() > 20) return 130;
          else if(activeMemoryItem.length() > 10 && passiveMemoryItemTwo.length() > 10 && passiveMemoryItemOne.length() > 10) return 100;
            else if(activeMemoryItem == null || passiveMemoryItemTwo == null || passiveMemoryItemOne == null || activeMemoryItem.length() < 10 || passiveMemoryItemOne.length() < 10 || passiveMemoryItemTwo.length() < 10 ) return 70;
  else return 0;
  }

  public boolean isBrainDamaged()
  {
    return (activeMemoryItem == null || passiveMemoryItemTwo == null || passiveMemoryItemOne == null)? true : false;
  }

  public void remember(String info)
  {
    this.passiveMemoryItemTwo = this.passiveMemoryItemOne;
    this.passiveMemoryItemOne = this.activeMemoryItem;
    this.activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if(info.equals(this.passiveMemoryItemOne))
    {
      this.passiveMemoryItemOne = this.activeMemoryItem;
      this.activeMemoryItem = info;
    } else if(info.equals(this.passiveMemoryItemTwo))
    {
      this.passiveMemoryItemTwo = this.activeMemoryItem;
      this.activeMemoryItem = info;
    }
  }

  public boolean recall(String info)
  {
    return (this.activeMemoryItem.equals(info) || this.passiveMemoryItemTwo.equals(info) || this.passiveMemoryItemOne.equals(info))? true:false;
  }

  public String recall()
  {
    return "Active memory: " + this.activeMemoryItem;
  }

  public String toString()
  {
    return "Brain memory:\n" + recall() + "| Passive memory one: " + this.passiveMemoryItemOne + "| Passive memory two: "+this.passiveMemoryItemTwo;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof  Brain))
    {
      return false;
    }

    Brain brain = (Brain)obj;

    if(this.activeMemoryItem.equals(brain.activeMemoryItem)&&this.passiveMemoryItemOne.equals(brain.passiveMemoryItemOne)&&this.passiveMemoryItemTwo.equals(brain.passiveMemoryItemTwo)) return true;
    else return false;
  }

  public Brain copy()
  {
    return new Brain();
  }

}
