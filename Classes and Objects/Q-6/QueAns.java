import java.util.Scanner;

class QuestionList {
    private int queNo;
    private String questions, optionA, optionB, optionC, optionD;

    void setQueNo(int queNo) {
        this.queNo = queNo;
    }
    int getQueNo() {
        return queNo;
    }

    void setQuestions(String questions){
        this.questions = questions;
    }
    String getQuestions() {
        return questions;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }
    public String getOptionA() {
        return optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }
    public String getOptionB() {
        return optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    public String getOptionC() {
        return optionC;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }
    public String getOptionD() {
        return optionD;
    }

    public void showQuestions(){
        System.out.println("Question " + queNo + ": " + questions);
        System.out.println(optionA);
        System.out.println(optionB);
        System.out.println(optionC);
        System.out.println(optionD);
    }

    Scanner sc = new Scanner(System.in);

    public void showAnswer(){
        System.out.print("Enter your answer here : ");
        char user = sc.next().charAt(0);
        
        if(user == 'd' || user == 'D'){
            System.out.println("Correct Answer!");
        }
        else{
            System.out.println("You are wrong : simply aag laga di aag laga : par papa ke paiso pe");
        }
    }


    
}

public class QueAns{
    public static void main(String[] args) {
        QuestionList q1 = new QuestionList();
        q1.setQueNo(01);
        q1.setQuestions("Who makes JAVA programming language?");
        q1.setOptionA("A. James Bond");
        q1.setOptionB("B. Tom Cruise");
        q1.setOptionC("C. Dannis Ritchie");
        q1.setOptionD("D. James Gosling");
        q1.showQuestions();
        q1.showAnswer();
    }
}