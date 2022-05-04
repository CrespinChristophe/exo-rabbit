package be.technifutur.serviceClient.model;


import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
public class Reservation {

    private UUID ref;
    private Date arrive; // on part du principe: arrivé à 12h
    private Date depart; // on part du principe: départ à 12h
    private Status status;

    public static enum Status {
        DEMANDE,
        FACTURE
    }

}
