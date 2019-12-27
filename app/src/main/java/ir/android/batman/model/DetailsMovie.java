package ir.android.batman.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class DetailsMovie {

    @Id
    @Unique
    public String imdbID;
    public String Title;
    public String Year;
    public String Rated;
    public String Released;
    public String Runtime;
    public String Genre;
    public String Director;
    public String Actors;
    public String Plot;
    public String Language;
    public String Writer;
    public String Country;
    public String BoxOffice;
    public String Poster;
    public String Metascore;
    public String Awards;
    public String imdbRating;

    public String imdbVotes;
    public String DVD;
    public String Type;
    public String Production;
    public String Website;
    public String Response;
    @Generated(hash = 1814958777)
    public DetailsMovie(String imdbID, String Title, String Year, String Rated,
            String Released, String Runtime, String Genre, String Director,
            String Actors, String Plot, String Language, String Writer,
            String Country, String BoxOffice, String Poster, String Metascore,
            String Awards, String imdbRating, String imdbVotes, String DVD,
            String Type, String Production, String Website, String Response) {
        this.imdbID = imdbID;
        this.Title = Title;
        this.Year = Year;
        this.Rated = Rated;
        this.Released = Released;
        this.Runtime = Runtime;
        this.Genre = Genre;
        this.Director = Director;
        this.Actors = Actors;
        this.Plot = Plot;
        this.Language = Language;
        this.Writer = Writer;
        this.Country = Country;
        this.BoxOffice = BoxOffice;
        this.Poster = Poster;
        this.Metascore = Metascore;
        this.Awards = Awards;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.DVD = DVD;
        this.Type = Type;
        this.Production = Production;
        this.Website = Website;
        this.Response = Response;
    }
    @Generated(hash = 1869160448)
    public DetailsMovie() {
    }
    public String getImdbID() {
        return this.imdbID;
    }
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
    public String getTitle() {
        return this.Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getYear() {
        return this.Year;
    }
    public void setYear(String Year) {
        this.Year = Year;
    }
    public String getRated() {
        return this.Rated;
    }
    public void setRated(String Rated) {
        this.Rated = Rated;
    }
    public String getReleased() {
        return this.Released;
    }
    public void setReleased(String Released) {
        this.Released = Released;
    }
    public String getRuntime() {
        return this.Runtime;
    }
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }
    public String getGenre() {
        return this.Genre;
    }
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    public String getDirector() {
        return this.Director;
    }
    public void setDirector(String Director) {
        this.Director = Director;
    }
    public String getActors() {
        return this.Actors;
    }
    public void setActors(String Actors) {
        this.Actors = Actors;
    }
    public String getPlot() {
        return this.Plot;
    }
    public void setPlot(String Plot) {
        this.Plot = Plot;
    }
    public String getLanguage() {
        return this.Language;
    }
    public void setLanguage(String Language) {
        this.Language = Language;
    }
    public String getWriter() {
        return this.Writer;
    }
    public void setWriter(String Writer) {
        this.Writer = Writer;
    }
    public String getCountry() {
        return this.Country;
    }
    public void setCountry(String Country) {
        this.Country = Country;
    }
    public String getBoxOffice() {
        return this.BoxOffice;
    }
    public void setBoxOffice(String BoxOffice) {
        this.BoxOffice = BoxOffice;
    }
    public String getPoster() {
        return this.Poster;
    }
    public void setPoster(String Poster) {
        this.Poster = Poster;
    }
    public String getMetascore() {
        return this.Metascore;
    }
    public void setMetascore(String Metascore) {
        this.Metascore = Metascore;
    }
    public String getAwards() {
        return this.Awards;
    }
    public void setAwards(String Awards) {
        this.Awards = Awards;
    }
    public String getImdbRating() {
        return this.imdbRating;
    }
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }
    public String getImdbVotes() {
        return this.imdbVotes;
    }
    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }
    public String getDVD() {
        return this.DVD;
    }
    public void setDVD(String DVD) {
        this.DVD = DVD;
    }
    public String getType() {
        return this.Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getProduction() {
        return this.Production;
    }
    public void setProduction(String Production) {
        this.Production = Production;
    }
    public String getWebsite() {
        return this.Website;
    }
    public void setWebsite(String Website) {
        this.Website = Website;
    }
    public String getResponse() {
        return this.Response;
    }
    public void setResponse(String Response) {
        this.Response = Response;
    }




//
//    "Ratings": [
//    {
//        "Source": "Internet Movie Database",
//        "Value": "6.5/10"
//    },
//    {
//        "Source": "Rotten Tomatoes",
//        "Value": "28%"
//    },
//    {
//        "Source": "Metacritic",
//        "Value": "44/100"
//    }
//    ],
}




