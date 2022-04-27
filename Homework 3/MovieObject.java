//-----------------------------------------------------
// Title: MovieObject class
// Author: Yakupguly/Malikov
// Section: 1
// Assignment: 3
// Description: This class creates movie with title, director name and release date
//-----------------------------------------------------

import java.util.Calendar;
import java.util.Date;

public class MovieObject {

    private String movieTitle, directorFirstName, directorLastName;
    private int releaseDay, releaseMonth, releaseYear;
    private Date date;

    public MovieObject(String movieTitle, String directorFirstName, String directorLastName, int releaseDay,
                       int releaseMonth, int releaseYear) {
        this.movieTitle = movieTitle;
        this.directorFirstName = directorFirstName;
        this.directorLastName = directorLastName;
        this.releaseDay = releaseDay;
        this.releaseMonth = releaseMonth;
        this.releaseYear = releaseYear;
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.releaseYear, this.releaseMonth, this.releaseDay);
        date = calendar.getTime();
    }

    // returns the release date of the movie
    public Date getDate() {
        return date;
    }

    // sets the date of the movie
    public void setDate(Date date) {
        this.date = date;
    }

    // returns the release year of the movie
    public int getReleaseYear() {
        return this.releaseYear;
    }

    // returns the release month of the movie
    public int getReleaseMonth(){
        return this.releaseMonth;
    }

    // returns the release day of the movie
    public int getReleaseDay(){
        return this.releaseDay;
    }

    // returns the full name of the director of the movie
    public String getDirector() {
        return this.directorFirstName + " " + this.directorLastName;
    }

    // returns the title of the movie
    public String getMovieTitle() {
        return movieTitle;
    }
}
