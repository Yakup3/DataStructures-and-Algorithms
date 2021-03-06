//-----------------------------------------------------
// Title: Main class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 3
// Description: This is the main class which test all the operation done in the homework
//-----------------------------------------------------

public class Main {
    public static void main(String[] args) {
        MovieDatabase md = new MovieDatabase();

        md.showAllMovies();
        System.out.println();

        md.addMovie("Eyes Wide Shut", "Stanley", "Kubrick", 22, 10, 1999);
        md.addMovie("Family Plot", "Alfred", "Hitchock", 9, 4, 1972);
        md.addMovie("Psycho", "Alfred", "Hitchock", 20, 5, 1960);
        md.addMovie("Sweet and Lowdown", "Woody", "Allen", 26, 1, 1999);
        md.addMovie("Midnight in Paris", "Woody", "Allen", 30, 9, 2011);
        md.addMovie("Barton Fink", "Coen", "Brothers", 21, 8, 1991);
        md.addMovie("The Interpreter", "Sydney", "Pollack", 22, 4, 2005);
        md.addMovie("Psycho", "Alfred", "Hitchock", 20, 5, 1960);

        System.out.println();
        md.showAllMovies();
        System.out.println();
        md.removeMovie("Midnight in Paris");
        System.out.println();

        md.showAllMovies();
        System.out.println();

        md.showMovie("Eyes Wide Shut");
        System.out.println();

        md.addActor("Barton Fink", "John", "Turturro", "Barton Fink");
        md.addActor("Barton Fink", "John", "Goodman", "Charlie Meadows");
        md.addActor("Barton Fink", "Judy", "Davis", "Audrey Taylor");
        md.addActor("Barton Fink", "Michael", "Lerner", "Jack Lipnick");
        md.addActor("Eyes Wide Shut", "Tom", "Cruise", "Bill Harford");
        md.addActor("Eyes Wide Shut", "Nicole", "Kidman", "Alice Harford");
        md.addActor("Eyes Wide Shut", "Madison", "Eginton", "Helena Harford");
        md.addActor("Eyes Wide Shut", "Jackie", "Sawaris", "Roz");
        md.addActor("Eyes Wide Shut", "Sydney", "Pollack", "Victor Ziegler");
        md.addActor("Midnight in Paris", "Woody", "Allen", "Woody Allen");
        md.addActor("The Interpreter", "Nicole", "Kidman", "Silvia Broom");
        md.addActor("The Interpreter", "Sean", "Penn", "Tobin Keller");
        md.addActor("The Interpreter", "Earl", "Cameron", "Zuwanie");

        System.out.println();
        md.showMovie("Barton Fink");
        System.out.println();
        md.showMovie("Eyes Wide Shut");
        System.out.println();
        md.removeActor("Eyes Wide Shut", "Jackie", "Sawaris", "Roz");
        System.out.println();
        md.showMovie("Eyes Wide Shut");
        System.out.println();

        md.showActorRoles("Nicole", "Kidman");
        System.out.println();

        md.showActorRoles("Judy", "Davis");
        System.out.println();

        md.showDirectorMovies("Alfred", "Hitchock");
        System.out.println();
        md.showDirectorMovies("Stanley", "Kubrick");

    }
}
