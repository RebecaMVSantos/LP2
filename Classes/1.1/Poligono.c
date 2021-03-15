#include <stdio.h>

typedef struct {
    int x, y;
    int w, h;
    int l;
} Poligono;

void print(Poligono* p) {
    printf("O poligono de tamanho (%d, %d) e que tem  %d lados, está na posicao (%d,%d).\n",
        t->w, t->h, t->l, t->x, t->y);
}

int main() {
    Poligono p1 = {10,21,5,5,4};
    print(&p1);
}