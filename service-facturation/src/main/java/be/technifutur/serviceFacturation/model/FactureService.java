package be.technifutur.serviceFacturation.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface FactureService {



    void createFacture(int nbrNuit, UUID reserv_ref);

    List<Facture> getFactures();

}
