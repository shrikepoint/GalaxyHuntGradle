package highScore;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class finScores {
   // @XmlElement specifies XML element name for each object in the List
   @XmlElement(name="finScore") 
   private List<finScore> finScores = new ArrayList<>(); // stores Accounts

   // returns the List<finScores>
   public List<finScore> getAccounts() {return finScores;}
}
