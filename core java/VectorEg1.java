import java.util.*;
import java.lang.*;
public class VectorEg1
{
  public static void main(String args[])
  {
    Vector <Integer>in=new Vector<>();

    in.add(100);
    in.add(200);
    in.add(300);
    in.add(400);
    in.add(500);

    System.out.println("Values in vector are"+in);
    System.out.println("Remove first occrence of element 200"+in.remove((Integer)200));
    System.out.println("Values in the vector "+in);
    System.out.println("Remove element at index 4= "+in.remove(4));
    System.out.println("new value list int vector : "+in);
    in.removeElementAt(2);
    System.out.println("Vector element after removal= "+in);
    System.out.println("Hash code of this vector= "+in.hashCode());
    System.out.println("element at index 1 is= "+in.get(1));
  }
}
