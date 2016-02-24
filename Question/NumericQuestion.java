public class NumericQuestion extends Question
{
    private double answer; 
    
    // This method is an example of method overloading 
    // This mehtod overloads the setAnswer method of the Question class
    
    public void setAnswer(double correctResponse ) 
    {
        answer = correctResponse;
    }
    // This is an example of overriding 
    // This method overrides the checkAnswer method of the Question Class 
    
    public boolean checkAnswer(String response) 
    {
        double responseAsDouble = Double.parseDouble(response); 
        return Math.abs( responseAsDouble - answer ) <= 0.01; 
    }
    
} 
