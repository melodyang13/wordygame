package Server_Java.WordyApp;


/**
* WordyApp/playerStatsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Monday, May 8, 2023 11:43:25 AM SGT
*/

public final class playerStatsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[][] = null;

  public playerStatsHolder ()
  {
  }

  public playerStatsHolder (String[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = playerStatsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    playerStatsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return playerStatsHelper.type ();
  }

}
