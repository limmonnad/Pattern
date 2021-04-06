package abstractFactory.webSite;

import abstractFactory.Developer;
import abstractFactory.ProjectManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
