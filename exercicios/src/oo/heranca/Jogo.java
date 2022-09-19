package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi(10,11);
	

		System.out.println(monstro.y + " " + monstro.x);
		System.out.println(heroi.y + " " + heroi.x);
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		System.out.println("Mosntro tem " + monstro.vida);
		System.out.println("Mosntro tem " + heroi.vida);
	}
}
