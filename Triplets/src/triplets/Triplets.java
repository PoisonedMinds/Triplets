

package triplets;
import java.util.ArrayList;
import javax.swing.*;
/**
 * @title Triplets
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 5-Feb-2015 12:01:56 PM
 * @purpose The purpose of this program is to create rhyming triplets
 */
public class Triplets {

    public static void main(String[] args) {
        //This program will use a dynamic arrays
    ArrayList<String> nouns = new ArrayList<>(); //setup nouns array
    nouns.add("cat");
    nouns.add("dog");
    nouns.add("horse");
    nouns.add("goat");
    nouns.add("eagle");
    nouns.add("lion");
    nouns.add("giraffe");

    ArrayList<String> verbs = new ArrayList<>(); //setup verbs array
    verbs.add("ate");
    verbs.add("slept");
    verbs.add("jumped");
    verbs.add("raced");
    verbs.add("ran");
    verbs.add("tripped");
    verbs.add("guessed");
    verbs.add("tapped");

    ArrayList<String> rhymingNouns = new ArrayList<>(); //setup rhyming nouns array
    rhymingNouns.add("mouse");
    rhymingNouns.add("blouse");
    rhymingNouns.add("grouse");
    rhymingNouns.add("house");
    rhymingNouns.add("spouse");
    rhymingNouns.add("doghouse");
    rhymingNouns.add("beachhouse");
    rhymingNouns.add("treehouse");

    String noun;
    String verb1, verb2;
    String rhymingNoun1, rhymingNoun2, rhymingNoun3;
    int randomNum;

    //get a random noun from the nouns array
    //use .size() to get the # of elements
    randomNum = (int) (Math.random() * nouns.size());
    noun = nouns.get(randomNum);

    //get the first random verb from the verbs array &
    // remove from ArrayList
    randomNum = (int) (Math.random() * verbs.size());
    verb1 = verbs.get(randomNum);
    verbs.remove(randomNum);

    //get the second random verb from verbs array and remove it
    randomNum = (int) (Math.random() * verbs.size());
    verb2 = verbs.get(randomNum);
    verbs.remove(randomNum);

    //get the first rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun1 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);

    //get the second rhyming noun and remove it, choose AAA or ABA rhyming pattern
    randomNum = (int) (Math.random()*2);
    if (randomNum==0){
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun2 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);
    } else {
    randomNum = (int) (Math.random() * nouns.size());
    rhymingNoun2 = nouns.get(randomNum);
    nouns.remove(randomNum);    
    }
   
    //get the third rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun3 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);

    //Display the poem
    JOptionPane.showMessageDialog(null, "The " + noun + " " + verb1 + 
            " to the " + rhymingNoun1 + "\n" + "So it could " + verb2 + 
      " the " + rhymingNoun2+"\nBut it was a "+rhymingNoun3);
  }
}
    



