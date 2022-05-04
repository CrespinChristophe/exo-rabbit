package be.technifutur.serviceFacturation.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Facture {

    private String nomClient;
    private double prixTotal;
    private String adresseFacturation;

}
