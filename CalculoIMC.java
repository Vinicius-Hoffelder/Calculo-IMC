package TrabalhoIMC;

public class CalculoIMC {

    public static String classificarIMC(double imc, char genero) {
        String classificacao = "";

        switch (genero) {
            case 'M':
            case 'm':
                if (imc >= 40) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            default:
                classificacao = "Gênero inválido";
                break;
        }

        return classificacao;
    }

    public static void main(String[] args) {

        String nome = IO.readln("Informe seu nome: ");

        char genero = IO.readln("Informe seu gênero (M/F/N): ").charAt(0);

        double altura = Double.parseDouble(IO.readln("Informe sua altura (m): "));

        double peso = Double.parseDouble(IO.readln("Informe seu peso (kg): "));

        double imc = peso / (altura * altura);

        String classificacao = classificarIMC(imc, genero);

        IO.println("\n--- Resultado ---");
        IO.println("Nome: " + nome);
        IO.println("Gênero: " + genero);
        IO.println("IMC: " + String.format("%.2f", imc));
        IO.println("Classificação: " + classificacao);

        IO.println("\nAtitus Educação - O lado certo da força!!!");
    }
}