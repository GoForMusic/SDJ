public class IllegalDataException extends RuntimeException
{
  IllegalDataException()
  {
    super("Invalid data");
  }

  IllegalDataException(int var)
  {
    super("Invalid data: " + var);
  }
}
