package Tools;

import Entities.Acteur;
import Entities.Cinema;
import Entities.Film;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    // A compléter ici

    public void LoadDatasCines(ArrayList<Cinema> desCinemas)
    {
        columns = new String[]{"Id","Nom"};
        rows = new Object[desCinemas.size()][2];
        int i = 0;

        // afin de remplir le tableau des lignes

        for(Cinema cni : desCinemas)
        {
            rows[i][0] = cni.getIdCinema();
            rows[i][1] = cni.getNomCinema();
            i++;
        }
        // Permet de rafraichir l'interface graphique
        fireTableChanged(null);
    }

    public void LoadDataFilms(ArrayList<Film> desFilms)
    {
        columns = new String[]{"Numéro","Nom","Nb Notes","Total Notes"};
        rows = new Object[desFilms.size()][4];
        int i = 0;

        // afin de remplir le tableau des lignes

        for(Film flm : desFilms)
        {
            rows[i][0] = flm.getIdFilm();
            rows[i][1] = flm.getNomFilm();
            rows[i][2] = flm.getNbVotes();
            rows[i][3] = flm.getTotalVotes();
            i++;
        }
        fireTableChanged(null);
    }

    public void LoadDatasActeurs(ArrayList<Acteur> desActeurs)
    {
        columns = new String[]{"Id","Nom", "Notes"};
        rows = new Object[desActeurs.size()][3];
        int i = 0;
        for(Acteur act : desActeurs)
        {
            rows[i][0] = act.getIdActeur();
            rows[i][1] = act.getNomActeur();
            rows[i][2] = act.getNoteActeur();
            i++;
        }
        fireTableChanged(null);
    }

    public void setValueAt(Object value, int row, int col)
    {

        fireTableCellUpdated(row, col);
    }
}
