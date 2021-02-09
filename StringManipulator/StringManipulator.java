public class StringManipulator {
  public String trimAndConcat(String str1, String str2) {
    return str1.trim()+str2.trim();
  }
  public Integer getIndexOrNull(String str, char c) {
    int idx = str.indexOf(c);
    if (idx == -1) {
      return null;
    }
    return str.indexOf(c);
  }
  public Integer getIndexOrNull(String str1, String str2) {
    int idx = str1.indexOf(str2);
    if (idx == -1) {
      return null;
    }
    return str1.indexOf(str2);
  }
  public String concatSubstring(String str1, int start, int end, String str2) {
    return str1.substring(start, end).concat(str2);
  }
}