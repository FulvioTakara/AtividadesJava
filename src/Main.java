//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Sccreen Match");

//Criando exemplos de variáveis
        String nomeDoFilme = "Top Gun: Maverick";
        int anoDeLancamento = 2002;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.5;

//Executando variavel concatenada com texto
        System.out.println(String.format("""
                Filme: %s
                Ano: %d
                Avaliação: %.1f
                """, nomeDoFilme, anoDeLancamento, notaDoFilme));
//Verificando variável
        if (incluidoNoPlano == true){
            System.out.println("Aproveite o filme!");
        }
        else{
            System.out.println("Faça um upgrade em seu plano para aproveitar o filme!");
        };
    }
}
