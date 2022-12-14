package JavaStreams;


public class Produto {

	private Integer id;

	private String nome;

	private Double valor;

	private String categoria;

	private Boolean temEstoque ;

	public Produto (Integer id, String nome, Double valor, String categoria,Boolean temEstoque) {
		this.id = id;
		this.nome = nome;		
		this.valor = valor;
		this.categoria = categoria;
		this.temEstoque = temEstoque;
		}
	public Integer getId() {
		return id;

	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;

	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;

	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getCategoria() {
		return categoria;

	}
	public void set(String categoria) {
		this.categoria = categoria;
	}
	public Boolean gettemEstoque() {
		return true;

	}
	public String toString() {
		return "Produto [id="+ id +", nome="+ nome+ ", valor=" + valor+ ", categoria=" + categoria +", estoque=" + temEstoque + "]/n";
	}

}
