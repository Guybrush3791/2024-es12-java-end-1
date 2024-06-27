import java.util.Arrays;

public class Prenotazioni {

    final int SEAT_COUNT = 5; // 50

    int index = 0;
    boolean[] seats = null;

    public Prenotazioni() {

        seats = new boolean[SEAT_COUNT];
    }

    public int getIndex() {

        return index;
    }

    public void setIndex(int index) {

        this.index = index;
    }

    public boolean[] getSeats() {

        return seats;
    }

    public void setSeats(boolean[] seats) {

        this.seats = seats;
    }

    public void prenota() {

        prenota(1);
    }

    public void prenota(int seat) throws IllegalArgumentException {

        if (verify(seat)) {

            for (int i = index; i < index + seat; i++) {

                seats[i] = true;
            }

            index += seat;
        } else
            throw new IllegalArgumentException("Non ci sono abbastanza posti disponibili");
    }

    public void annulla() throws IllegalArgumentException {

        annulla(1);
    }

    public void annulla(int seats) throws IllegalArgumentException {

        if (index - seats >= 0) {

            for (int i = index - seats; i < index; i++) {

                this.seats[i] = false;
            }

            index -= seats;
        } else
            throw new IllegalArgumentException("Non ci sono abbastanza posti prenotati");

    }

    @Override
    public String toString() {

        return "Prenotazioni: " + getIndex() + " / " + SEAT_COUNT + "\n" + Arrays.toString(getSeats());
    }

    private boolean verify(int seat) {

        return index + seat <= SEAT_COUNT;
    }
}
