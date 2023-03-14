package Entities;

import java.util.ArrayList;

public class Cinema
{
    private int idCinema;
    private String nomCinema;
    private ArrayList<Film> lesFilms;

    public Cinema(int unId, String unNom)
    {
        idCinema = unId;
        nomCinema = unNom;
        lesFilms = new ArrayList<>();
    }

    public int getIdCinema() {
        return idCinema;
    }

    public String getNomCinema() {
        return nomCinema;
    }

    public ArrayList<Film> getLesFilms() {
        return lesFilms;
    }

    public void AjouterUnFilm(Film unFilm)
    {
        lesFilms.add(unFilm);
    }
}
