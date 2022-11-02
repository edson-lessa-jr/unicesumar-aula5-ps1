package extra;

public class ExemploMaisDeUmaClasse {

    public static void main(String[] args) {
        Pessoa[] pessoasVetor = new Pessoa[3];

        /* instanciar objeto */
        Pessoa objetoPessoa = new Pessoa();
        objetoPessoa.setNome("Edson");
        /* **/
        pessoasVetor[0]=objetoPessoa;

        pessoasVetor[1]=new Pessoa();

        pessoasVetor[1].setNome("Maria");

    }
}
