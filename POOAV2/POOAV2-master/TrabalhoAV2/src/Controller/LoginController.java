package Controller;
public class LoginController {
private  String login="Daniel";
private  String senha="1234";
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public int Login(String login , String senha){
	if(this.login.equals(login) && this.senha.equals(senha))return 1;
	else
	return 0;
	
}
}