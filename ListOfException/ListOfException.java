import java.util.ArrayList;

public class ListOfException {
  public void combinedArrList() {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
    for (int i = 0; i < myList.size(); i++) {
      Integer castedValue = (Integer) myList.get(i);
      System.out.println("Casting an Integer " + castedValue);
      if (castedValue == 0 && myList.get(i) != "0") {
        throw new ClassCastException();
      }
    }
  }
}