import java.util.Scanner;
public class Main extends AlphabetStorageClass
{
  public static void main (String[]args)
  {

    System.out.println ("Enter a text without whitespace : ");
    Scanner input = new Scanner (System.in);
    String text = input.nextLine ();

      System.out.println ();

    for (int i = 0; i < text.length (); i++)
      {

	char[][] alphabet = AlphabetStorageClass.designFunction (text.charAt (i));
	for (int a = 0; a < alphabet.length; a++)
	  {
	    for (int b = 0; b < alphabet[a].length; b++)
	      {
	     	System.out.print (alphabet[a][b]);
	      }
	    System.out.println ();
	  }
	System.out.println ();
      }

  }
}

class AlphabetStorageClass
{

  static char[][] a = {
    {'a', 'a', 'a', 'a', ' '},
    {'a', ' ', ' ', 'a', ' '},
    {'a', ' ', ' ', 'a', ' '},
    {'a', ' ', ' ', 'a', ' '},
    {'a', 'a', 'a', 'a', 'a'},
  };

  // b

  static char[][] b = {
    {'b', ' ', ' ', ' ', ' '},
    {'b', ' ', ' ', ' ', ' '},
    {'b', 'b', 'b', ' ', ' '},
    {'b', ' ', 'b', ' ', ' '},
    {'b', 'b', 'b', ' ', ' '},
  };

  static char[][] c = {
    {'c', 'c', 'c', 'c', 'c'},
    {'c', ' ', ' ', ' ', ' '},
    {'c', ' ', ' ', ' ', ' '},
    {'c', ' ', ' ', ' ', ' '},
    {'c', 'c', 'c', 'c', 'c'},
  };
  static char[][] d = {
    {' ', ' ', ' ', ' ', 'd'},
    {' ', ' ', ' ', ' ', 'd'},
    {' ', ' ', 'd', 'd', 'd'},
    {' ', ' ', 'd', ' ', 'd'},
    {' ', ' ', 'd', 'd', 'd'},
  };

  static char[][] e = {
    {'e', 'e', 'e', ' ', ' '},
    {'e', ' ', 'e', ' ', ' '},
    {'e', 'e', 'e', ' ', ' '},
    {'e', ' ', ' ', ' ', ' '},
    {'e', 'e', 'e', ' ', ' '},
  };

  static char[][] f = {
    {'f', 'f', 'f', ' ', ' '},
    {'f', ' ', ' ', ' ', ' '},
    {'f', 'f', 'f', ' ', ' '},
    {'f', ' ', ' ', ' ', ' '},
    {'f', ' ', ' ', ' ', ' '},
  };

// ...

  static char[][] g = {
    {'g', 'g', 'g', ' ', ' '},
    {'g', ' ', 'g', ' ', ' '},
    {'g', 'g', 'g', ' ', ' '},
    {' ', ' ', 'g', ' ', ' '},
    {'g', 'g', 'g', ' ', ' '},
  };

// ...

  static char[][] h = {
    {'h', ' ', ' ', ' ', ' '},
    {'h', ' ', ' ', ' ', ' '},
    {'h', 'h', 'h', ' ', ' '},
    {'h', ' ', 'h', ' ', ' '},
    {'h', ' ', 'h', ' ', ' '},
  };

// ...

  static char[][] i = {
    {'i', 'i', 'i', ' ', ' '},
    {' ', 'i', ' ', ' ', ' '},
    {' ', 'i', ' ', ' ', ' '},
    {' ', 'i', ' ', ' ', ' '},
    {'i', 'i', 'i', ' ', ' '},
  };

// ...

  static char[][] j = {
    {'j', 'j', 'j', ' ', ' '},
    {' ', ' ', 'j', ' ', ' '},
    {' ', ' ', 'j', ' ', ' '},
    {'j', ' ', 'j', ' ', ' '},
    {'j', 'j', 'j', ' ', ' '},
  };

// ...

  static char[][] k = {
    {'k', ' ', 'k', ' ', ' '},
    {'k', ' ', 'k', ' ', ' '},
    {'k', 'k', ' ', ' ', ' '},
    {'k', ' ', 'k', ' ', ' '},
    {'k', ' ', 'k', ' ', ' '},
  };

// ...

  static char[][] l = {
    {'l', ' ', ' ', ' ', ' '},
    {'l', ' ', ' ', ' ', ' '},
    {'l', ' ', ' ', ' ', ' '},
    {'l', ' ', ' ', ' ', ' '},
    {'l', 'l', 'l', ' ', ' '},
  };

// ...

  static char[][] m = {
    {'m', ' ', ' ', ' ', 'm'},
    {'m', 'm', ' ', 'm', 'm'},
    {'m', ' ', 'm', ' ', 'm'},
    {'m', ' ', ' ', ' ', 'm'},
    {'m', ' ', ' ', ' ', 'm'},
  };

// ...

