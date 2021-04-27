public class NotebookTest
{
  public static void main(String[] args)
  {
    Notebook notebook = new Notebook(5);
    Note note1 = new Note("test1");

    notebook.addNote(note1);
    notebook.addNote("test2");
    notebook.addHighPriorityNote("test3");
    notebook.addHighPriorityNote("test4");
    notebook.addHighPriorityNote("test5");
    notebook.removeNote(4);
    notebook.addNote(note1);

    System.out.println(notebook.getNumberOfNotes());
    System.out.println(notebook);
  }
}
