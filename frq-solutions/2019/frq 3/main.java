import java.util.*;

//PART A

public class Delimiters {
  private String openDel;
  private String closeDel;

  public Delimiters(String open, String close) {
    openDel = open;
    closeDel = close;
  }

  public ArrayList<String> getDelimitersList(String[] token) {
    ArrayList<String> delimiters = new ArrayList<String>();
    for(int i = 0; i<token.size(); i++) {
      if(token[i].equals(openDel) || token[i].equals(openDel)) {
        delimiters.add(token[i]);
      }
    }
  }
  return delimiters;
}

//PART B

public boolean isBalanced(ArrayList<String> delimiters) {
  int count = 0;
  for(int i = 0; i<delimiters.size(); i++) {
    if(delimiters[i].equals(openDel)) {
      count++;
    } else if(delimitrs[i].equals(closeDel)) {
      counter--;
    }
  }
  if(delimiter[delimiters.size()-1].equals(openDel)) {
    return false;
  }
  return count >= 0;
}
