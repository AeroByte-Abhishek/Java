
class MarkSheet{
    private Float physics, chemistry, hindi, maths, english;


    public void setPhysics(Float physics) {
        this.physics = physics;
    }

    public Float getPhysics() {
        return physics;
    }

    public void setChemistry(Float chemistry) {
        this.chemistry = chemistry;
    }
    public Float getChemistry() {
        return chemistry;
    }

    public void setHindi(Float hindi) {
        this.hindi = hindi;
    }
    public Float getHindi() {
        return hindi;
    }

    public void setMaths(Float maths) {
        this.maths = maths;
    }
    public Float getMaths() {
        return maths;
    }

    public void setEnglish(Float english) {
        this.english = english;
    }
    public Float getEnglish() {
        return english;
    }

    public  void maxMarks(){
        if(chemistry>physics && chemistry > maths && chemistry > hindi && chemistry>english){
            System.out.println("Chemistry have maximum marks : " + chemistry);
        }else if(physics>chemistry && physics > maths && physics > hindi && physics>english){
            System.out.println("physics have maximum marks : " + physics);
        }else if(english>physics && english > maths && english > hindi && english>chemistry){
            System.out.println("english have maximum marks : " + english);
        }else if(maths>physics && maths > chemistry && maths > hindi && maths>english){
            System.out.println("maths have maximum marks : " + maths);
        }else if(hindi>physics && hindi > maths && hindi > chemistry && hindi>english){
            System.out.println("hindi have maximum marks : " + hindi);
        }
    }

    public Float avgMarks(){
        return (chemistry + physics + hindi + english + maths)/5;
        
    }

    public void showMarks(){
        System.out.println("Chemistry : " + chemistry);
        System.out.println("Physics : " + physics);
        System.out.println("Maths : " + maths);
        System.out.println("Hindi : " + hindi);
        System.out.println("English : " + english + "\n");
    }

    public void passFail(Integer passingMarks){
        if(chemistry <= passingMarks || physics <= passingMarks || maths <= passingMarks || english <= passingMarks || hindi <= passingMarks){
            System.out.println("Fail");
        }else{
            System.out.println("Pass in all subjects");
        }
        
    }
}

public class MarkSheetDetails {

    public static void main(String[] args) {
        MarkSheet marks = new MarkSheet();

        marks.setChemistry(89.97f);
        marks.setPhysics(98.23f);
        marks.setEnglish(74f);
        marks.setMaths(96.97f);
        marks.setHindi(33.98f);

        marks.showMarks();
        marks.maxMarks();
        System.out.println("\n"+"Average marks of all subjects is : " + marks.avgMarks() + " marks");
        marks.passFail(33);
        



    }
}
