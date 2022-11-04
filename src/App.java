public class App {
    public static void main(String[] args) throws Exception {
        Profissional profissional = new Profissional();
        profissional.Nome = "Joaquim";
        profissional.SalarioMensalDesejado = 3000;

        System.out.println("Nome do Profissional: " + profissional.Nome);
        System.out.println("Salário Desejado: " + profissional.SalarioMensalDesejado);
        System.out.println("Quantidade de Horas Mês: " + profissional.CalcalaHorasMensais());
        System.out.println("Valor Hora: " + profissional.CalculaValorHora());
    }
}
