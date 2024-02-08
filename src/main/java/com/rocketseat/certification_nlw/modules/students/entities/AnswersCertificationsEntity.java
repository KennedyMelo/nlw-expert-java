package com.rocketseat.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data // cria gets e set para todos os atributos
@AllArgsConstructor // contrutor com todos atributos
@NoArgsConstructor // contrutor vazio
public class AnswersCertificationsEntity {

    private UUID id;
    private UUID CertificationId;
    private UUID studentId;
    private UUID questionId;
    private UUID answerId;
    private boolean isCorrect;


}
