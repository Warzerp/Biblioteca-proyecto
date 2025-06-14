public class Universidad implements GestionAcademico {
    private Persona[] personas;
    private int contP;

    public Universidad() {
        this.personas = new Persona[20];
        this.contP = 0;
    }

    @Override
    public void agregarPersona(Persona persona) {
        if (this.contP >= 20) {
            System.out.println("No hay espacio");
            return;
        }
        for (int i = 0; i < this.contP; i++) {
            if (this.personas[i].getCodigo().equals(persona.getCodigo())) {
                return;
            }
        }
        this.personas[this.contP] = persona;
        this.contP++;
        System.out.println("Se agrego");

}

    @Override
    public void eliminarPersona(String codigoP) {
    if(this.contP==0){
        System.out.println("No hay personas");
        return;
    }
    for(int i =0;i<this.contP;i++){
        if(this.personas[i].getCodigo().equals(codigoP)){
            for(int j=i;i<this.contP-1;j++){
                this.personas[i]=this.personas[j+1];
            }
            this.personas[this.contP-1]=null;
            this.contP--;
            System.out.println("Se elimino");
            return;
        }
    }
        System.out.println("No existe persona");
    }

    @Override
    public void mostrarPersona(String codigoP) {
        if(this.contP==0){
            System.out.println("No hay personas");
            return;
        }
        for(int i=0;i<this.contP;i++){
            if(this.personas[i].getCodigo().equals(codigoP)){
                this.personas[i].mostrarPersona();
                return;
            }
        }
        System.out.println("No existe persona");
    }

    @Override
    public void agregarMateria(Materia materia, String codigoP) {
        if(this.contP==0){
            System.out.println("No hay personas, por lo tanto no hay materias");
            return;
        }
        //array personas buscar codigo y comparar codigo
        for(int i =0;i<codigoP;i++){
            if(){

                return;
            }
        }
        System.out.println("No existe materia");
    }

    @Override
    public void eliminarMateria(String codigoM, String codigoP) {

    }
    @Override
    public void mostrarMateria(String codigoM, String codigoP){
        //buscar a la persona y llamar la informacion
    }
}
