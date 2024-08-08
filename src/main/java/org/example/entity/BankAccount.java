package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int balanceInRubles;
    private LocalDate localDateAccauntOpened;
    private int bonuses;


    @OneToOne( cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    public BankAccount(int balanceInRubles, LocalDate localDateAccauntOpened, int bonuses) {
        this.balanceInRubles = balanceInRubles;
        this.localDateAccauntOpened = LocalDate.now();
        this.bonuses = bonuses;

    }
}
