package com.rocketseat.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data // cria gets e set para todos os atributos
@AllArgsConstructor // contrutor com todos atributos
@NoArgsConstructor // contrutor vazio
public class StudentEntity {
    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;
}
