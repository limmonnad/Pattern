package abstractFactory.webSite;

import abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("webdite pm manages web site project");
    }
}
