package br.com.felixgilioli.exercicios.facil;

import org.apache.commons.lang.StringUtils;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private static final int RETICENCIAS = 3;

    private Strings() {}

    /**
     * Deve verificar caso a string {@param s} tenha passado do tamanho {@param tamanho},
     * caso tenha passado, deve-se quebra-la com base no {@param tamanho} passado.
     * Também deve adicionar um reticências no final da string.
     * Exemplo de entrada: s="Felix Gilioli", tamanho=5.
     * Exemplo de saída: "Felix...".
     * obs: caso o tamanho seja maior doque o tamanho da string, deve-se retornar a própria string.
     * @param s string a ser truncada.
     * @param tamanho tamanho máximo da string.
     * @return string truncada.
     */
    public static String getStringTruncada(String s, int tamanho) {
        if (isReturnString(s, tamanho))
            return s;
        if (isReturnEmpty(tamanho))
            return StringUtils.EMPTY;
        return StringUtils.abbreviate(s, tamanho + RETICENCIAS);
    }

    private static boolean isReturnEmpty(int tamanho) {
        return tamanho == 0;
    }

    private static boolean isReturnString(String s, int tamanho) {
        return s == null || s.isEmpty() || tamanho < 0 || tamanho >= s.length();
    }
}
