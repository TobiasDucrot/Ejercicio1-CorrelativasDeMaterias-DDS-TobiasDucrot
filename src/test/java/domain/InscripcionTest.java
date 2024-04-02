package domain;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class InscripcionTest {

    private final Materia diseno;
    private final Materia ads;
    private final Materia paradigmas;
    private final Materia sintaxis;

    public InscripcionTest() {
        ads = new Materia(123, new ArrayList<>(), "Analisis de Sistemas");
        paradigmas = new Materia(456, new ArrayList<>(), "Paradigmas de Programacion");
        sintaxis = new Materia(789, new ArrayList<>(), "Sintaxis Y Semantica de los Lenguajes");
        diseno = new Materia(159, Arrays.asList(paradigmas, sintaxis, ads), "Diseño de Sistemas");
    }

    private Alumno crearAlumno(Materia ... materias) {
        return new Alumno("001", "Tobias", Arrays.asList(materias));
    }

    @Test
    public void testCorrelativasAprobadas() {
        Alumno alumno = crearAlumno(paradigmas, sintaxis, ads);
        List<Materia> materiasInscripcion = Collections.singletonList(diseno);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscripcion);

        boolean resultado = inscripcion.aprobada();
        assertTrue(resultado);
    }

    @Test
    public void testCorrelativasNoAprobadas() {
        Alumno alumno = crearAlumno(paradigmas, sintaxis);
        List<Materia> materiasInscripcion = Collections.singletonList(diseno);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscripcion);

        boolean resultado = inscripcion.aprobada();
        assertFalse(resultado);
    }
}