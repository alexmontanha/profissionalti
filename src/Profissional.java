public class Profissional {
    public String Nome;
    public double SalarioMensalDesejado;
    public double FHD = 7;
    public double diasUteisMensaisPadrao = 20;

    public double CalcalaHorasMensais() {
        return FHD * diasUteisMensaisPadrao;
    }

    public double CalculaValorHora() {
        return (SalarioMensalDesejado * 2) / CalcalaHorasMensais();
    }
}
