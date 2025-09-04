package codigo;

public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Finaceiro"),
    OPERACOES("Operacoes");

    private String setor;

    Setor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
}
