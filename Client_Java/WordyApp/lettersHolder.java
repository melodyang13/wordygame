package Client_Java.WordyApp;


/**
* WordyApp/lettersHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Wednesday, May 17, 2023 4:05:19 PM SGT
*/

public final class lettersHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public lettersHolder ()
  {
  }

  public lettersHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = lettersHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    lettersHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return lettersHelper.type ();
  }

}
