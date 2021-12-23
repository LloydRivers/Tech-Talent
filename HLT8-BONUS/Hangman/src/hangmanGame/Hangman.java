

package hangmanGame;

import java.util.*;


public class Hangman {

public static void main (String[] args) {

Scanner scan = new Scanner(System.in);

String[] dictionary = {"seven", "jaws", "matrix", "snatch", "toystory"};

int max = dictionary.length -1;

int min = 0;


int randomNum = (int)Math.floor(Math.random() * (max - min +1) + min);

String randomWord = dictionary[randomNum];

char[] randomWord_chars = new char[randomWord.length()];

for(int i = 0; i < randomWord.length(); i++) {

randomWord_chars[i] = randomWord.charAt(i);

}



char[] userGuess = new char[randomWord.length()];

for(int i = 0; i < randomWord.length(); i++) {

userGuess[i] = '*';

}


int maxErrors = 6;

int errorCount = 0; 

int youWon = 0;


while(errorCount < maxErrors && youWon == 0) {// while starts

System.out.println(userGuess);

System.out.println("please guess a letter");

char UserInput = scan.next().charAt(0);

int executed = 0;

for(int j = 0; j < randomWord.length(); j++) {// for s

if(UserInput == randomWord_chars[j]) { // if s

userGuess[j] = UserInput;

executed =1;

}// if e

}//for e

if(executed == 0) { //if

errorCount ++;

System.out.println("Wrong!" + errorCount);

}  //if e


int countStars = 0;

char star = '*';

for(int k = 0; k < randomWord.length(); k++) { // for s

if(userGuess[k] == star) {

countStars++;

}

} // for e

if(countStars == 0) { // if s

youWon= 1;


} // if e



}

if(youWon == 1) { // if s

System.out.println("You won");


} // if e
else {  // else s

System.out.println("You lost");

}  // else e



}


}


