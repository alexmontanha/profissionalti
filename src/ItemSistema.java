public class ItemSistema {
    public String nome;
    public int complexidade;

    public int CalculaEsforcoHoras() {
         //1 4 (1 = 24, 2 = 48, 3 = 72, 4 = 96)
         switch (complexidade) {
            case 1:
                return 24;
            case 2:
                return 48;
            case 3:
                return 72;
            case 4:
                return 96;
            default:
                return -1;
         }
    }
}
