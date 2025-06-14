public abstract class Materia {
    private String codigo;
    private String nombre;

    public Materia(String codigo,String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    /// Firma, no devuelve nada, no recibe parametros

    public abstract void mostrarMateria();


}
