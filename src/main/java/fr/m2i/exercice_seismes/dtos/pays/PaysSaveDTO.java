package fr.m2i.exercice_seismes.dtos.pays;

import fr.m2i.exercice_seismes.dtos.seismes.SeismeDTO;

import java.util.List;

public class PaysSaveDTO {
    private String id;
    private String name;
    private String code;
    private List<SeismeDTO> seismes;

    public PaysSaveDTO() {
    }

    public PaysSaveDTO(String id, String name, String code, List<SeismeDTO> seismes) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.seismes = seismes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SeismeDTO> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<SeismeDTO> seismes) {
        this.seismes = seismes;
    }
}
