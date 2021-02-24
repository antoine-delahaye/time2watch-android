package com.example.time2watch.classes;

import java.util.Arrays;

public class TVShow {
    public String backdrop_path;
    public int[] genre_ids;
    public String original_language;
    public int vote_count;
    public String first_air_date;
    public String[] origin_country;
    public String poster_path;
    public double vote_average;
    public int id;
    public String overview;
    public String name;
    public String original_name;
    public double popularity;
    public String media_type;

    public TVShow(String backdrop_path, int[] genre_ids, String original_language, int vote_count, String first_air_date, String[] origin_country, String poster_path, double vote_average, int id, String overview, String name, String original_name, double popularity, String media_type) {
        this.backdrop_path = backdrop_path;
        this.genre_ids = genre_ids;
        this.original_language = original_language;
        this.vote_count = vote_count;
        this.first_air_date = first_air_date;
        this.origin_country = origin_country;
        this.poster_path = poster_path;
        this.vote_average = vote_average;
        this.id = id;
        this.overview = overview;
        this.name = name;
        this.original_name = original_name;
        this.popularity = popularity;
        this.media_type = media_type;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public int[] getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(int[] genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public String[] getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String[] origin_country) {
        this.origin_country = origin_country;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "backdrop_path='" + backdrop_path + '\'' +
                ", genre_ids=" + Arrays.toString(genre_ids) +
                ", original_language='" + original_language + '\'' +
                ", vote_count=" + vote_count +
                ", first_air_date='" + first_air_date + '\'' +
                ", origin_country=" + Arrays.toString(origin_country) +
                ", poster_path='" + poster_path + '\'' +
                ", vote_average=" + vote_average +
                ", id=" + id +
                ", overview='" + overview + '\'' +
                ", name='" + name + '\'' +
                ", original_name='" + original_name + '\'' +
                ", popularity=" + popularity +
                ", media_type='" + media_type + '\'' +
                '}';
    }
}
