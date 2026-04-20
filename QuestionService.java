import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Jupiter", "Mars", "Saturn", "Jupiter");
        questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
        questions[3] = new Question(4, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", "Au");
        questions[4] = new Question(5, "Who painted the Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Claude Monet", "Leonardo da Vinci");
    }
     public void playQuiz(){
         int i = 0;
      for (Question  q: questions){
       System.out.println("Question no: " + q.getId());
       System.out.println(q.getQuestion());
       System.out.println( "A. " + q.getOpt1());
       System.out.println( "B. " + q.getOpt2());
       System.out.println("C. " + q.getOpt3());
       System.out.println( "D. " + q.getOpt4());
       /// Scanner  gives the user an opportunity to enter an input
       /// 
        Scanner scanner = new Scanner(System.in);
        selection[i] = scanner.nextLine();

        i++;

     }
     for (  String s: selection){
         System.out.println(s);
     }
}
 public void printScore(){
     int score = 0;
     for (int i = 0; i < questions.length; i++){
          Question que = questions[i];
          String actualAnswer = que.getAnswer();

          // Map the user's letter choice to the actual option value
          String userLetter = selection[i].trim().toUpperCase();
          String userAnswer;
          switch (userLetter) {
              case "A": userAnswer = que.getOpt1(); break;
              case "B": userAnswer = que.getOpt2(); break;
              case "C": userAnswer = que.getOpt3(); break;
              case "D": userAnswer = que.getOpt4(); break;
              default:  userAnswer = selection[i]; break; // fallback if they type full answer
          }

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
     }
     System.out.println("Your score is: " + score + "/" + questions.length);
 }
}