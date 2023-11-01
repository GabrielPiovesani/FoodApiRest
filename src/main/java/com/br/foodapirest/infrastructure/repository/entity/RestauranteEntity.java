package com.br.foodapirest.infrastructure.repository.entity;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private long cdFilial;

    @OneToOne
    private EnderecoEntity enderecoEntity;


}
