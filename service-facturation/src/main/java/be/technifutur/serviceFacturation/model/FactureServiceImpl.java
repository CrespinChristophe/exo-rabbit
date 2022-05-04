package be.technifutur.serviceFacturation.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FactureServiceImpl implements FactureService{

    List<Facture> factures = new ArrayList<>();

    @Override
    public void createFacture(int nbrNuit, UUID reserv_ref) {

    }

    @Override
    public List<Facture> getFactures() {
        return null;
    }
}
