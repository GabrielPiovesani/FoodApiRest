package com.br.foodapirest.infrastructure.repository.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Data
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private long cep;

    private String rua;

    private String bairro;

    private String estado;

    private String pais;





}
