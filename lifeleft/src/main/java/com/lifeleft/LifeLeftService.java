package com.lifeleft;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;
import java.util.concurrent.ThreadLocalRandom;

@WebService(serviceName = "LifeLeft")
public class LifeLeftService {

    private static final Integer ESPERANCE_VIE_HOMMES = 79;
    private static final Integer ESPERANCE_VIE_FEMMES = 85;

    String homme = "homme";
    String femme = "femme";

    Integer evDereference = 0;

    @WebMethod
    public String anneesRestantesAVivre(String prenom, String sexe, Integer anneeNaissance){

        if(sexe.equals(homme)) evDereference = ESPERANCE_VIE_HOMMES;
        else evDereference = ESPERANCE_VIE_FEMMES;

        Integer anneesRestantes = evDereference - (Year.now().getValue() - anneeNaissance);

        return "Bonjour " + prenom + " Il vous reste à vivre " + anneesRestantes + " années";
    }

    @WebMethod
    public int creerClient(String login, String password) {
        return ThreadLocalRandom.current().nextInt(100, 900);
    }

    @WebMethod
    public String commanderCompteARebours(Integer clientId){
        return "Merci ! Votre commande pour le client : "+ clientId +" de compteur de vie est validée ";
    }
}
