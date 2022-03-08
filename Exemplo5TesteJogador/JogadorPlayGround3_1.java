package programacaoorientadaaoobjeto;

public interface class JogadorPlayGround3_1 {

	//private String tipoArma;
	
	public void atirar(int qtdDisparos);
	public void recarregar(int recarregar);
	
	public JogadorPlayGround3_1(String tipoArma) {
		this.tipoArma = tipoArma;
	}
	
	
	public String getTipoArma() {
		return tipoArma;
	}
	
	
	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}
	
	
	
}
