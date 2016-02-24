import java.util.Scanner; 
// this class supports a fill-in-the-blank question where the answer is specified in the questions text 
//delimited by '_'. This class extracts the answer from the question text 
public class FillInQuestion extends Question 
{
    // Extracts the answer from the specified question text. For example : " the inventor of JAva was _James Gosling_"
    public void setText(String questionText)
    {
     Scanner parser = new Scanner(questionText ); 
     parser.useDelimiter("_"); 
     String question= parser.next(); 
     String answer = parser.next(); 
     question += " _ _ _ _ _" + parser.next(); 
     
     setText( question); 
     setAnswer( answer ); 
     
    }
}