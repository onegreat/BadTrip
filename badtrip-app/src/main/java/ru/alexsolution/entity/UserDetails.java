package ru.alexsolution.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_details")
public class UserDetails {

    @Id
    private UUID id;

    private String avatar;

    private String aboutMe;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
