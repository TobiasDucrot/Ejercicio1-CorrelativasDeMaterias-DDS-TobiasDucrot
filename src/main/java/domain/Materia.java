package domain;

import java.util.List;

public class Materia {
    private Integer codigo;
    public List<Materia> correlativas;
    private String nombre;

    public Materia(Integer codigo, List<Materia> correlativas, String nombre) {
        this.codigo = codigo;
        this.correlativas = correlativas;
        this.nombre = nombre;
    }
}