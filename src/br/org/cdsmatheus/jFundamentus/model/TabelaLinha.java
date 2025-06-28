package br.org.cdsmatheus.jFundamentus.model;

public class TabelaLinha {
    private String papel;
    private String cotacao;
    private String pl;
    private String pvp;
    private String psr;
    private String divYield;
    private String pAtivo;
    private String pCapGiro;
    private String pEbit;
    private String pAtivCircLiq;
    private String evEbit;
    private String evEbitda;
    private String mrgEbit;
    private String mrgLiq;
    private String liqCorr;
    private String roic;
    private String roe;
    private String liqDoisMeses;
    private String patrimLiq;
    private String divBrutPatrim;
    private String crescRecCincoAnos;

    // Construtores, getters e setters
    public TabelaLinha(String papel, String cotacao, String pl, String pvp, String psr, String divYield, String pAtivo, String pCapGiro,
                       String pEbit, String pAtivCircLiq, String evEbit, String evEbitda, String mrgEbit, String mrgLiq,
                       String liqCorr, String roic, String roe, String liqDoisMeses, String patrimLiq, String divBrutPatrim, String crescRecCincoAnos) {
        this.papel = papel;
        this.cotacao = cotacao;
        this.pl = pl;
        this.pvp = pvp;
        this.psr = psr;
        this.divYield = divYield;
        this.pAtivo = pAtivo;
        this.pCapGiro = pCapGiro;
        this.pEbit = pEbit;
        this.pAtivCircLiq = pAtivCircLiq;
        this.evEbit = evEbit;
        this.evEbitda = evEbitda;
        this.mrgEbit = mrgEbit;
        this.mrgLiq = mrgLiq;
        this.liqCorr = liqCorr;
        this.roic = roic;
        this.roe = roe;
        this.liqDoisMeses = liqDoisMeses;
        this.patrimLiq = patrimLiq;
        this.divBrutPatrim = divBrutPatrim;
        this.crescRecCincoAnos = crescRecCincoAnos;
    }

    @Override
    public String toString() {
        return String.format("Papel: %s | Cotação: %s | P/L: %s | P/VP: %s | PSR: %s", papel, cotacao, pl, pvp, psr);
    }
}

