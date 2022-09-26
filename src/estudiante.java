public class estudiante {

    private String nombre;
    private String rut;
    private int edad;
    private String mascotas[];

    public estudiante(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.mascotas = new String[5];
    }
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public int getEdad() {
        return edad;
    }
    public String[] getMascotas() {
        return mascotas;
    }
    public void setMascotas(String[] mascotas) {
        this.mascotas = mascotas;
    }

    

    



    

    
    
}
