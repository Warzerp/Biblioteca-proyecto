public class MateriaEstudiante extends Materia {
    private int semestre;
    private double nota;

    public MateriaEstudiante(String codigo, String nombre, int semestre, double nota){

        super(codigo, nombre);
        this.semestre = semestre;
        this.nota = nota;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;

    }
    public int getSemestre() {
        return this.semestre;

    }

    public void setNota(double nota){
        this.nota = nota;
    }
    public double getNota(){
        return this.nota;
    }

    @Override
    public void mostrarMateria() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Semestre: "+this.semestre);
        System.out.println("Nota: "+this.nota);
    }
}
