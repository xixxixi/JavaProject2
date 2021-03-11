package generics;

public class Product<T, M> {
	private T kind;
	private M moedl;
	public T getKind() {return this.kind;}
	public M getMoedl() {return this.moedl;}
	public void setKind(T kind) {this.kind = kind;}
	public void setMoedl(M moedl) {this.moedl = moedl;}

}
