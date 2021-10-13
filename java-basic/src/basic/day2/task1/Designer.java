package basic.day2.task1;

public class Designer extends Employee{
    String dribbleLink;

    public String getDribbleLink() {
        return dribbleLink;
    }

    public void updateDribbleLink(String dribbleLink) {
        this.dribbleLink = dribbleLink;
    }

    void Detail() {
        System.out.println("Driblle Link : " + getDribbleLink());
    }
}
