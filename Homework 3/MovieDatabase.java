//-----------------------------------------------------
// Title: MovieDatabase class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 3
// Description: This class creates a movie binary search tree
//-----------------------------------------------------

import java.util.Date;

public class MovieDatabase {

    class Node{
        MovieObject movie;
        Node left, right;
        BinarySearchTreeCast bstcast;

        public Node(MovieObject key){
            movie = key;
            left = right = null;
        }
    }

    private Node root;
    private Node nodeWithTitle = null;
    boolean hasMovie = false;
    boolean hasRole = false;

    public MovieDatabase() {
        root = null;
    }

    // to add movie to the binary search tree
    public void addMovie(String movieTitle, String directorFirstName,
                         String directorLastName, int releaseDay,
                         int releaseMonth, int releaseYear) {
        boolean updated = false;

        nodeWithTitle = null;
        findWithTitle(root, movieTitle);
        if (nodeWithTitle != null){
            root = delete(root, nodeWithTitle.movie.getDate());
            updated = true;
        }

        root = insert(root, new MovieObject(movieTitle, directorFirstName, directorLastName, releaseDay,
                releaseMonth, releaseYear));

        if (updated)
            System.out.println("ERROR: Movie " + movieTitle + " overwritten");
        else
            System.out.println("INFO: Movie " + movieTitle + " has been added");
    }

    // to remove movie from BST
    public void removeMovie(String movieTitle) {
        nodeWithTitle = null;
        findWithTitle(root, movieTitle);

        if(nodeWithTitle == null)
            System.out.println("ERROR: Movie " + movieTitle + " does not exist");
        else{
            delete(root, nodeWithTitle.movie.getDate());
            System.out.println("INFO: Movie " + movieTitle + " has been removed");
        }
    }

    // to add actor to the given movie in the BST
    public void addActor(String movieTitle, String actorFirstName,
                         String actorLastName, String actorRole) {
        nodeWithTitle = null;
        findWithTitle(root, movieTitle);

        if(nodeWithTitle == null)
            System.out.println("ERROR: Movie " + movieTitle + " does not exist");
        else{
            if(nodeWithTitle != null && nodeWithTitle.bstcast == null)
                nodeWithTitle.bstcast = new BinarySearchTreeCast();
            if(nodeWithTitle != null){
                nodeWithTitle.bstcast.setRoot(nodeWithTitle.bstcast.insertActor(nodeWithTitle.bstcast.getRoot(),
                        new Actor(actorFirstName, actorLastName, actorRole), movieTitle));
            }
        }
    }

    // to remove actor from the given movie in the BST
    public void removeActor(String movieTitle, String actorFirstName,
                            String actorLastName, String actorRole) {
        nodeWithTitle = null;
        findWithTitle(root, movieTitle);

        if(nodeWithTitle == null)
            System.out.println("ERROR: Movie " + movieTitle + " does not exist");
        else{
            String name = actorFirstName + " " + actorLastName;
            nodeWithTitle.bstcast.setRoot(nodeWithTitle.bstcast.delete(nodeWithTitle.bstcast.getRoot(), name));
            System.out.println("INFO: " + actorFirstName + " " + actorLastName + " has been removed from the movie "
                    + nodeWithTitle.movie.getMovieTitle());
        }
    }

    // prints all the movie in the BST
    public void showAllMovies() {
        if(root == null) System.out.println("---none---");
        else inOrder(root);
    }

    // to print the details of the given movie in the BST
    public void showMovie(String movieTitle) {
        nodeWithTitle = null;
        findWithTitle(root, movieTitle);

        if(nodeWithTitle == null)
            System.out.println("ERROR: Movie " + movieTitle + " does not exist");
        else {
            MovieObject mo = nodeWithTitle.movie;

            System.out.println(mo.getMovieTitle());
            System.out.println(mo.getReleaseDay() + "/" + mo.getReleaseMonth() + "/" + mo.getReleaseYear());
            System.out.println(mo.getDirector());

            if(nodeWithTitle.bstcast == null) System.out.println("\n--none--");
            else nodeWithTitle.bstcast.inOrder(nodeWithTitle.bstcast.getRoot());
        }

    }

    // to print all the actor roles in the movies in BST
    public void showActorRoles(String actorFirstName,
                               String actorLastName) {
        String name = actorFirstName + " " + actorLastName;

        hasRole = false;

        System.out.println(name);
        findRoles(root, name);

        if(!hasRole)
            System.out.println("---none---");

    }

    // to print all the actor roles in the movies in BST
    public void findRoles(Node root, String name){
        if(root != null){
            findRoles(root.right, name);
            if(root.bstcast != null){
                boolean temp = root.bstcast.finding(name, root.movie);
                if(temp) hasRole = true;
            }
            findRoles(root.left, name);
        }
    }

    // to print all the movies directed by the given director name
    public void showDirectorMovies(String directorFirstName,
                                   String directorLastName) {
        String name = directorFirstName + " " + directorLastName;

        hasMovie = false;

        System.out.println(name);
        printDescending(root, name);

        if(!hasMovie)
            System.out.println("---none---");

    }

    // to print all the movies directed by the given director name
    public void printDescending(Node root, String name){

        if(root != null){
            printDescending(root.right, name);
            if(root.movie.getDirector().equals(name)){
                hasMovie = true;
                MovieObject mo = root.movie;
                System.out.println(mo.getMovieTitle() + ", " + mo.getReleaseDay() + "/" + mo.getReleaseMonth() + "/" + mo.getReleaseYear());
            }
            printDescending(root.left, name);
        }
    }

    // to find the node object with the given movie title and assign it to the nodeWithTitle
    public void findWithTitle(Node root, String title){
        if(root != null){
            if(root.movie.getMovieTitle().equals(title)){
                nodeWithTitle = root;
                return;
            }
            findWithTitle(root.left, title);
            findWithTitle(root.right, title);
        }
    }

    // prints all the movies in orderly (ascending) in the BST
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.movie.getMovieTitle() + ", " + root.movie.getReleaseYear() + ", " + root.movie.getDirector());
            inOrder(root.right);
        }
    }

    // to insert movie in the correct order in the BST
    public Node insert(Node root, MovieObject movie){
        if(root == null){
            root = new Node(movie);
            return root;
        }

        if(movie.getDate().compareTo(root.movie.getDate()) < 0)
            root.left = insert(root.left, movie);
        else if(movie.getDate().compareTo(root.movie.getDate()) >= 0)
            root.right = insert(root.right, movie);

        return root;
    }

    // to delete movie with given date from the BST
    public Node delete(Node root, Date key){
        if(root == null)
            return root;
        if(key.compareTo(root.movie.getDate()) < 0)
            root.left = delete(root.left, key);
        else if(key.compareTo(root.movie.getDate()) > 0)
            root.right = delete(root.right, key);
        else if(key.compareTo(root.movie.getDate()) == 0 && !root.movie.getMovieTitle().equals(nodeWithTitle.movie.getMovieTitle()))
            root.right = delete(root.right, key);
        else{
            if (root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            root.movie.setDate(minValue(root.right));
            root.right = delete(root.right, root.movie.getDate());
        }

        return root;
    }

    // to find minimum value from the given BST/subBST
    public Date minValue(Node root){
        Date min = root.movie.getDate();

        while (root.left != null) {
            min = root.left.movie.getDate();
            root = root.left;
        }
        return min;
    }
}
