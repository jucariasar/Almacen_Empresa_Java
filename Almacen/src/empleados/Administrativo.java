/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.Date;

/**
 *
 * @author Camilo
 * email: miloarias@gmail.com
 */
public class Administrativo extends Empleado {
    private static final int MAX_ELEMENTOS = 10;
    
    private String roll;
    
    public Administrativo(long iden, String nom, String apell, Date fRegistro, String tel1,
            String tel2, String email, String passwd, String roll){
        super(iden, nom, apell, fRegistro, tel1, tel2, email, passwd);
        setRoll(roll);
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
