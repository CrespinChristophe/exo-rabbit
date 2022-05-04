package be.technifutur.serviceClient.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface ReservationService {

     List<Reservation> list = new ArrayList<>();

     void create(Reservation reservation);

     void setToFacture(UUID ref);

     List<Reservation> getReservFactures();

}
