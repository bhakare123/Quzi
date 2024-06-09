import java.util.Scanner;

public class QuestionService 
{
   Question[] question = new Question[5];
   String selection[] = new String[5];

   public QuestionService()
   {
      question[0] = new Question(1,"size of int","2","6","8", "10", "3" );
      question[1] = new Question(2,"size of Doule","2","6","10", "8", "4" );
      question[2] = new Question(3,"size of flost","8","6","2", "10", "1" );
      question[3] = new Question(4,"size of Short","2","6","8", "10", "2" );
      question[4] = new Question(5,"size of byte","2","6","8", "10", "1" );

   }

   public void plauQuzi()
   {
      int i=0 ;
      for(Question q : question)
      {
        System.out.println("Question no : "+q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        
        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i++ ;
      }

      for(String s : selection)
      {
        System.out.println(s);
      }
   }

   public void printScore()
   {
      int score = 0 ;
      for(int i = 0 ; i<question.length;i++)
      {
        Question que = question[i];
        String actualAnswer = que.getAnswer();
        String userAnswer = selection[i];

        if(actualAnswer.equals(userAnswer));
        {
            score++ ;
        }

      }
      System.out.println(" Your Score is = "+score);
   }


}
 