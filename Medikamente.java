import java.util.Objects;

/**
 * Repräsentiert Medikamente mit einer eindeutigen ID, einem Namen, einem Preis und einer zugehörigen Krankheit.
 */

public class Medikamente {
    private int id;
    private String name;
    private double preis;
    private String krankheit;

    /**
     * Erstellt ein neues {@code Krankheit}-Objekt mit einer ID, einem Namen, einem Preis und einer Krankheit.
     *
     * @param id     Die eindeutige ID dem Medikamente.
     * @param name   Der Name dem Medikamente.
     * @param preis  Der Preis dem Medikamente.
     * @param krankheit Die zugehörige Krankheit dem Medikamente (z. B. "Virus").
     */

    public Medikamente(int id,String name, double preis, String krankheit) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.krankheit = krankheit;
    }


    public int getId() {
        return id;
    }

    public String getKrankheit() {
        return krankheit;
    }

    public void setKrankheit(String krankheit) {
        this.krankheit = krankheit;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Medikamente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preis=" + preis +
                ", krankheit='" + krankheit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medikamente medikamente = (Medikamente) o;
        return id == medikamente.id && Double.compare(preis, medikamente.preis) == 0 && Objects.equals(name, medikamente.name) && Objects.equals(krankheit, medikamente.krankheit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, preis, krankheit);
    }
}

