/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.*;

/**
 *
 * @author juanc
 */
public class AdminUsuario {

    /**
     * arreglo que usaremos para guardar los usaurios
     */
    ArrayList<Usuario> users = new ArrayList<>();
    
    /**
     * metodo que agrega los usuarios al arreglo
     * @param user usuario
     */
    public void añadirUsuario(Usuario user) {
        users.add(user);
    }
    
    /**
     * metodo que busca a una persona en especifico por su id registrado
     * @param id id registrado por la persona
     * @return un usuario que coincide con el id registrado
     */
    public Usuario buscarPersona(String id){
        for (int i=0; i<users.size(); i++){
            Usuario user = users.get(i);
            if(user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
    
    /**
     * imprime por consola los usuarios registrados y guardados en el arreglo
     * @param users arreglo que guarda los usuarios registrados
     */
    //metodo que muestra los usuarios por consola
    public void mostrarUsuarios(ArrayList<Usuario> users){
        for(int i=0; i<users.size(); i++){
            Usuario user = users.get(i);
            System.out.print("Usuario "+(i+1)+" "+user.toString()+"\n");
        }
    }
    
    /**
     * metodo que genera usuarios y los agrega al arreglo
     */
    public void generarUsuarios(){
        //creamos usuarios
        Usuario user_1 = new Usuario("Juan", "Pérez", "juan.perez@mail.com", "1234567890", "5512345678", "1234");
        Usuario user_2 = new Usuario("Ana", "García", "ana.garcia@mail.com", "0987654321", "5523456789", "5678");
        Usuario user_3 = new Usuario("Carlos", "López", "carlos.lopez@mail.com", "1122334455", "5534567890", "9101");
        Usuario user_4 = new Usuario("María", "Martínez", "maria.martinez@mail.com", "2233445566", "5545678901", "2345");
        Usuario user_5 = new Usuario("Luis", "González", "luis.gonzalez@mail.com", "3344556677", "5556789012", "6789");
        Usuario user_6 = new Usuario("Sofía", "Rodríguez", "sofia.rodriguez@mail.com", "4455667788", "5567890123", "3456");
        Usuario user_7 = new Usuario("Pedro", "Fernández", "pedro.fernandez@mail.com", "5566778899", "5578901234", "7890");
        Usuario user_8 = new Usuario("Lucía", "Ramírez", "lucia.ramirez@mail.com", "6677889900", "5589012345", "4567");
        Usuario user_9 = new Usuario("Jorge", "Santos", "jorge.santos@mail.com", "7788990011", "5590123456", "8901");
        Usuario user_10 = new Usuario("Elena", "Ruiz", "elena.ruiz@mail.com", "8899001122", "5512345679", "5678");
        
        //añadimos los usuarios
        añadirUsuario(user_1);
        añadirUsuario(user_2);
        añadirUsuario(user_3);
        añadirUsuario(user_4);
        añadirUsuario(user_5);
        añadirUsuario(user_6);
        añadirUsuario(user_7);
        añadirUsuario(user_8);
        añadirUsuario(user_9);
        añadirUsuario(user_10);
    }

    /**
     * metodos de acceso
     * @return el arreglo
     */
    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
    
    

}
