public interface GestionAcademico {

    public abstract void agregarPersona(Persona persona);
    public abstract void eliminarPersona(String codigoP);
    public abstract void mostrarPersona(String codigoP);
    public abstract void agregarMateria(Materia materia,String codigoP);
    public abstract void eliminarMateria(String codigoM,String codigoP);
    public abstract void mostrarMateria(String codigoM,String codigoP);

}

