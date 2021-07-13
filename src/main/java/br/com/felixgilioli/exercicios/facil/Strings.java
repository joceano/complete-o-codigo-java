package br.com.felixgilioli.exercicios.facil;

import org.apache.commons.lang.StringUtils;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private static final int ELLIPSIS_SIZE = 3;
    private static final String ELLIPSIS = "...";

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
        if (isReturnEllipsis(tamanho))
            return ELLIPSIS;
        return getAbbreviate(s, tamanho);
    }

    private static String getAbbreviate(String s, int tamanho) {
        return StringUtils.abbreviate(s, tamanho + ELLIPSIS_SIZE);
    }

    private static boolean isReturnEllipsis(int tamanho) {
        return tamanho == 0;
    }

    private static boolean isReturnString(String s, int tamanho) {
        return s == null || s.isEmpty() || tamanho < 0 || tamanho >= s.length();
    }

    /**
     * Deve verificar se a senha é nula, vazia ou que não esteja preenchida apenas com espaços em branco.
     * ex: s=null, "", "  "
     * @param s string a ser verificada.
     * @return true se a string estiver em branco.
     */
    public static boolean isBlank(String s) {
        return StringUtils.isBlank(s);
    }

}
