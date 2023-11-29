package listadopersonas;

public class Persona {
    
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private static int numeroPersonas;
    
    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }
    
    //Constructor con argumentos
    public Persona(String nombre, String telefono, String email){
        this();// se llama al constructor vacío de manera explicita, si se quita, de igual manera se llama de manera implicita
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    //get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona:" + "id = " + id + ", nombre = " + nombre + ", telefono = " + telefono + ", email = " + email;
    }   
}
