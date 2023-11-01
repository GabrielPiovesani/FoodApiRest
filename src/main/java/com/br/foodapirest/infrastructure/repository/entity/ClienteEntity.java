package com.br.foodapirest.infrastructure.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Data
public class ClienteEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nome;

    private Long cpf;

    @OneToMany
    private List<EnderecoEntity> enderecoEntity;

}
