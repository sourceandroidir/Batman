package ir.android.batman.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public class ListMovie {

    public String Title;
    public String Year;
    @Id@Unique
    public String imdbID;
    public String Type;
    public String Poster;
    @Generated(hash = 1380984191)
    public ListMovie(String Title, String Year, String imdbID, String Type,
            String Poster) {
        this.Title = Title;
        this.Year = Year;
        this.imdbID = imdbID;
        this.Type = Type;
        this.Poster = Poster;
    }
    @Generated(hash = 1851676846)
    public ListMovie() {
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
    public String getImdbID() {
        return this.imdbID;
    }
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
    public String getType() {
        return this.Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getPoster() {
        return this.Poster;
    }
    public void setPoster(String Poster) {
        this.Poster = Poster;
    }
 



}
