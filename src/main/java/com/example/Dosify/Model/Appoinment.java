package com.example.Dosify.Model;


import com.example.Dosify.Enum.DoseNo;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Appoinment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "Appointment_No")
    String appointmentNo;

    @Column(name = "Dose_No")
    @Enumerated(EnumType.STRING)
    DoseNo doseNo;



    @Column(name = "Appointment_Date")
    @CreationTimestamp
    Date appointmentDate;


    @ManyToOne
    @JoinColumn
    User user;

    @ManyToOne
    @JoinColumn
    Doctor doctor;

}
