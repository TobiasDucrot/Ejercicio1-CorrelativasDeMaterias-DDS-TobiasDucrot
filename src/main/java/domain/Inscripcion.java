package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscripcion;

    public Inscripcion(Alumno alumno, List<Materia> materiasInscripcion) {
        this.alumno = alumno;
        this.materiasInscripcion = materiasInscripcion;
    }

    public boolean aprobada() {
        for (Materia materia : this.materiasInscripcion) {
            if (!(alumno.materiasAprobadas.containsAll(materia.correlativas))) {
                return false;
            }
        }
        return true;
    }
}
