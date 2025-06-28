package br.org.cdsmatheus.jFundamentus.model;

public class Papel {
	// Indicadores numéricos
	private Double Cotacao, divBrutpatrim, divYeld, evEbit, evEbitda,
		liq2Meses, liqCorr, mrgEbit, mrgLiq, PapelAtivoCirLiq,
		pAtivo, patrLiq, pCapGiro, pEBIT, pl, psr, pvp, roe, roic,
		valorMercado, valorFirma, nroAcoes,
		oscilDia, oscilMes, oscil30d, oscil12m, oscil2025, oscil2024,
		oscil2023, oscil2022, oscil2021, oscil2020,
		lpa, vpa, margBruta, margEBIT, margLiquida, ebitAtivo,
		evEbitda2, divBrutPatrim, cresRec5a, giroAtivos,
		ativo, depositos, cartCredito,
		resultIntFin_12m, recServ_12m, lucroLiquido_12m,
		resultIntFin_3m, recServ_3m, lucroLiquido_3m, Min52Sem, Max52Sem, VolMed2m;

	// Identificação e metadados
	private String Papel, Tipo, DataUltCot, Empresa, Setor, Subsetor,
		UltBalancoProcessado;

	public Double getCotacao() {
		return Cotacao;
	}

	public void setCotacao(Double cotacao) {
		Cotacao = cotacao;
	}

	public Double getDivBrutpatrim() {
		return divBrutpatrim;
	}

	public void setDivBrutpatrim(Double divBrutpatrim) {
		this.divBrutpatrim = divBrutpatrim;
	}

	public Double getDivYeld() {
		return divYeld;
	}

	public void setDivYeld(Double divYeld) {
		this.divYeld = divYeld;
	}

	public Double getEvEbit() {
		return evEbit;
	}

	public void setEvEbit(Double evEbit) {
		this.evEbit = evEbit;
	}

	public Double getEvEbitda() {
		return evEbitda;
	}

	public void setEvEbitda(Double evEbitda) {
		this.evEbitda = evEbitda;
	}

	public Double getLiq2Meses() {
		return liq2Meses;
	}

	public void setLiq2Meses(Double liq2Meses) {
		this.liq2Meses = liq2Meses;
	}

	public Double getLiqCorr() {
		return liqCorr;
	}

	public void setLiqCorr(Double liqCorr) {
		this.liqCorr = liqCorr;
	}

	public Double getMrgEbit() {
		return mrgEbit;
	}

	public void setMrgEbit(Double mrgEbit) {
		this.mrgEbit = mrgEbit;
	}

	public Double getMrgLiq() {
		return mrgLiq;
	}

	public void setMrgLiq(Double mrgLiq) {
		this.mrgLiq = mrgLiq;
	}

	public Double getPapelAtivoCirLiq() {
		return PapelAtivoCirLiq;
	}

	public void setPapelAtivoCirLiq(Double papelAtivoCirLiq) {
		PapelAtivoCirLiq = papelAtivoCirLiq;
	}

	public Double getpAtivo() {
		return pAtivo;
	}

	public void setpAtivo(Double pAtivo) {
		this.pAtivo = pAtivo;
	}

	public Double getPatrLiq() {
		return patrLiq;
	}

	public void setPatrLiq(Double patrLiq) {
		this.patrLiq = patrLiq;
	}

	public Double getpCapGiro() {
		return pCapGiro;
	}

	public void setpCapGiro(Double pCapGiro) {
		this.pCapGiro = pCapGiro;
	}

	public Double getpEBIT() {
		return pEBIT;
	}

	public void setpEBIT(Double pEBIT) {
		this.pEBIT = pEBIT;
	}

	public Double getPl() {
		return pl;
	}

	public void setPl(Double pl) {
		this.pl = pl;
	}

	public Double getPsr() {
		return psr;
	}

	public void setPsr(Double psr) {
		this.psr = psr;
	}

	public Double getPvp() {
		return pvp;
	}

	public void setPvp(Double pvp) {
		this.pvp = pvp;
	}

	public Double getRoe() {
		return roe;
	}

	public void setRoe(Double roe) {
		this.roe = roe;
	}

	public Double getRoic() {
		return roic;
	}

	public void setRoic(Double roic) {
		this.roic = roic;
	}

