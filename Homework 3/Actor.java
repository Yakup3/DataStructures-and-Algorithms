//-----------------------------------------------------
// Title: Actor class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 3
// Description: This class creates actor with the name and role of the actor
//-----------------------------------------------------

public class Actor {

    private String actorFirstName, actorLastName, actorRole, name;

    public Actor(String actorFirstName, String actorLastName, String actorRole) {
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
        this.actorRole = actorRole;
        this.name = this.actorFirstName + " " + this.actorLastName;
    }

    // returns name
    public String getName() {
        return name;
    }

    // returns the role of the actor
    public String getActorRole() {
        return this.actorRole;
    }

    // sets the full name of the actor
    public void setName(String name) {
        this.name = name;
    }
}
