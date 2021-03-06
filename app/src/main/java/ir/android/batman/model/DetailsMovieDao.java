package ir.android.batman.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DETAILS_MOVIE".
*/
public class DetailsMovieDao extends AbstractDao<DetailsMovie, String> {

    public static final String TABLENAME = "DETAILS_MOVIE";

    /**
     * Properties of entity DetailsMovie.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ImdbID = new Property(0, String.class, "imdbID", true, "IMDB_ID");
        public final static Property Title = new Property(1, String.class, "Title", false, "TITLE");
        public final static Property Year = new Property(2, String.class, "Year", false, "YEAR");
        public final static Property Rated = new Property(3, String.class, "Rated", false, "RATED");
        public final static Property Released = new Property(4, String.class, "Released", false, "RELEASED");
        public final static Property Runtime = new Property(5, String.class, "Runtime", false, "RUNTIME");
        public final static Property Genre = new Property(6, String.class, "Genre", false, "GENRE");
        public final static Property Director = new Property(7, String.class, "Director", false, "DIRECTOR");
        public final static Property Actors = new Property(8, String.class, "Actors", false, "ACTORS");
        public final static Property Plot = new Property(9, String.class, "Plot", false, "PLOT");
        public final static Property Language = new Property(10, String.class, "Language", false, "LANGUAGE");
        public final static Property Writer = new Property(11, String.class, "Writer", false, "WRITER");
        public final static Property Country = new Property(12, String.class, "Country", false, "COUNTRY");
        public final static Property BoxOffice = new Property(13, String.class, "BoxOffice", false, "BOX_OFFICE");
        public final static Property Poster = new Property(14, String.class, "Poster", false, "POSTER");
        public final static Property Metascore = new Property(15, String.class, "Metascore", false, "METASCORE");
        public final static Property Awards = new Property(16, String.class, "Awards", false, "AWARDS");
        public final static Property ImdbRating = new Property(17, String.class, "imdbRating", false, "IMDB_RATING");
        public final static Property ImdbVotes = new Property(18, String.class, "imdbVotes", false, "IMDB_VOTES");
        public final static Property DVD = new Property(19, String.class, "DVD", false, "DVD");
        public final static Property Type = new Property(20, String.class, "Type", false, "TYPE");
        public final static Property Production = new Property(21, String.class, "Production", false, "PRODUCTION");
        public final static Property Website = new Property(22, String.class, "Website", false, "WEBSITE");
        public final static Property Response = new Property(23, String.class, "Response", false, "RESPONSE");
    }


    public DetailsMovieDao(DaoConfig config) {
        super(config);
    }
    
    public DetailsMovieDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DETAILS_MOVIE\" (" + //
                "\"IMDB_ID\" TEXT PRIMARY KEY NOT NULL UNIQUE ," + // 0: imdbID
                "\"TITLE\" TEXT," + // 1: Title
                "\"YEAR\" TEXT," + // 2: Year
                "\"RATED\" TEXT," + // 3: Rated
                "\"RELEASED\" TEXT," + // 4: Released
                "\"RUNTIME\" TEXT," + // 5: Runtime
                "\"GENRE\" TEXT," + // 6: Genre
                "\"DIRECTOR\" TEXT," + // 7: Director
                "\"ACTORS\" TEXT," + // 8: Actors
                "\"PLOT\" TEXT," + // 9: Plot
                "\"LANGUAGE\" TEXT," + // 10: Language
                "\"WRITER\" TEXT," + // 11: Writer
                "\"COUNTRY\" TEXT," + // 12: Country
                "\"BOX_OFFICE\" TEXT," + // 13: BoxOffice
                "\"POSTER\" TEXT," + // 14: Poster
                "\"METASCORE\" TEXT," + // 15: Metascore
                "\"AWARDS\" TEXT," + // 16: Awards
                "\"IMDB_RATING\" TEXT," + // 17: imdbRating
                "\"IMDB_VOTES\" TEXT," + // 18: imdbVotes
                "\"DVD\" TEXT," + // 19: DVD
                "\"TYPE\" TEXT," + // 20: Type
                "\"PRODUCTION\" TEXT," + // 21: Production
                "\"WEBSITE\" TEXT," + // 22: Website
                "\"RESPONSE\" TEXT);"); // 23: Response
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DETAILS_MOVIE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DetailsMovie entity) {
        stmt.clearBindings();
 
        String imdbID = entity.getImdbID();
        if (imdbID != null) {
            stmt.bindString(1, imdbID);
        }
 
        String Title = entity.getTitle();
        if (Title != null) {
            stmt.bindString(2, Title);
        }
 
        String Year = entity.getYear();
        if (Year != null) {
            stmt.bindString(3, Year);
        }
 
        String Rated = entity.getRated();
        if (Rated != null) {
            stmt.bindString(4, Rated);
        }
 
        String Released = entity.getReleased();
        if (Released != null) {
            stmt.bindString(5, Released);
        }
 
        String Runtime = entity.getRuntime();
        if (Runtime != null) {
            stmt.bindString(6, Runtime);
        }
 
        String Genre = entity.getGenre();
        if (Genre != null) {
            stmt.bindString(7, Genre);
        }
 
        String Director = entity.getDirector();
        if (Director != null) {
            stmt.bindString(8, Director);
        }
 
        String Actors = entity.getActors();
        if (Actors != null) {
            stmt.bindString(9, Actors);
        }
 
        String Plot = entity.getPlot();
        if (Plot != null) {
            stmt.bindString(10, Plot);
        }
 
        String Language = entity.getLanguage();
        if (Language != null) {
            stmt.bindString(11, Language);
        }
 
        String Writer = entity.getWriter();
        if (Writer != null) {
            stmt.bindString(12, Writer);
        }
 
        String Country = entity.getCountry();
        if (Country != null) {
            stmt.bindString(13, Country);
        }
 
        String BoxOffice = entity.getBoxOffice();
        if (BoxOffice != null) {
            stmt.bindString(14, BoxOffice);
        }
 
        String Poster = entity.getPoster();
        if (Poster != null) {
            stmt.bindString(15, Poster);
        }
 
        String Metascore = entity.getMetascore();
        if (Metascore != null) {
            stmt.bindString(16, Metascore);
        }
 
        String Awards = entity.getAwards();
        if (Awards != null) {
            stmt.bindString(17, Awards);
        }
 
        String imdbRating = entity.getImdbRating();
        if (imdbRating != null) {
            stmt.bindString(18, imdbRating);
        }
 
        String imdbVotes = entity.getImdbVotes();
        if (imdbVotes != null) {
            stmt.bindString(19, imdbVotes);
        }
 
        String DVD = entity.getDVD();
        if (DVD != null) {
            stmt.bindString(20, DVD);
        }
 
        String Type = entity.getType();
        if (Type != null) {
            stmt.bindString(21, Type);
        }
 
        String Production = entity.getProduction();
        if (Production != null) {
            stmt.bindString(22, Production);
        }
 
        String Website = entity.getWebsite();
        if (Website != null) {
            stmt.bindString(23, Website);
        }
 
        String Response = entity.getResponse();
        if (Response != null) {
            stmt.bindString(24, Response);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DetailsMovie entity) {
        stmt.clearBindings();
 
        String imdbID = entity.getImdbID();
        if (imdbID != null) {
            stmt.bindString(1, imdbID);
        }
 
        String Title = entity.getTitle();
        if (Title != null) {
            stmt.bindString(2, Title);
        }
 
        String Year = entity.getYear();
        if (Year != null) {
            stmt.bindString(3, Year);
        }
 
        String Rated = entity.getRated();
        if (Rated != null) {
            stmt.bindString(4, Rated);
        }
 
        String Released = entity.getReleased();
        if (Released != null) {
            stmt.bindString(5, Released);
        }
 
        String Runtime = entity.getRuntime();
        if (Runtime != null) {
            stmt.bindString(6, Runtime);
        }
 
        String Genre = entity.getGenre();
        if (Genre != null) {
            stmt.bindString(7, Genre);
        }
 
        String Director = entity.getDirector();
        if (Director != null) {
            stmt.bindString(8, Director);
        }
 
        String Actors = entity.getActors();
        if (Actors != null) {
            stmt.bindString(9, Actors);
        }
 
        String Plot = entity.getPlot();
        if (Plot != null) {
            stmt.bindString(10, Plot);
        }
 
        String Language = entity.getLanguage();
        if (Language != null) {
            stmt.bindString(11, Language);
        }
 
        String Writer = entity.getWriter();
        if (Writer != null) {
            stmt.bindString(12, Writer);
        }
 
        String Country = entity.getCountry();
        if (Country != null) {
            stmt.bindString(13, Country);
        }
 
        String BoxOffice = entity.getBoxOffice();
        if (BoxOffice != null) {
            stmt.bindString(14, BoxOffice);
        }
 
        String Poster = entity.getPoster();
        if (Poster != null) {
            stmt.bindString(15, Poster);
        }
 
        String Metascore = entity.getMetascore();
        if (Metascore != null) {
            stmt.bindString(16, Metascore);
        }
 
        String Awards = entity.getAwards();
        if (Awards != null) {
            stmt.bindString(17, Awards);
        }
 
        String imdbRating = entity.getImdbRating();
        if (imdbRating != null) {
            stmt.bindString(18, imdbRating);
        }
 
        String imdbVotes = entity.getImdbVotes();
        if (imdbVotes != null) {
            stmt.bindString(19, imdbVotes);
        }
 
        String DVD = entity.getDVD();
        if (DVD != null) {
            stmt.bindString(20, DVD);
        }
 
        String Type = entity.getType();
        if (Type != null) {
            stmt.bindString(21, Type);
        }
 
        String Production = entity.getProduction();
        if (Production != null) {
            stmt.bindString(22, Production);
        }
 
        String Website = entity.getWebsite();
        if (Website != null) {
            stmt.bindString(23, Website);
        }
 
        String Response = entity.getResponse();
        if (Response != null) {
            stmt.bindString(24, Response);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public DetailsMovie readEntity(Cursor cursor, int offset) {
        DetailsMovie entity = new DetailsMovie( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // imdbID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // Title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Year
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // Rated
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // Released
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Runtime
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // Genre
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // Director
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // Actors
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // Plot
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // Language
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // Writer
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // Country
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // BoxOffice
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // Poster
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // Metascore
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // Awards
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // imdbRating
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // imdbVotes
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // DVD
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // Type
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // Production
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // Website
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23) // Response
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DetailsMovie entity, int offset) {
        entity.setImdbID(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setYear(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setRated(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setReleased(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRuntime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setGenre(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDirector(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setActors(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPlot(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setLanguage(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setWriter(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setCountry(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setBoxOffice(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setPoster(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setMetascore(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setAwards(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setImdbRating(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setImdbVotes(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setDVD(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setType(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setProduction(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setWebsite(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setResponse(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
     }
    
    @Override
    protected final String updateKeyAfterInsert(DetailsMovie entity, long rowId) {
        return entity.getImdbID();
    }
    
    @Override
    public String getKey(DetailsMovie entity) {
        if(entity != null) {
            return entity.getImdbID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DetailsMovie entity) {
        return entity.getImdbID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
