public class ListOfExceptionTest {
  public static void main(String[] args){
    ListOfException arrlist = new ListOfException();
    try{
      arrlist.combinedArrList();
      // ArrayList<Integer> myList = arrlist.combinedArrList();
      System.out.println("Cast into an integer");
    } catch (ClassCastException e){
        System.out.println("Cannot cast to an integer");
    }
    }
}