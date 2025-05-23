package exercicio8;

public class Status {

	// atributos
	private String ultimaAtualizacao;
	private String horarioDaUltimaAtualizacao;
	private String previsaoDaProximaAtualizacao;
	private Servico servico;
	// construtores sem parâmetros
	public Status() {
		this.ultimaAtualizacao = "";
		this.horarioDaUltimaAtualizacao = "";
		this.previsaoDaProximaAtualizacao = "";
		this.servico = new Servico();
	}
	// construtores com parâmetros
	public Status(String ultimaAtualizacao, String horarioDaUltimaAtualizacao, String PrevisaoDaProximaAtualizacao, Servico servico) {
		this.ultimaAtualizacao = ultimaAtualizacao;
		this.horarioDaUltimaAtualizacao = horarioDaUltimaAtualizacao;
		this.previsaoDaProximaAtualizacao = previsaoDaProximaAtualizacao;
		this.servico = servico;
	}
	// métodos
	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}
	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}
	public String getHorarioDaUltimaAtualizacao() {
		return horarioDaUltimaAtualizacao;
	}
	public void setHorarioDaUltimaAtualizacao(String horarioDaUltimaAtualizacao) {
		this.horarioDaUltimaAtualizacao = horarioDaUltimaAtualizacao;
	}
	public String getPrevisaoDaProximaAtualizacao() {
		return previsaoDaProximaAtualizacao;
	}
	public void setPrevisaoDaProximaAtualizacao(String previsaoDaProximaAtualizacao) {
		this.previsaoDaProximaAtualizacao = previsaoDaProximaAtualizacao;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
}
