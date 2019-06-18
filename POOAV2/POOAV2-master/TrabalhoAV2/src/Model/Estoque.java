package Model;

public class Estoque {
private Produto codigo;
private Produto nome;
private double QTD;
private String fileira;


public Produto getCodigo() {
	return codigo;
}
public void setCodigo(Produto codigo) {
	this.codigo = codigo;
}
public Produto getNome() {
	return nome;
}
public void setNome(Produto nome) {
	this.nome = nome;
}
public double getQTD() {
	return QTD;
}
public void setQTD(double QTD) {
	this.QTD = QTD;
}
public String getFileira() {
	return fileira;
}
public void setFileira(String fileira) {
	this.fileira = fileira;
}

}
