package ageOverLoading;

/**
 * Created by leandromoras on 5/26/15.
 */
public class Tank {

    public String attacksTo(Defender defender){
        return defender.isAttacked();
    }

    public String attackWithoutDelegation(Defender defender){
        return "Attack to Defender";
    }

    public String attackWithoutDelegation(Tower defender){
        return "Attacks to Tower!";
    }
}
