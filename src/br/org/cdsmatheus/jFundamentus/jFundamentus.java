package br.org.cdsmatheus.jFundamentus;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import br.org.cdsmatheus.jFundamentus.model.LinhaResultado;
import br.org.cdsmatheus.jFundamentus.model.Papel;
import br.org.cdsmatheus.jFundamentus.model.TabelaLinha;

public class jFundamentus {
	public jFundamentus() {}

	public Papel get_papel(String ticker) {
		Papel p = new Papel();
		try {
			String url = "https://www.fundamentus.com.br/detalhes.php?papel=" + ticker;
			Document doc = Jsoup.connect(url).get();

			// Mapa para armazenar campo => valor
			Map<String, String> dados = new LinkedHashMap<>();

			// Coleta de todas as tabelas com dados
			Elements tabelas = doc.select("table.w728");
			for (Element tabela : tabelas) {
				Elements linhas = tabela.select("tr");
				for (Element linha : linhas) {
					Elements colunas = linha.select("td");
					for (int i = 0; i < colunas.size() - 1; i += 2) {
						String campo = colunas.get(i).text().trim();
						String valor = colunas.get(i + 1).text().trim();
						if (!campo.isEmpty()) {
							dados.put(campo.replace("?", ""), valor);
						}
					}
				}
			}
			
			// Preencher os dados no objeto Papel
			//preencherPapelComDados(p, dados, ticker);
			p.setPapel(ticker); // seta o ticker manualmente

		    // Textuais
			p.setTipo(dados.getOrDefault("Tipo", ""));
		    p.setEmpresa(dados.getOrDefault("Empresa", ""));
		    p.setSetor(dados.getOrDefault("Setor", ""));
		    p.setSubsetor(dados.getOrDefault("Subsetor", ""));
		    p.setDataUltCot(dados.getOrDefault("Data últ cot", ""));
		    p.setUltBalancoProcessado(dados.getOrDefault("Últ balanço processado", ""));

		    // Numéricos
		    p.setCotacao((parse(dados.get("Cotação"))));
		    p.setMin52Sem(parse(dados.get("Min 52 sem")));
		    p.setMax52Sem(parse(dados.get("Max 52 sem")));
		    p.setVolMed2m(parse(dados.get("Vol $ méd (2m)")));
		    p.setValorMercado(parse(dados.get("Valor de mercado")));
		    p.setValorFirma(parse(dados.get("Valor da firma")));
		    p.setNroAcoes(parse(dados.get("Nro. Ações")));

		    // Oscilações
		    p.setOscilDia(parse(dados.get("Dia")));
		    p.setOscilMes(parse(dados.get("Mês")));
		    p.setOscil30d(parse(dados.get("30 dias")));
		    p.setOscil12m(parse(dados.get("12 meses")));
		    p.setOscil2025(parse(dados.get("2025")));
		    p.setOscil2024(parse(dados.get("2024")));
		    p.setOscil2023(parse(dados.get("2023")));
		    p.setOscil2022(parse(dados.get("2022")));
		    p.setOscil2021(parse(dados.get("2021")));
		    p.setOscil2020(parse(dados.get("2020")));

		    // Indicadores fundamentalistas
		    p.setPl(parse(dados.get("P/L")));
		    p.setLpa(parse(dados.get("LPA")));
		    p.setPvp(parse(dados.get("P/VP")));
		    p.setVpa(parse(dados.get("VPA")));
		    p.setpEBIT(parse(dados.get("P/EBIT")));
		    p.setMargBruta(parse(dados.get("Marg. Bruta")));
		    p.setPsr(parse(dados.get("PSR")));
		    p.setMrgEbit(parse(dados.get("Marg. EBIT")));
		    p.setpAtivo(parse(dados.get("P/Ativos")));
		    p.setMrgLiq(parse(dados.get("Marg. Líquida")));
		    p.setpCapGiro(parse(dados.get("P/Cap. Giro")));
		    p.setEbitAtivo(parse(dados.get("EBIT / Ativo")));
		    p.setPapelAtivoCirLiq(parse(dados.get("P/Ativ Circ Liq")));
		    p.setRoic(parse(dados.get("ROIC")));
		    p.setRoe(parse(dados.get("ROE")));
		    p.setEvEbitda(parse(dados.get("EV / EBITDA")));
		    p.setLiqCorr(parse(dados.get("Liquidez Corr")));
		    p.setEvEbit(parse(dados.get("EV / EBIT")));
		    p.setDivBrutPatrim(parse(dados.getOrDefault("Div Br/ Patrim","0.0")));
		    p.setCresRec5a(parse(dados.get("Cres. Rec (5a)")));
		    p.setGiroAtivos(parse(dados.get("Giro Ativos")));
		    p.setDivYeld(parse(dados.get("Div. Yield")));

		    // Dados do balanço patrimonial
		    p.setAtivo(parse(dados.get("Ativo")));
		    p.setDepositos(parse(dados.get("Depósitos")));
		    p.setCartCredito(parse(dados.get("Cart. de Crédito")));
		    p.setPatrLiq(parse(dados.get("Patrim. Líq")));

		    // Demonstrativo de Resultados
		    p.setResultIntFin_12m(parse(dados.get("Result Int Financ")));
		    p.setRecServ_12m(parse(dados.get("Rec Serviços")));
		    p.setLucroLiquido_12m(parse(dados.get("Lucro Líquido")));
		    p.setResultIntFin_3m(parse(dados.get("Result Int Financ")));
		    p.setRecServ_3m(parse(dados.get("Rec Serviços")));
		    p.setLucroLiquido_3m(parse(dados.get("Lucro Líquido")));
			return p;
		} catch (Exception e) {
			System.out.println("Erro ao processar o papel: " + e.getMessage());
			return null;
		}
	}

	

