/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codegui;

import gui.TelaLogin;
import javax.swing.JFrame;

/**
 * Classe responsável pela inicialização do programa, mais necessariamente, da abertura da tela de Login.
 * @author Tarcísio
 */
public class Principal {
    public static void main(String[] args) {
        TelaLogin tl = new TelaLogin();
        tl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tl.setLocationRelativeTo(null);
        tl.setVisible(true);
    }
}
