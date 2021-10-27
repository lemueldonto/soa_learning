import generated.leftlife.LifeLeft;
import generated.leftlife.LifeLeftService;

public class Main {

    public static void main(String[] args) {
        LifeLeft lifeLeft = new LifeLeft();

        LifeLeftService lifeleftsrv = lifeLeft.getLifeLeftServicePort();

        String resultat = lifeleftsrv.anneesRestantesAVivre("john", "homme", 1980);

        System.out.println(resultat);
    }
}
