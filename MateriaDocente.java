public class MateriaDocente extends Materia {
    private String modalidad;

    public MateriaDocente(String codigo,String nombre, String modalidad){
        super(codigo, nombre);
        this.modalidad = modalidad;
    }
    public void setModalidad(String modalidad){
        this.modalidad = modalidad;
    }
    public String getModalidad(){
        return this.modalidad;
    }

    @Override
    public void mostrarMateria(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Modalidad: "+this.modalidad);

    }

}
