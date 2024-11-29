class Batch {
    int batchCode, studentCount, days;
    String courseName, startDate;
    static int totalBatches = 0, time;

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public int getBatchCode() {
        return batchCode;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static void setTime(int time) {
        Batch.time = time;
    }

    public static int getTime() {
        return time;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }


    public static void setTotalBatches(int totalBatches) {
        Batch.totalBatches = totalBatches;
    }
    public static int getTotalBatches() {
        return totalBatches;
    }

    void displayBatchDetails() {
        System.out.println("Batch code is : " + batchCode);
        System.out.println("Date of the start batch is : " + startDate);
        System.out.println("Number of students is : " + studentCount);
        System.out.println("Timing of the batch per day : " + time + " Hours");
        System.out.println("Duration of the batch is : " + days + " Days");
        System.out.println("Course name is : " + courseName);
        
    }
}

public class Education {

    public static void main(String[] args) {
        Batch b1 = new Batch();

        b1.setBatchCode(5643);
        b1.setStartDate("10 December 2024");
        b1.setStudentCount(12900);
        Batch.setTime(3);
        b1.setDays(24);
        b1.setCourseName("Java Bootcamp");
        Batch.setTotalBatches(12);

        b1.displayBatchDetails();
        System.out.println("Total Number of Batches is : " + Batch.getTotalBatches());
    }
}