  static char[][] n = {
    {'n', ' ', ' ', ' ', 'n'},
    {'n', 'n', ' ', ' ', 'n'},
    {'n', ' ', 'n', ' ', 'n'},
    {'n', ' ', ' ', 'n', 'n'},
    {'n', ' ', ' ', ' ', 'n'},
  };

// ...

  static char[][] o = {
    {'o', 'o', 'o', 'o', 'o'},
    {'o', ' ', ' ', ' ', 'o'},
    {'o', ' ', ' ', ' ', 'o'},
    {'o', ' ', ' ', ' ', 'o'},
    {'o', 'o', 'o', 'o', 'o'},
  };

// ...

  static char[][] p = {
    {'p', 'p', 'p', 'p', ' '},
    {'p', ' ', ' ', 'p', ' '},
    {'p', 'p', 'p', 'p', ' '},
    {'p', ' ', ' ', ' ', ' '},
    {'p', ' ', ' ', ' ', ' '},
  };

// ...

  static char[][] q = {
    {'q', 'q', 'q', ' ', ' '},
    {'q', ' ', 'q', ' ', ' '},
    {'q', ' ', 'q', ' ', ' '},
    {'q', ' ', 'q', ' ', ' '},
    {'q', 'q', 'q', 'q', ' '},
  };

// ...

  static char[][] r = {
    {'r', ' ', 'r', ' ', ' '},
    {'r', ' ', 'r', ' ', ' '},
    {'r', 'r', ' ', ' ', ' '},
    {'r', ' ', ' ', ' ', ' '},
    {'r', ' ', ' ', ' ', ' '},
  };

// ...

  static char[][] s = {
    {'s', 's', 's', ' ', ' '},
    {'s', ' ', ' ', ' ', ' '},
    {'s', 's', 's', ' ', ' '},
    {' ', ' ', 's', ' ', ' '},
    {'s', 's', 's', ' ', ' '},
  };

// ...

  static char[][] t = {
    {'t', ' ', ' ', ' ', ' '},
    {'t', ' ', ' ', ' ', ' '},
    {'t', 't', 't', ' ', ' '},
    {'t', ' ', ' ', ' ', ' '},
    {'t', 't', 't', ' ', ' '},
  };

// ...

  static char[][] u = {
    {'u', ' ', 'u', ' ', ' '},
    {'u', ' ', 'u', ' ', ' '},
    {'u', ' ', 'u', ' ', ' '},
    {'u', ' ', 'u', ' ', ' '},
    {'u', 'u', 'u', ' ', ' '},
  };

// ...

  static char[][] v = {
    {'v', ' ', ' ', ' ', 'v'},
    {'v', ' ', ' ', ' ', 'v'},
    {' ', 'v', ' ', 'v', ' '},
    {' ', 'v', ' ', 'v', ' '},
    {' ', ' ', 'v', ' ', ' '},
  };

// ...

  static char[][] w = {
    {'w', ' ', ' ', ' ', 'w'},
    {'w', ' ', ' ', ' ', 'w'},
    {'w', ' ', 'w', ' ', 'w'},
    {'w', 'w', ' ', 'w', 'w'},
    {'w', ' ', ' ', ' ', 'w'},
  };

// ...

  static char[][] x = {
    {'x', ' ', ' ', ' ', 'x'},
    {' ', 'x', ' ', 'x', ' '},
    {' ', ' ', 'x', ' ', ' '},
    {' ', 'x', ' ', 'x', ' '},
    {'x', ' ', ' ', ' ', 'x'},
  };

// ...

  static char[][] y = {
    {'y', ' ', 'y', ' ', ' '},
    {'y', ' ', 'y', ' ', ' '},
    {'y', 'y', 'y', ' ', ' '},
    {' ', ' ', ' ', ' ', ' '},
    {'y', 'y', 'y', ' ', ' '},
  };

// ...

  static char[][] z = {
    {'z', 'z', 'z', ' ', ' '},
    {' ', ' ', 'z', ' ', ' '},
    {' ', 'z', ' ', ' ', ' '},
    {'z', ' ', ' ', ' ', ' '},
    {'z', 'z', 'z', ' ', ' '},
  };



  static char[][] designFunction (char eachCharacter)
  {

    switch (eachCharacter)
      {
      case 'a':
	return a;
      case 'b':
	return b;
      case 'c':
	return c;
      case 'd':
	return d;
      case 'e':
	return e;
      case 'f':
	return f;
      case 'g':
	return g;
      case 'h':
	return h;
      case 'i':
	return i;
      case 'j':
	return j;
      case 'k':
	return k;
      case 'l':
	return l;
      case 'm':
	return m;
      case 'n':
	return n;
      case 'o':
	return o;
      case 'p':
	return p;
      case 'q':
	return q;
      case 'r':
	return r;
      case 's':
	return s;
      case 't':
	return t;
      case 'u':
	return u;
      case 'v':
	return v;
      case 'w':
	return w;
      case 'x':
	return x;
      case 'y':
	return y;
      case 'z':
	return z;

      }

    return new char[0][0];
  }
}
