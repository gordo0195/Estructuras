package com.BST;
import jdk.nashorn.internal.ir.BinaryNode;

import java.util.Scanner;

public class Usuario {

    private static BinTree.BinNode UUser;

    private String name;
    private String mail;
    private int age;
    private int password;

    public Usuario() {
        super();
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public static void main(String[] args){
        BinTree Usuarios = new BinTree();
        //Usuarios.BinNode() UUser = new

        int i = 0;
        while(i < 1){
            Scanner nameA = new Scanner(System.in);
            Scanner mailA = new Scanner(System.in);
            Scanner ageA = new Scanner(System.in);
            Scanner passwordA = new Scanner(System.in);
            System.out.println("ingrese su nombre: ");
            String nameI = nameA.next();
            System.out.println("ingrese su mail: ");
            String mailI = mailA.next();
            System.out.println("ingrese su edad: ");
            int ageI = ageA.nextInt();
            System.out.println("ingrese su contraseña: ");
            int passwordI = passwordA.nextInt();
            Usuario user = new Usuario();
            user.setName(nameI);
            user.setMail(mailI);
            user.setAge(ageI);
            user.setPassword(passwordI);

            UUser = new BinTree().CallNode();
            i++;


        }
        Usuarios.inOrder(UUser);
        //Usuarios.preOrder(UUser);
        //Usuarios.postOrder(UUser);




    }


}
