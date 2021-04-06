package abstractFactory;

import abstractFactory.webSite.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory =new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("creating auction web site");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();


    }




}
