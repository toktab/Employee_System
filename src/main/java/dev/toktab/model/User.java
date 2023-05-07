package dev.toktab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "type_id")
    private int typeId;
    @Column(name = "salary")
    private double salary;
    @Column(name = "budget")
    private double budget;
    @Column(name = "date")
    private Date date;
    @Column(name = "fired")
    private int fired;

    @ManyToOne
    @JoinColumn(name="type_id", nullable=false)
    private Type type;
    @OneToMany(mappedBy = "user")
    private List<SalaryHistory> salaryHistoryList;
    @OneToMany(mappedBy = "user")
    private List<Budget> budgetList;
    @OneToMany(mappedBy = "user")
    private List<Funding> fundingList;//questionable
    @OneToMany(mappedBy = "user")
    private List<Message> messageList;//questionable

}