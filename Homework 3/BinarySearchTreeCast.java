//-----------------------------------------------------
// Title: BinarySearchTreeCast class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 3
// Description: This class creates an actor binary search tree
//-----------------------------------------------------

public class BinarySearchTreeCast {

    // Node class for actor
    class Node {
        Actor cast;
        Node left, right;

        public Node(Actor key) {
            cast = key;
            left = right = null;
        }
    }

    private Node root;

    private boolean hasRole = false;

    public BinarySearchTreeCast() {
        root = null;
    }

    // to insert the actor to specified movie
    public Node insertActor(Node root, Actor actor, String movieTitle) {

        boolean updated = false;

        Node returned = search(root, actor.getName());

        if(returned != null){
            root = delete(root, actor.getName());
            updated = true;
        }

        root = insert(root, actor);

        if(updated)
            System.out.println("ERROR: role of " + returned.cast.getName() + " overwritten as " + actor.getActorRole());
        else{
            System.out.println("INFO: " + actor.getName() + " has been added to the movie " +
                    movieTitle);
        }

        return root;
    }

    // function to insert actor in the correct order in the actor BST
    public Node insert(Node root, Actor key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key.getName().compareTo(root.cast.getName()) < 0)
            root.left = insert(root.left, key);
        else if (key.getName().compareTo(root.cast.getName()) > 0)
            root.right = insert(root.right, key);

        return root;
    }

    // to search for actor with the given name in BST and return it
    public Node search(Node root, String name) {

        if (root == null || root.cast.getName().equals(name))
            return root;

        if (root.cast.getName().compareTo(name) < 0)
            return search(root.right, name);

        return search(root.left, name);
    }

    // to find the actor in BST and print their role
    public boolean finding(String name, MovieObject movie){
        hasRole = false;

        findRoles(root, name, movie);

        return hasRole;
    }

    // to print the actor roles of the given actor in the BST
    public void findRoles(Node root, String name, MovieObject movie){
        if(root != null){
            findRoles(root.right, name, movie);
            if(root.cast.getName().equals(name)){
                hasRole = true;
                Actor actor = root.cast;
                System.out.println(actor.getActorRole() + ", " + movie.getMovieTitle() + ", " + movie.getReleaseYear());
            }
            findRoles(root.left, name, movie);
        }
    }

    // sets root
    public void setRoot(Node root) {
        this.root = root;
    }

    // returns the root
    public Node getRoot() {
        return this.root;
    }

    // to print the actors with their names and roles
    public void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.println(
                    root.cast.getName() + ", " + root.cast.getActorRole());
            inOrder(root.right);
        }
    }

    // to delete the actor in the actor BST with the given name
    public Node delete(Node root, String name) {
        if (root == null)
            return root;

        if (name.compareTo(root.cast.getName()) < 0)
            root.left = delete(root.left, name);
        else if (name.compareTo(root.cast.getName()) > 0)
            root.right = delete(root.right, name);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.cast.setName(minValue(root.right));

            root.right = delete(root.right, root.cast.getName());
        }

        return root;
    }

    // to find the min in the BST or subBST
    public String minValue(Node root) {
        String min = root.cast.getName();
        while (root.left != null) {
            min = root.left.cast.getName();
            root = root.left;
        }
        return min;
    }
}
