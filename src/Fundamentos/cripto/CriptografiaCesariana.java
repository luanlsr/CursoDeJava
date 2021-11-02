package Fundamentos.cripto;

public class CriptografiaCesariana {

    int desloc = 3;
    int codeASCII = (int)'A';

    int code = ((codeASCII - 65 + desloc) % 26) + 65;
        System.out.println((char)code);
}
