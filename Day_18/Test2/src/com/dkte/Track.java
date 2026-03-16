package com.dkte;


public class Track {
    private int trackId;
    private String title;
    private int albumId;
    private int artistId;

    public Track(int trackId, String title, int albumId, int artistId) {
        this.trackId = trackId;
        this.title = title;
        this.albumId = albumId;
        this.artistId = artistId;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getTitle() {
        return title;
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getArtistId() {
        return artistId;
    }

    public String toString() {
        return "\nTrack ID: " + trackId + ", Title: " + title +
               ", Album ID: " + albumId + ", Artist ID: " + artistId;
    }
}