	private void preencherPapelComDados(Papel p, Map<String, String> dados, String ticker) {
	    p.setPapel(ticker); // seta o ticker manualmente

	    // Textuais
	    p.setTipo(dados.getOrDefault("Tipo", ""));
	    p.setEmpresa(dados.getOrDefault("Empresa", ""));
	    p.setSetor(dados.getOrDefault("Setor", ""));
	    p.setSubsetor(dados.getOrDefault("Subsetor", ""));
	    p.setDataUltCot(dados.getOrDefault("Data últ cot", ""));
	    p.setUltBalancoProcessado(dados.getOrDefault("Últ balanço processado", ""));

	    // Numéricos
	    p.setCotacao((parse(dados.get("Cotação"))));
	    p.setMin52Sem(parse(dados.get("Min 52 sem")));
	    p.setMax52Sem(parse(dados.get("Max 52 sem")));
	    p.setVolMed2m(parse(dados.get("Vol $ méd (2m)")));
	    p.setValorMercado(parse(dados.get("Valor de mercado")));
	    p.setValorFirma(parse(dados.get("Valor da firma")));
	    p.setNroAcoes(parse(dados.get("Nro. Ações")));

	    // Oscilações
	    p.setOscilDia(parse(dados.get("Dia")));
	    p.setOscilMes(parse(dados.get("Mês")));
	    p.setOscil30d(parse(dados.get("30 dias")));
	    p.setOscil12m(parse(dados.get("12 meses")));
	    p.setOscil2025(parse(dados.get("2025")));
	    p.setOscil2024(parse(dados.get("2024")));
	    p.setOscil2023(parse(dados.get("2023")));
	    p.setOscil2022(parse(dados.get("2022")));
	    p.setOscil2021(parse(dados.get("2021")));
	    p.setOscil2020(parse(dados.get("2020")));

	    // Indicadores fundamentalistas
	    p.setPl(parse(dados.get("P/L")));
	    p.setLpa(parse(dados.get("LPA")));
	    p.setPvp(parse(dados.get("P/VP")));
	    p.setVpa(parse(dados.get("VPA")));
	    p.setpEBIT(parse(dados.get("P/EBIT")));
	    p.setMargBruta(parse(dados.get("Marg. Bruta")));
	    p.setPsr(parse(dados.get("PSR")));
	    p.setMrgEbit(parse(dados.get("Marg. EBIT")));
	    p.setpAtivo(parse(dados.get("P/Ativos")));
	    p.setMrgLiq(parse(dados.get("Marg. Líquida")));
	    p.setpCapGiro(parse(dados.get("P/Cap. Giro")));
	    p.setEbitAtivo(parse(dados.get("EBIT / Ativo")));
	    p.setPapelAtivoCirLiq(parse(dados.get("P/Ativ Circ Liq")));
	    p.setRoic(parse(dados.get("ROIC")));
	    p.setRoe(parse(dados.get("ROE")));
	    p.setEvEbitda(parse(dados.get("EV / EBITDA")));
	    p.setLiqCorr(parse(dados.get("Liquidez Corr")));
	    p.setEvEbit(parse(dados.get("EV / EBIT")));
	    p.setDivBrutPatrim(parse(dados.get("Div Br/ Patrim")));
	    p.setCresRec5a(parse(dados.get("Cres. Rec (5a)")));
	    p.setGiroAtivos(parse(dados.get("Giro Ativos")));
	    p.setDivYeld(parse(dados.get("Div. Yield")));

	    // Dados do balanço patrimonial
	    p.setAtivo(parse(dados.get("Ativo")));
	    p.setDepositos(parse(dados.get("Depósitos")));
	    p.setCartCredito(parse(dados.get("Cart. de Crédito")));
	    p.setPatrLiq(parse(dados.get("Patrim. Líq")));

	    // Demonstrativo de Resultados
	    p.setResultIntFin_12m(parse(dados.get("Result Int Financ")));
	    p.setRecServ_12m(parse(dados.get("Rec Serviços")));
	    p.setLucroLiquido_12m(parse(dados.get("Lucro Líquido")));
	    p.setResultIntFin_3m(parse(dados.get("Result Int Financ")));
	    p.setRecServ_3m(parse(dados.get("Rec Serviços")));
	    p.setLucroLiquido_3m(parse(dados.get("Lucro Líquido")));
	}

