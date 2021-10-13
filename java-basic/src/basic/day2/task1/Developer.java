package basic.day2.task1;

public class Developer extends Employee{
    String gitHubLink;

    public String getGitHubLink() {
        return gitHubLink;
    }

    public void updateGithubLink(String gitHubLink) {
        this.gitHubLink = gitHubLink;
    }


    void Detail() {
        System.out.println("Github Link : " + getGitHubLink());
    }
}
