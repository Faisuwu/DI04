//BCryptUtils.java - Antoni Maqueda
package conection;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 * Classe d'utilitats per xifrar i verificar contrasenyes utilitzant l'algorisme BCrypt.
 * @author Antoni Maqueda
 */
public class BCryptUtils {
    
    /**
     * Xifra una contrasenya amb BCrypt.
     * 
     * @param password La contrasenya en text pla.
     * @return La contrasenya xifrada.
     */
    public static String hash(String password) {
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }

    /**
     * Verifica una contrasenya respecte una versió xifrada.
     * 
     * @param password La contrasenya en text pla.
     * @param hashedPassword La contrasenya xifrada.
     * @return true si coincideixen, false altrament.
     */
    public static boolean verify(String password, String hashedPassword) {
        return BCrypt.verifyer().verify(password.toCharArray(), hashedPassword).verified;
    }
}