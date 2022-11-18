public class App {
    public static void main(String[] args) throws Exception {
        Profissional profissional = new Profissional();
        profissional.Nome = "Joaquim";
        profissional.SalarioMensalDesejado = 3000;

        //Login
        //Dados demográficos (sexo, idade, estado)
        //Formulário (quatro seleções finalistas)
        //Relatório (os mais votados, por faixa etária, sexo e estado)
        //Flutter (Android/Publicado na Loja Google)

        //Login (24 BD, 24 BE, 48 FE) = 96 Horas (Médio/Complexo)
        //Dados demográficos (gênero (masculino, feminimo e prefiro não opinar), idade, estado) = 72 Horas
        // Formulário (quatro seleções finalistas) = 72 horas
        //Relatório (os mais votados, por faixa etária, sexo e estado) = 24 horas
        //1 4 (1 = 24, 2 = 48, 3 = 72, 4 = 96)

        System.out.println("Nome do Profissional: " + profissional.Nome);
        System.out.println("Salário Desejado: " + profissional.SalarioMensalDesejado);
        System.out.println("Quantidade de Horas Mês: " + profissional.CalcalaHorasMensais());
        System.out.println("Valor Hora: " + profissional.CalculaValorHora());

        ItemSistema itemLogin = new ItemSistema();
        itemLogin.nome = "Tela de Login";
        itemLogin.complexidade = 4;

        double valorTotal = profissional.CalculaValorHora() * itemLogin.CalculaEsforcoHoras();

        System.out.println("Item de Sistema: " + itemLogin.nome);
        System.out.println("Complexidade do Item de Sistema: " + itemLogin.complexidade);
        System.out.println("Esforço do Item de Sistema: " + itemLogin.CalculaEsforcoHoras());

        System.out.println("Valor total do sistema: " + valorTotal);
       
    }
}