	public Double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(Double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public Double getValorFirma() {
		return valorFirma;
	}

	public void setValorFirma(Double valorFirma) {
		this.valorFirma = valorFirma;
	}

	public Double getNroAcoes() {
		return nroAcoes;
	}

	public void setNroAcoes(Double nroAcoes) {
		this.nroAcoes = nroAcoes;
	}

	public Double getOscilDia() {
		return oscilDia;
	}

	public void setOscilDia(Double oscilDia) {
		this.oscilDia = oscilDia;
	}

	public Double getOscilMes() {
		return oscilMes;
	}

	public void setOscilMes(Double oscilMes) {
		this.oscilMes = oscilMes;
	}

	public Double getOscil30d() {
		return oscil30d;
	}

	public void setOscil30d(Double oscil30d) {
		this.oscil30d = oscil30d;
	}

	public Double getOscil12m() {
		return oscil12m;
	}

	public void setOscil12m(Double oscil12m) {
		this.oscil12m = oscil12m;
	}

	public Double getOscil2025() {
		return oscil2025;
	}

	public void setOscil2025(Double oscil2025) {
		this.oscil2025 = oscil2025;
	}

	public Double getOscil2024() {
		return oscil2024;
	}

	public void setOscil2024(Double oscil2024) {
		this.oscil2024 = oscil2024;
	}

	public Double getOscil2023() {
		return oscil2023;
	}

	public void setOscil2023(Double oscil2023) {
		this.oscil2023 = oscil2023;
	}

	public Double getOscil2022() {
		return oscil2022;
	}

	public void setOscil2022(Double oscil2022) {
		this.oscil2022 = oscil2022;
	}

	public Double getOscil2021() {
		return oscil2021;
	}

	public void setOscil2021(Double oscil2021) {
		this.oscil2021 = oscil2021;
	}

	public Double getOscil2020() {
		return oscil2020;
	}

	public void setOscil2020(Double oscil2020) {
		this.oscil2020 = oscil2020;
	}

	public Double getLpa() {
		return lpa;
	}

	public void setLpa(Double lpa) {
		this.lpa = lpa;
	}

	public Double getVpa() {
		return vpa;
	}

	public void setVpa(Double vpa) {
		this.vpa = vpa;
	}

	public Double getMargBruta() {
		return margBruta;
	}

	public void setMargBruta(Double margBruta) {
		this.margBruta = margBruta;
	}

	public Double getMargEBIT() {
		return margEBIT;
	}

	public void setMargEBIT(Double margEBIT) {
		this.margEBIT = margEBIT;
	}

	public Double getMargLiquida() {
		return margLiquida;
	}

	public void setMargLiquida(Double margLiquida) {
		this.margLiquida = margLiquida;
	}

	public Double getEbitAtivo() {
		return ebitAtivo;
	}

	public void setEbitAtivo(Double ebitAtivo) {
		this.ebitAtivo = ebitAtivo;
	}

	public Double getEvEbitda2() {
		return evEbitda2;
	}

	public void setEvEbitda2(Double evEbitda2) {
		this.evEbitda2 = evEbitda2;
	}

	public Double getDivBrutPatrim() {
		return divBrutPatrim;
	}

	public void setDivBrutPatrim(Double divBrutPatrim) {
		this.divBrutPatrim = divBrutPatrim;
	}

	public Double getCresRec5a() {
		return cresRec5a;
	}

	public void setCresRec5a(Double cresRec5a) {
		this.cresRec5a = cresRec5a;
	}

	public Double getGiroAtivos() {
		return giroAtivos;
	}

	public void setGiroAtivos(Double giroAtivos) {
		this.giroAtivos = giroAtivos;
	}

	public Double getAtivo() {
		return ativo;
	}

	public void setAtivo(Double ativo) {
		this.ativo = ativo;
	}

	public Double getDepositos() {
		return depositos;
	}

	public void setDepositos(Double depositos) {
		this.depositos = depositos;
	}

	public Double getCartCredito() {
		return cartCredito;
	}

	public void setCartCredito(Double cartCredito) {
		this.cartCredito = cartCredito;
	}

	public Double getResultIntFin_12m() {
		return resultIntFin_12m;
	}

	public void setResultIntFin_12m(Double resultIntFin_12m) {
		this.resultIntFin_12m = resultIntFin_12m;
	}

	public Double getRecServ_12m() {
		return recServ_12m;
	}

	public void setRecServ_12m(Double recServ_12m) {
		this.recServ_12m = recServ_12m;
	}

	public Double getLucroLiquido_12m() {
		return lucroLiquido_12m;
	}

	public void setLucroLiquido_12m(Double lucroLiquido_12m) {
		this.lucroLiquido_12m = lucroLiquido_12m;
	}

	public Double getResultIntFin_3m() {
		return resultIntFin_3m;
	}

	public void setResultIntFin_3m(Double resultIntFin_3m) {
		this.resultIntFin_3m = resultIntFin_3m;
	}

	public Double getRecServ_3m() {
		return recServ_3m;
	}

	public void setRecServ_3m(Double recServ_3m) {
		this.recServ_3m = recServ_3m;
	}

	public Double getLucroLiquido_3m() {
		return lucroLiquido_3m;
	}

	public void setLucroLiquido_3m(Double lucroLiquido_3m) {
		this.lucroLiquido_3m = lucroLiquido_3m;
	}

	public Double getMin52Sem() {
		return Min52Sem;
	}

	public void setMin52Sem(Double min52Sem) {
		Min52Sem = min52Sem;
	}

	public Double getMax52Sem() {
		return Max52Sem;
	}

	public void setMax52Sem(Double max52Sem) {
		Max52Sem = max52Sem;
	}

	public Double getVolMed2m() {
		return VolMed2m;
	}

	public void setVolMed2m(Double volMed2m) {
		VolMed2m = volMed2m;
	}

	public String getPapel() {
		return Papel;
	}

	public void setPapel(String papel) {
		Papel = papel;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getDataUltCot() {
		return DataUltCot;
	}

	public void setDataUltCot(String dataUltCot) {
		DataUltCot = dataUltCot;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public String getSetor() {
		return Setor;
	}

	public void setSetor(String setor) {
		Setor = setor;
	}

	public String getSubsetor() {
		return Subsetor;
	}

	public void setSubsetor(String subsetor) {
		Subsetor = subsetor;
	}

	public String getUltBalancoProcessado() {
		return UltBalancoProcessado;
	}

	public void setUltBalancoProcessado(String ultBalancoProcessado) {
		UltBalancoProcessado = ultBalancoProcessado;
	}


}
