class QuestionList {
    int queNo;
    String questions, options;

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

    void setOptions(String options){
        this.options = options;
    }
    String getOptions(){
        return options;
    }

    void showQuestions(){
        System.out.print("Question " + queNo + ": ");
        System.out.println(questions);
        System.out.println(options);
    }
    
}

public class QueAns{
    public static void main(String[] args) {
        QuestionList q1 = new QuestionList();
        q1.setQueNo(01);
        q1.setQuestions("Who makes JAVA programming language?");
        q1.setOptions("Option A: Dannis Ritchie \n" + "Option B: Abhishek Mishra \n" + "Option C: James Goslin" );
        q1.showQuestions();
    }
}