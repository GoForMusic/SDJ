import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private ArrayList<Note> notes;

  public Notebook()
  {
    this.notes = new ArrayList<Note>(5);
  }

  public Notebook(int maxNumberOfNotes)
  {
    this.numberOfNotes = maxNumberOfNotes;
    this.notes = new ArrayList<Note>();
  }

  public int getNumberOfNotes()
  {
    return notes.size();
  }

  public Note getNotes(int index)
  {
    return notes.get(index);
  }

  public String getMessage(int index)
  {
    return notes.get(index).getMessage();
  }

  public void addNote(Note note)
  {
    if(notes.size()<numberOfNotes)
    {
      notes.add(note.copy());
    }
  }

  public void addNote(String message)
  {
    if(notes.size()<numberOfNotes)
    {
      notes.add(new Note(message));
    }
  }

  public void addHighPriorityNote(String message)
  {
    if(notes.size()<numberOfNotes)
    {
      Note localNote = new Note(message);
      localNote.setHighPriority();
      notes.add(localNote);
    }
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public Note[] getAllNotes()
  {
    Note[] tempArray = new Note[notes.size()];
    return notes.toArray(tempArray);
  }

  public int getNumberOfHighPriorityNotes()
  {
    int sum = 0;

    for(int index=0;index<notes.size();index++)
    {
      if(notes.get(index).isHighPriority()) sum++;
    }

    return sum;
  }

  public Note[] getAllHighPriorityNotes()
  {
    Note[] localArray = new Note[notes.size()];

    for(int index=0;index< localArray.length;index++)
    {
      if(notes.get(index).isHighPriority()) localArray[index] = notes.get(index);
    }

    return localArray;
  }

  public String toString()
  {
    String localString="";
    localString += "numbers of notes: " + notes.size() + "\n";
    localString += "--------------------------------------\n";


    for(int index=0;index<notes.size();index++)
    {
      localString += notes.get(index);
    }

    return localString;
  }

}
