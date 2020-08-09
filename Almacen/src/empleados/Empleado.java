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
public abstract class Empleado {
    
    private long identificacion;
    private String nombre;
    private String apellido;
    private Date fechaDeRegistro;
    private String telefono1;
    private String telefono2;
    private String email;
    private String password;
    private int numElementos; // Para llevar el conteo de elementos prestados.
   
    public Empleado(long iden, String nom, String apell, Date fRegistro, String tel1, String tel2, String email, String passwd){
        setIdentificacion(iden);
        setNombre(apell);
        setApellido(apell);
        setFechaDeRegistro(fRegistro);
        setTelefono1(tel1);
        setTelefono2(tel2);
        setEmail(email);
        setPassword(passwd);
        this.numElementos = 0;
    }
    
    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }
    
    @Override
    public String toString(){
        return String.format("%s %d\n%s %s %s\n%s %d\n%s $s\n%s %s\n%s %s",
                "Identificacion:", getIdentificacion(),
                "Nombre Completo:", getNombre(), getApellido(),
                "Fecha de Registro:",getFechaDeRegistro(),
                "Telefono 1:", getTelefono1(),
                "Telefono 2:", getTelefono2(),
                "E-mail:", getEmail());
    }
    
}
