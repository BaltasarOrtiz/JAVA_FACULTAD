package ejercicio_1.example.modelos;

public class ViajeroFrecuente {
    private int numero;
    private int dni;
    private int millas;
    private String nombre;
    private String apellido;


    public ViajeroFrecuente(int numero, int dni, int millas, String nombre, String apellido) {
        this.numero = numero;
        this.dni = dni;
        this.millas = millas;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getMillas() {
        return this.millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void acumularMillas(int millas) {
        this.millas += millas;
    }

    public void canjearMillas(int millas) {
        this.millas -= millas;
    }

    @Override
    public String toString() {
        return "ViajeroFrecuente [apellido=" + apellido + ", dni=" + dni + ", millas=" + millas + ", nombre=" + nombre
                + ", numero=" + numero + "]";
    }
}