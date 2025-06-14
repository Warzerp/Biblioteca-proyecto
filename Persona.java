public abstract class Persona {
    private String nombre;
    private String codigo;
    private String correo;

    public Persona(String nombre, String codigo, String correo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return  this.codigo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public abstract void agregarMateria (Materia materia);
    public abstract void eliminarMateria (String codigoM);
    public abstract void consultarMateria(String codigoM);
    public abstract void mostrarPersona();
}