	private Double parse(String valor) {
	    if (valor == null) {
	    	return 0.0;
	    }
	    try {
	        valor = valor.replace(".", "").replace(",", ".").replace("%", "").replace("-", "0").trim();
	        if (valor.isEmpty()) {
	        	return 0.0;
	        }
	        return Double.parseDouble(valor);
	    } catch (Exception e) {
	        return 0.0;
	    }
	}

	public String retornaValorDaTabela(Element tabela, String campo) {
		Element row = tabela.selectFirst("td:contains(" + campo + ")");
		if (row != null) {
			Element valor = row.nextElementSibling();
			return (valor != null) ? valor.text().replace(',', '.').replace('%', ' ').replace('-', '0') : "0";
		}
		return "0";
	}

	public List<TabelaLinha> get_resultado(){
		List<TabelaLinha> tabela = new ArrayList<>();
		try {
			Document doc = Jsoup.connect("https://www.fundamentus.com.br/resultado.php").get();
			// Selecionar o tbody da tabela com id="resultado"
			Element tbody = doc.selectFirst("table#resultado tbody");
			if (tbody != null) {
				Elements linhas = tbody.select("td");
				for(Element linha: linhas) {
					Elements colunas = linha.select("td");
					if(colunas.size() >= 21) {
						TabelaLinha linhaTabela = new TabelaLinha(
								colunas.get(0).text(), // Papel
								colunas.get(1).text(), // Cotação
								colunas.get(2).text(), // P/L
								colunas.get(3).text(), // P/VP
								colunas.get(4).text(), // PSR
								colunas.get(5).text(), // Div.Yield
								colunas.get(6).text(), // P/Ativo
								colunas.get(7).text(), // P/Cap.Giro
								colunas.get(8).text(), // P/EBIT
								colunas.get(9).text(), // P/Ativ Circ.Liq
								colunas.get(10).text(), // EV/EBIT
								colunas.get(11).text(), // EV/EBITDA
								colunas.get(12).text(), // Mrg Ebit
								colunas.get(13).text(), // Mrg Líq
								colunas.get(14).text(), // Liq Corr
								colunas.get(15).text(), // ROIC
								colunas.get(16).text(), // ROE
								colunas.get(17).text(), // Liq. 2 meses
								colunas.get(18).text(), // Patrim Líq
								colunas.get(19).text(), // Dív Brut/Patrim
								colunas.get(20).text()  // Cresc Rec 5 anos
								);
						tabela.add(linhaTabela);
					}
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return tabela;
	}

	public List<TabelaLinha> list_papel_setor(int setor){
		List<TabelaLinha> tabela = new ArrayList<>();
		try {
			Document doc = Jsoup.connect("https://www.fundamentus.com.br/resultado.php?setor="+setor).get();
			// Selecionar o tbody da tabela com id="resultado"
			Element tbody = doc.selectFirst("table#resultado tbody");
			if (tbody != null) {
				Elements linhas = tbody.select("td");
				for(Element linha: linhas) {
					Elements colunas = linha.select("td");
					if(colunas.size() >= 21) {
						TabelaLinha linhaTabela = new TabelaLinha(
								colunas.get(0).text(), // Papel
								colunas.get(1).text(), // Cotação
								colunas.get(2).text(), // P/L
								colunas.get(3).text(), // P/VP
								colunas.get(4).text(), // PSR
								colunas.get(5).text(), // Div.Yield
								colunas.get(6).text(), // P/Ativo
								colunas.get(7).text(), // P/Cap.Giro
								colunas.get(8).text(), // P/EBIT
								colunas.get(9).text(), // P/Ativ Circ.Liq
								colunas.get(10).text(), // EV/EBIT
								colunas.get(11).text(), // EV/EBITDA
								colunas.get(12).text(), // Mrg Ebit
								colunas.get(13).text(), // Mrg Líq
								colunas.get(14).text(), // Liq Corr
								colunas.get(15).text(), // ROIC
								colunas.get(16).text(), // ROE
								colunas.get(17).text(), // Liq. 2 meses
								colunas.get(18).text(), // Patrim Líq
								colunas.get(19).text(), // Dív Brut/Patrim
								colunas.get(20).text()  // Cresc Rec 5 anos
								);
						tabela.add(linhaTabela);
					}
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return tabela;
	}
}
