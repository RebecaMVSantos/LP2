
public class PoligonoApp {
    public static void main (String[] args) {
        Poligono p = new Poligono(10,21, 5,4, 5, "preenchido");
        p.print();
    }
}
class Poligono {
    int x, y;
    int w, h;
    int l;
    String t;
    Poligono (int x, int y, int w, int h, int l, String t) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
	this.l= l;
	this.t = t;
    }
    void print () {
        System.out.format("O poligono de %d lados, contorno %s , possui tamanho (%d,%d) e esta na posicao (%d,%d).\n",
            this.l, this.t, this.w, this.h, this.x, this.y);
    }
}