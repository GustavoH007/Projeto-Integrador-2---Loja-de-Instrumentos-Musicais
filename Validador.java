/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
/**
 * Classe para validação dos valores dos campos do sistema
 */
public class Validador {

    /**
     * Valida o CPF do Cliente
     */
    public boolean isCPF(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        if (cpf.equals("00000000000")
                || cpf.equals("11111111111")
                || cpf.equals("22222222222")
                || cpf.equals("33333333333")
                || cpf.equals("44444444444")
                || cpf.equals("55555555555")
                || cpf.equals("66666666666")
                || cpf.equals("77777777777")
                || cpf.equals("88888888888")
                || cpf.equals("99999999999")
                || cpf.length() != 11) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (Exception e) {
            return (false);
        }
    }

    /**
     * Verifica se o campo está vázio
     */
    public boolean isNome(String nome) {
        if (nome.trim().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isRua(String rua) {
        if (rua.trim().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Verifica se o campo CEP está correto
     */
    private static final String CEP_PATTERN = "[0-9]{5}-[0-9]{3}";
    private static final Pattern patternCEP = Pattern.compile(CEP_PATTERN, Pattern.CASE_INSENSITIVE);

    public boolean isCep(String cep) {
        Matcher matcher = patternCEP.matcher(cep);
        return matcher.matches();
    }

    /**
     * Verifica se o campo E-mail está correto
     */
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern patternEMAIL = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public boolean isEmail(String email) {
        Matcher matcher = patternEMAIL.matcher(email);
        return matcher.matches();
    }

    /**
     * Verifica se o campo está vázio
     */
    public boolean isCampoString(String campo) {
        if (campo.trim().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Verifica se o campo foi selecionado corretamente
     */
    public boolean isCampoComboBox(int campo) {
        if (campo == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Verifica se o com está com valor nulo
     */
    public boolean isCampoNull(String campo) {
        if (campo == null) {
            return false;
        } else {
            return true;
        }
    }
}
