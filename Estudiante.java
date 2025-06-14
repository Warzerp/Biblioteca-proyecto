public class Estudiante extends Persona {
    private MateriaEstudiante[] materias;
    private int contadorM;

    public Estudiante(String nombre, String codigo, String correo) {

        super(nombre, codigo, correo);
        this.materias = new MateriaEstudiante[10];
        this.contadorM = 0;
    }

    @Override
    public void agregarMateria(Materia materia) {
        if (this.contadorM >= 10) {
            System.out.println("No hay espacio");
            return;
        }
        for (int i = 0; i < this.contadorM; i++) {
            if (this.materias[i].getCodigo().equals(materia.getCodigo())) {
                System.out.println("Ya existe");
                return;
            }
        }
        if(materia instanceof MateriaEstudiante){
            this.materias[this.contadorM] =(MateriaEstudiante) materia;
            this.contadorM++;
            System.out.println("Se agrego materia");
        }else{
            System.out.println("Esa materia no pertenece a estudiante");
        }
    }

    @Override
    public void eliminarMateria(String codigoM){
        if(this.contadorM==0){
            System.out.println("No hay materias");
            return;
        }
        for(int i=0;i<contadorM;i++){
            if(this.materias[i].getCodigo().equals(codigoM)){
                for(int j=i;j<contadorM-1;j++){
                    this.materias[i]=this.materias[i+1];
                }
                this.materias[this.contadorM-1]=null;
                this.contadorM--;
                System.out.println("Se elimino");
                return;
            }
        }
        System.out.println("No existe la materia");
    }

    @Override
    public void consultarMateria(String codigoM) {
    if(this.contadorM==0){
        System.out.println("No hay materias");
        return;
    }
    for(int i=0;i<this.contadorM;i++){
        if(this.materias[i].getCodigo().equals(codigoM)){
            this.materias[i].mostrarMateria();
            return;
        }
    }
        System.out.println("No existe materia");
    }

    @Override
    public void mostrarPersona(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Codigo:" +this.getCodigo());
        System.out.println("Correo:" +this.getCorreo());

        if(this.contadorM>0){
            for(int i=0;i<contadorM;i++){
                System.out.println("Materia N"+(i+1));
                System.out.println("Semestre"+this.materias[i].getSemestre());;
                System.out.println("Nota: "+this.materias[i].getNota());

            }
        }else{
            System.out.println("No tiene materias agregadas");
        }

    }
}
